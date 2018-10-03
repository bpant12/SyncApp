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
