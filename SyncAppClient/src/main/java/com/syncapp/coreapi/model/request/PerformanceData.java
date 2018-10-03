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

package com.syncapp.coreapi.model.request;

/**
 * Created by bhupesh pant on 5/15/2018.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerformanceData {
    private String module;
    private String url;
    private Long count;
    private Double totalTime;
    private Long statusCode;
    private String codeMessage;
    private String userID;
    private Long createdOn;
    private String appID;
    private MoreDetail[] moreDetail;
    private Long otherStatusCode;
    private String otherURL;
    private String server;

    @JsonProperty("module")
    public String getModule() { return module; }
    @JsonProperty("module")
    public void setModule(String value) { this.module = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("count")
    public Long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(Long value) { this.count = value; }

    @JsonProperty("total_time")
    public Double getTotalTime() { return totalTime; }
    @JsonProperty("total_time")
    public void setTotalTime(Double value) { this.totalTime = value; }

    @JsonProperty("status_code")
    public Long getStatusCode() { return statusCode; }
    @JsonProperty("status_code")
    public void setStatusCode(Long value) { this.statusCode = value; }

    @JsonProperty("code_message")
    public String getCodeMessage() { return codeMessage; }
    @JsonProperty("code_message")
    public void setCodeMessage(String value) { this.codeMessage = value; }

    @JsonProperty("user_id")
    public String getUserID() { return userID; }
    @JsonProperty("user_id")
    public void setUserID(String value) { this.userID = value; }

    @JsonProperty("created_on")
    public Long getCreatedOn() { return createdOn; }
    @JsonProperty("created_on")
    public void setCreatedOn(Long value) { this.createdOn = value; }

    @JsonProperty("app_id")
    public String getAppID() { return appID; }
    @JsonProperty("app_id")
    public void setAppID(String value) { this.appID = value; }

    @JsonProperty("more_detail")
    public MoreDetail[] getMoreDetail() { return moreDetail; }
    @JsonProperty("more_detail")
    public void setMoreDetail(MoreDetail[] value) { this.moreDetail = value; }

    @JsonProperty("other_status_code")
    public Long getOtherStatusCode() { return otherStatusCode; }
    @JsonProperty("other_status_code")
    public void setOtherStatusCode(Long value) { this.otherStatusCode = value; }

    @JsonProperty("other_url")
    public String getOtherURL() { return otherURL; }
    @JsonProperty("other_url")
    public void setOtherURL(String value) { this.otherURL = value; }

    @JsonProperty("server")
    public String getServer() { return server; }
    @JsonProperty("server")
    public void setServer(String value) { this.server = value; }
}