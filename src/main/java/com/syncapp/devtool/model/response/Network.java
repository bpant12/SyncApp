package com.syncapp.devtool.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by bhupesh pant on 5/13/2018.
 */
public class Network {
    private String requestID;
    private String url;
    private String documentURL;
    private String networkStartTime;
    private String networkEndTime;
    private String encodedDataReceived;
    private String statusCode;
    private String error;
    private String loadTime;

    @JsonProperty("requestID")
    public String getRequestID() { return requestID; }
    @JsonProperty("requestID")
    public void setRequestID(String value) { this.requestID = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("documentURL")
    public String getDocumentURL() { return documentURL; }
    @JsonProperty("documentURL")
    public void setDocumentURL(String value) { this.documentURL = value; }

    @JsonProperty("networkStartTime")
    public String getNetworkStartTime() { return networkStartTime; }
    @JsonProperty("networkStartTime")
    public void setNetworkStartTime(String value) { this.networkStartTime = value; }

    @JsonProperty("networkEndTime")
    public String getNetworkEndTime() { return networkEndTime; }
    @JsonProperty("networkEndTime")
    public void setNetworkEndTime(String value) { this.networkEndTime = value; }

    @JsonProperty("encodedDataReceived")
    public String getEncodedDataReceived() { return encodedDataReceived; }
    @JsonProperty("encodedDataReceived")
    public void setEncodedDataReceived(String value) { this.encodedDataReceived = value; }

    @JsonProperty("statusCode")
    public String getStatusCode() { return statusCode; }
    @JsonProperty("statusCode")
    public void setStatusCode(String value) { this.statusCode = value; }

    @JsonProperty("error")
    public String getError() { return error; }
    @JsonProperty("error")
    public void setError(String value) { this.error = value; }

    @JsonProperty("loadTime")
    public String getLoadTime() { return loadTime; }
    @JsonProperty("loadTime")
    public void setLoadTime(String value) { this.loadTime = value; }
}