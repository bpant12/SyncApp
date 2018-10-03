/*
 *    Copyright 2018 Bhupesh Pant
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.syncapp.util.devtool;

import com.google.common.collect.Lists;
import com.syncapp.coreapi.model.request.MoreDetail;
import com.syncapp.coreapi.model.request.PerformanceData;
import com.syncapp.coreapi.model.request.SyncAppPerformanceConverter;
import com.syncapp.devtool.model.response.Network;
import com.syncapp.devtool.model.response.SyncAppRecord;
import com.syncapp.util.config.ConfigHolder;
import com.syncapp.util.http.HTTPHelper;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.*;

/**
 * Created by bhupesh pant on 5/22/2018.
 */
public class SyncappUtil {

    DevtoolAnalyzer devtoolAnalyzer =new DevtoolAnalyzer();

    private WebDriver driver;

    HTTPHelper httpHelper =new HTTPHelper();
    public void startTracking(ThreadLocal<WebDriver>  driver){
        this.driver = driver.get();
        devtoolAnalyzer.startDevtoolTracking(this.driver);
    }

    public Map<String, SyncAppRecord> endTracking(String appId,String module,String coordinator) throws IOException{
        Map<String,SyncAppRecord> tracedData = devtoolAnalyzer.traceData(driver);
        try {
            this._submitTrackedData(tracedData,appId,coordinator,module,driver.getCurrentUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tracedData;
    }

    public Map<String, SyncAppRecord> endTracking(WebDriver driver,String appId,String userId,String module,String url) throws IOException{
        Map<String,SyncAppRecord> tracedData = devtoolAnalyzer.traceData(driver);
        try {
            this._submitTrackedData(tracedData,appId,userId,module,url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tracedData;
    }

    private void setMoreDEtails(){

    }

    public void _submitTrackedData(Map<String,SyncAppRecord> tracedDataMap,String appId,String userId,String module,String currentUrl) throws Exception {
        PerformanceData performanceData = new PerformanceData();
        Set<String> traceDataKey = tracedDataMap.keySet();
        SyncAppRecord pageRecord = tracedDataMap.get("page_data");
        System.out.println("Page load For-->"+currentUrl+" is:"+(pageRecord.getLoadEventFired()-pageRecord.getLoadStartTime()));
        System.out.println("DOM load For-->"+currentUrl+" is:"+(pageRecord.getDomEventFired()-pageRecord.getLoadStartTime()));
        performanceData.setTotalTime(pageRecord.getLoadEventFired()-pageRecord.getLoadStartTime());
        performanceData.setAppID(appId);

        if(StringUtils.isBlank(currentUrl)) {
            performanceData.setURL(tracedDataMap.get(traceDataKey.iterator().next()).getDocumentURL());
        }else{
            performanceData.setURL(currentUrl);
        }
        performanceData.setCreatedOn(pageRecord.getStartTimeStamp());
        performanceData.setCount(0l);
        performanceData.setModule(module);
        performanceData.setStatusCode(200l);
        performanceData.setCodeMessage("OK");
        performanceData.setServer("server");
        performanceData.setUserID(userId);
        List<MoreDetail> moreDetailList = new ArrayList<>();
        //TODO Need to delete
        Set<String> docURLValues = new HashSet<>();


        List<String> otherUrlsWithStatus = new ArrayList<>();
        for (String key:traceDataKey
             ) {
         //   if(StringUtils.equalsIgnoreCase(currentUrl,tracedDataMap.get(key).getDocumentURL())){
                //performanceData.setURL(tracedDataMap.get(key).getDocumentURL());
           // }
           // else{
             //   continue;
          //  }
            if(tracedDataMap.get(key).getLoadTime()==null || !StringUtils.startsWithAny(tracedDataMap.get(key).getUrl(),"http://","https://")  )
                continue;
            MoreDetail moreDetail = new MoreDetail();
            System.out.println(tracedDataMap.get(key).getLoadTime().longValue());
            moreDetail.setOtherAPITime(tracedDataMap.get(key).getLoadTime().longValue());
            System.out.println(tracedDataMap.get(key).getError());
            moreDetail.setOtherCodeMessage(tracedDataMap.get(key).getError());
            System.out.println(tracedDataMap.get(key).getStatusCode());
            moreDetail.setOtherStatusCode(tracedDataMap.get(key).getStatusCode());
            System.out.println(tracedDataMap.get(key).getUrl());
            moreDetail.setOtherURL(tracedDataMap.get(key).getUrl());
            //TODO Need to delete
            docURLValues.add(tracedDataMap.get(key).getDocumentURL());
            moreDetailList.add(moreDetail);


            ////////////////////////////
            ////Adding other urls with their status////////
            ///////////////////////////

            otherUrlsWithStatus.add(tracedDataMap.get(key).getStatusCode()+"<==>"+tracedDataMap.get(key).getUrl());
        }
        //Sort other urls list
        Collections.sort(otherUrlsWithStatus);
        Collections.reverse(otherUrlsWithStatus);
        //Set Other Urls info in object
        performanceData.setOtherStatusCode(Long.parseLong(StringUtils.split(otherUrlsWithStatus.get(0),"<==>")[0]));
        performanceData.setOtherURL(StringUtils.split(otherUrlsWithStatus.get(0),"<==>")[1]);
        otherUrlsWithStatus.clear();
        performanceData.setMoreDetail( moreDetailList.toArray(new MoreDetail[moreDetailList.size()]));
        //TODO Need to delete
        System.out.println( "ARRAY VALUE:"+docURLValues.toString());
        System.out.println("URL:"+ConfigHolder.getInstance().getHostName());
        httpHelper.execute(ConfigHolder.getInstance().getHostName()+"/api/networkData","POST",new HashMap<String,String>(), SyncAppPerformanceConverter.toJsonString(performanceData),new HashMap<String,String>());
    }
}
