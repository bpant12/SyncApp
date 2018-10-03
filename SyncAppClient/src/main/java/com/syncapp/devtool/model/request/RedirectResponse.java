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

package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
public class RedirectResponse {
    private Long connectionID;
    private Boolean connectionReused;
    private Long encodedDataLength;
    private Boolean fromDiskCache;
    private Boolean fromServiceWorker;
    private Map<String, String> headers;
    private String headersText;
    private String mimeType;
    private String protocol;
    private String remoteIPAddress;
    private Long remotePort;
    private String securityState;
    private Long status;
    private String statusText;
    private Map<String, Double> timing;
    private String url;
    private Map<String, String> requestHeaders;
    private Map<String, Object>  securityDetails;

    @JsonProperty("connectionId")
    public Long getConnectionID() { return connectionID; }
    @JsonProperty("connectionId")
    public void setConnectionID(Long value) { this.connectionID = value; }

    @JsonProperty("connectionReused")
    public Boolean getConnectionReused() { return connectionReused; }
    @JsonProperty("connectionReused")
    public void setConnectionReused(Boolean value) { this.connectionReused = value; }

    @JsonProperty("encodedDataLength")
    public Long getEncodedDataLength() { return encodedDataLength; }
    @JsonProperty("encodedDataLength")
    public void setEncodedDataLength(Long value) { this.encodedDataLength = value; }

    @JsonProperty("fromDiskCache")
    public Boolean getFromDiskCache() { return fromDiskCache; }
    @JsonProperty("fromDiskCache")
    public void setFromDiskCache(Boolean value) { this.fromDiskCache = value; }

    @JsonProperty("fromServiceWorker")
    public Boolean getFromServiceWorker() { return fromServiceWorker; }
    @JsonProperty("fromServiceWorker")
    public void setFromServiceWorker(Boolean value) { this.fromServiceWorker = value; }

    @JsonProperty("headers")
    public Map<String, String> getHeaders() { return headers; }
    @JsonProperty("headers")
    public void setHeaders(Map<String, String> value) { this.headers = value; }

    @JsonProperty("headersText")
    public String getHeadersText() { return headersText; }
    @JsonProperty("headersText")
    public void setHeadersText(String value) { this.headersText = value; }

    @JsonProperty("mimeType")
    public String getMIMEType() { return mimeType; }
    @JsonProperty("mimeType")
    public void setMIMEType(String value) { this.mimeType = value; }

    @JsonProperty("protocol")
    public String getProtocol() { return protocol; }
    @JsonProperty("protocol")
    public void setProtocol(String value) { this.protocol = value; }

    @JsonProperty("remoteIPAddress")
    public String getRemoteIPAddress() { return remoteIPAddress; }
    @JsonProperty("remoteIPAddress")
    public void setRemoteIPAddress(String value) { this.remoteIPAddress = value; }

    @JsonProperty("remotePort")
    public Long getRemotePort() { return remotePort; }
    @JsonProperty("remotePort")
    public void setRemotePort(Long value) { this.remotePort = value; }

    @JsonProperty("securityState")
    public String getSecurityState() { return securityState; }
    @JsonProperty("securityState")
    public void setSecurityState(String value) { this.securityState = value; }

    @JsonProperty("status")
    public Long getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Long value) { this.status = value; }

    @JsonProperty("statusText")
    public String getStatusText() { return statusText; }
    @JsonProperty("statusText")
    public void setStatusText(String value) { this.statusText = value; }

    @JsonProperty("timing")
    public Map<String, Double> getTiming() { return timing; }
    @JsonProperty("timing")
    public void setTiming(Map<String, Double> value) { this.timing = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("requestHeaders")
    public Map<String, String> getRequestHeaders() { return requestHeaders; }
    @JsonProperty("requestHeaders")
    public void setRequestHeaders(Map<String, String> value) { this.requestHeaders = value; }

    @JsonProperty("securityDetails")
    public Map<String, Object>  getSecurityDetails() { return securityDetails; }
    @JsonProperty("securityDetails")
    public void setSecurityDetails(Map<String, Object>  value) { this.securityDetails = value; }
}
