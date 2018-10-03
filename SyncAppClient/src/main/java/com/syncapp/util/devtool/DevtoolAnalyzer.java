package com.syncapp.util.devtool;

import com.syncapp.devtool.model.request.Converter;
import com.syncapp.devtool.model.request.DevToolInfo;
import com.syncapp.devtool.model.request.Params;
import com.syncapp.devtool.model.response.SyncAppRecord;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.IOException;
import java.util.*;

import static com.syncapp.devtool.model.request.Protocol.*;

/**
 * Created by bhupesh pant on 5/13/2018.
 */
public class DevtoolAnalyzer {

    Double loadStartTime;
    Long stratTimestamp;
    String Page_Data = "page_data";


    public Map<String, SyncAppRecord> getSyncAppRecordMap(String jsonString) throws IOException {
        DevToolInfo[] devToolInfos = Converter.fromJsonString(jsonString);
        Map<String, SyncAppRecord> dataMap = new HashMap<>();
        DevToolInfo[] missedDevToolInfos = this.processDevtool(devToolInfos, dataMap);
        this.processDevtool(missedDevToolInfos, dataMap);
        return dataMap;
    }

    private List<LogEntry> getLogEntries(WebDriver driver){
        List<LogEntry> entries = driver.manage().logs().get(LogType.PERFORMANCE).getAll();
        List<LogEntry> allEntries = new ArrayList<>();
        allEntries = entries;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entries = driver.manage().logs().get(LogType.PERFORMANCE).getAll();
        while (entries.size()>0){
            ListUtils.sum(allEntries,entries);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            entries = driver.manage().logs().get(LogType.PERFORMANCE).getAll();
        }
        return allEntries;
    }

    public  Map<String, SyncAppRecord> traceData(WebDriver driver) throws IOException {
        List<LogEntry> entries =  this.getLogEntries(driver);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        System.out.println("Log Entry Size:"+entries.size());
        for (LogEntry entry : entries
                ) {

            stringBuffer.append(entry.getMessage() + ",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1).append("]");
        String jsonString = stringBuffer.toString();
        System.out.println(jsonString);
        return this.getSyncAppRecordMap(jsonString);
    }


    public void startDevtoolTracking(WebDriver driver){
        driver.manage().logs().get(LogType.PERFORMANCE).getAll();
        loadStartTime = System.nanoTime() / 1000000000.0;
        stratTimestamp = new Date().getTime();
        System.out.println("Monotonic time:"+loadStartTime);
        System.out.println("Timestamp:"+stratTimestamp);
    }

    private DevToolInfo[] processDevtool(DevToolInfo[] devToolInfos, Map<String, SyncAppRecord> dataMap) {
        Set<DevToolInfo> missedDevtoolInfo = new HashSet<>();
        for (DevToolInfo devToolInfo : devToolInfos
                ) {
            String method = devToolInfo.getMessage().getMethod();
            Params params = devToolInfo.getMessage().getParams();
            switch (method) {
                case Network_RequestWillBeSent:
                    SyncAppRecord syncAppRecord = new SyncAppRecord(params.getRequestID(), params.getDocumentURL(), params.getURL(), params.getTimestamp());
                    dataMap.put(params.getRequestID(), syncAppRecord);
                    break;
                case Network_LoadingFinished:
                    syncAppRecord = dataMap.get(params.getRequestID());
                    if (syncAppRecord == null) {
                        missedDevtoolInfo.add(devToolInfo);
                        continue;
                    }
                    syncAppRecord.setLoadTime(params.getTimestamp() - syncAppRecord.getNetworkStartTime());
                    break;
                case Network_ResponseReceived:
                    syncAppRecord = dataMap.get(params.getRequestID());
                    /*String type = params.getType();
                    if(!StringUtils.equalsIgnoreCase(type,"xhr")){
                        dataMap.remove(params.getRequestID());
                        continue;
                    }*/
                    if (syncAppRecord == null) {
                        missedDevtoolInfo.add(devToolInfo);
                        continue;
                    }
                    syncAppRecord.setStatusCode(params.getResponse().getStatus());
                    syncAppRecord.setUrl(params.getResponse().getURL());
                    break;
                case Network_DataReceived:
                    syncAppRecord = dataMap.get(params.getRequestID());
                    if (syncAppRecord == null) {
                        missedDevtoolInfo.add(devToolInfo);
                        continue;
                    }
                    syncAppRecord.setEncodedDataReceived(params.getEncodedDataLength());
                    break;
                case Network_ResourceChangedPriority:
                    break;
                case Network_LoadingFailed:
                    syncAppRecord = dataMap.get(params.getRequestID());
                    if (syncAppRecord == null) {
                        missedDevtoolInfo.add(devToolInfo);
                        continue;
                    }
                    syncAppRecord.setError(params.getErrorText());
                    syncAppRecord.setStatusCode(-1l);
                    break;
                case Network_RequestServedFromCache:
                    break;
                case Page_LoadEventFired:
                    syncAppRecord = dataMap.get(Page_Data);
                    if (syncAppRecord == null) {
                        syncAppRecord = new SyncAppRecord();
                        dataMap.put(Page_Data, syncAppRecord);
                    }
                    syncAppRecord.setStartTimeStamp(stratTimestamp);
                    syncAppRecord.setLoadEventFired(params.getTimestamp());
                    syncAppRecord.setLoadStartTime(loadStartTime);
                    break;
                case Page_DomContentEventFired:
                    syncAppRecord = dataMap.get(Page_Data);
                    if (syncAppRecord == null) {
                        syncAppRecord = new SyncAppRecord();
                        dataMap.put(Page_Data, syncAppRecord);
                    }
                    syncAppRecord.setStartTimeStamp(stratTimestamp);
                    syncAppRecord.setDomEventFired(params.getTimestamp());
                    syncAppRecord.setLoadStartTime(loadStartTime);
                    break;
                case Page_FrameStartedLoading:
                    break;
                case Page_FrameNavigated:
                    break;
                case Page_FrameStoppedLoading:
                    break;
                case Page_FrameAttached:
                    break;
                case Page_FrameDetached:
                    break;
                case Page_FrameClearedScheduledNavigation:
                    break;
                case Page_FrameScheduledNavigation:
                    break;

            }
        }
        return missedDevtoolInfo.toArray(new DevToolInfo[missedDevtoolInfo.size()]);
    }


    private boolean filter(String filterValue) {
        if (StringUtils.equalsIgnoreCase(filterValue, "xhr")) {
            return true;
        } else {
            return false;
        }

    }

    private Double getTotalTime(Map<String, SyncAppRecord> recordMap) {
        Set<String> keys = recordMap.keySet();
        Double totalTime = 0d;
        for (String key : keys
                ) {
            Double apiTime = recordMap.get(key).getLoadTime() == null ? 0d : recordMap.get(key).getLoadTime();
            totalTime = totalTime + apiTime;
        }
        return totalTime * 1000;
    }
}
