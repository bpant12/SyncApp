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

public class MoreDetail {
    private String otherURL;
    private Long otherAPITime;
    private Long otherStatusCode;
    private String otherCodeMessage;

    @JsonProperty("other_url")
    public String getOtherURL() { return otherURL; }
    @JsonProperty("other_url")
    public void setOtherURL(String value) { this.otherURL = value; }

    @JsonProperty("other_api_time")
    public Long getOtherAPITime() { return otherAPITime; }
    @JsonProperty("other_api_time")
    public void setOtherAPITime(Long value) { this.otherAPITime = value; }

    @JsonProperty("other_status_code")
    public Long getOtherStatusCode() { return otherStatusCode; }
    @JsonProperty("other_status_code")
    public void setOtherStatusCode(Long value) { this.otherStatusCode = value; }

    @JsonProperty("other_code_message")
    public String getOtherCodeMessage() { return otherCodeMessage; }
    @JsonProperty("other_code_message")
    public void setOtherCodeMessage(String value) { this.otherCodeMessage = value; }
}
