package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Params {
    private String frameID;
    private String parentFrameID;
    private Map<String,Object> stack;
    private Map<String,Object> frame;
    private String documentURL;
    private Initiator initiator;
    private String loaderID;
    private Request request;
    private String requestID;
    private Double timestamp;
    private String type;
    private Double wallTime;
    private Response response;
    private Long dataLength;
    private Long encodedDataLength;
    private Boolean blockedCrossSiteDocument;
    private Map<String,Object> redirectResponse;
    private String newPriority;
    private Long delay;
    private String reason;
    private String url;
    private Boolean canceled;
    private String errorText;

    @JsonProperty("frameId")
    public String getFrameID() { return frameID; }
    @JsonProperty("frameId")
    public void setFrameID(String value) { this.frameID = value; }

    @JsonProperty("parentFrameId")
    public String getParentFrameID() { return parentFrameID; }
    @JsonProperty("parentFrameId")
    public void setParentFrameID(String value) { this.parentFrameID = value; }

    @JsonProperty("stack")
    public Map<String,Object> getStack() { return stack; }
    @JsonProperty("stack")
    public void setStack(Map<String,Object> value) { this.stack = value; }

    @JsonProperty("frame")
    public  Map<String,Object> getFrame() { return frame; }
    @JsonProperty("frame")
    public void setFrame( Map<String,Object> value) { this.frame = value; }

    @JsonProperty("documentURL")
    public String getDocumentURL() { return documentURL; }
    @JsonProperty("documentURL")
    public void setDocumentURL(String value) { this.documentURL = value; }

    @JsonProperty("initiator")
    public Initiator getInitiator() { return initiator; }
    @JsonProperty("initiator")
    public void setInitiator(Initiator value) { this.initiator = value; }

    @JsonProperty("loaderId")
    public String getLoaderID() { return loaderID; }
    @JsonProperty("loaderId")
    public void setLoaderID(String value) { this.loaderID = value; }

    @JsonProperty("request")
    public Request getRequest() { return request; }
    @JsonProperty("request")
    public void setRequest(Request value) { this.request = value; }

    @JsonProperty("requestId")
    public String getRequestID() { return requestID; }
    @JsonProperty("requestId")
    public void setRequestID(String value) { this.requestID = value; }

    @JsonProperty("timestamp")
    public Double getTimestamp() { return timestamp; }
    @JsonProperty("timestamp")
    public void setTimestamp(Double value) { this.timestamp = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("wallTime")
    public Double getWallTime() { return wallTime; }
    @JsonProperty("wallTime")
    public void setWallTime(Double value) { this.wallTime = value; }

    @JsonProperty("response")
    public Response getResponse() { return response; }
    @JsonProperty("response")
    public void setResponse(Response value) { this.response = value; }

    @JsonProperty("dataLength")
    public Long getDataLength() { return dataLength; }
    @JsonProperty("dataLength")
    public void setDataLength(Long value) { this.dataLength = value; }

    @JsonProperty("encodedDataLength")
    public Long getEncodedDataLength() { return encodedDataLength; }
    @JsonProperty("encodedDataLength")
    public void setEncodedDataLength(Long value) { this.encodedDataLength = value; }

    @JsonProperty("blockedCrossSiteDocument")
    public Boolean getBlockedCrossSiteDocument() { return blockedCrossSiteDocument; }
    @JsonProperty("blockedCrossSiteDocument")
    public void setBlockedCrossSiteDocument(Boolean value) { this.blockedCrossSiteDocument = value; }

    @JsonProperty("redirectResponse")
    public Map<String,Object>  getRedirectResponse() { return redirectResponse; }
    @JsonProperty("redirectResponse")
    public void setRedirectResponse(Map<String,Object>  value) { this.redirectResponse = value; }

    @JsonProperty("newPriority")
    public String getNewPriority() { return newPriority; }
    @JsonProperty("newPriority")
    public void setNewPriority(String value) { this.newPriority = value; }

    @JsonProperty("delay")
    public Long getDelay() { return delay; }
    @JsonProperty("delay")
    public void setDelay(Long value) { this.delay = value; }

    @JsonProperty("reason")
    public String getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(String value) { this.reason = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("canceled")
    public Boolean getCanceled() { return canceled; }
    @JsonProperty("canceled")
    public void setCanceled(Boolean value) { this.canceled = value; }

    @JsonProperty("errorText")
    public String getErrorText() { return errorText; }
    @JsonProperty("errorText")
    public void setErrorText(String value) { this.errorText = value; }
}
