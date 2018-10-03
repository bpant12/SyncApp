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

package com.syncapp.devtool.model.response;

/**
 * Created by bhupesh pant on 5/12/2018.
 */
public class SyncAppRecord {
    String requestID;
    String url;
    String documentURL;
    Double networkStartTime;
    Double networkEndTime;
    Long encodedDataReceived;
    Long statusCode;
    String error;
    Double loadTime;
    Double domEventFired;
    Double loadEventFired;
    Double loadStartTime;
    Long startTimeStamp;

    public SyncAppRecord() {

    }

    public SyncAppRecord(String requestID, String documentURL, String url, Double networkStartTime, Double networkEndTime, Long encodedDataReceived, Long statusCode, Double loadTime, String error) {
        this.requestID = requestID;
        this.url = url;
        this.documentURL = documentURL;
        this.networkStartTime = networkStartTime;
        this.networkEndTime = networkEndTime;
        this.encodedDataReceived = encodedDataReceived;
        this.statusCode = statusCode;
        this.error = error;
        this.loadTime = loadTime;

    }

    public SyncAppRecord(String requestID, String documentURL, String url, Double networkStartTime) {
        this.requestID = requestID;
        this.url = url;
        this.documentURL = documentURL;
        this.networkStartTime = networkStartTime;
    }

    public Long getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public Double getLoadStartTime() {
        return loadStartTime;
    }

    public void setLoadStartTime(Double loadStartTime) {
        this.loadStartTime = loadStartTime;
    }

    public Double getDomEventFired() {
        return domEventFired;
    }

    public void setDomEventFired(Double domEventFired) {
        this.domEventFired = domEventFired;
    }

    public Double getLoadEventFired() {
        return loadEventFired;
    }

    public void setLoadEventFired(Double loadEventFired) {
        this.loadEventFired = loadEventFired;
    }

    public Double getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Double loadTime) {
        this.loadTime = loadTime;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public String getDocumentURL() {
        return documentURL;
    }

    public void setDocumentURL(String documentURL) {
        this.documentURL = documentURL;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getNetworkStartTime() {
        return networkStartTime;
    }

    public void setNetworkStartTime(Double networkStartTime) {
        this.networkStartTime = networkStartTime;
    }

    public Double getNetworkEndTime() {
        return networkEndTime;
    }

    public void setNetworkEndTime(Double networkEndTime) {
        this.networkEndTime = networkEndTime;
    }

    public Long getEncodedDataReceived() {
        return encodedDataReceived;
    }

    public void setEncodedDataReceived(Long encodedDataReceived) {
        this.encodedDataReceived = encodedDataReceived;
    }
}