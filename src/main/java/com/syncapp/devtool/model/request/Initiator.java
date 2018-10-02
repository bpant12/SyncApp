package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Initiator {
    private String type;
    private Long lineNumber;
    private String url;
    private Map<String,Object> stack;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("lineNumber")
    public Long getLineNumber() { return lineNumber; }
    @JsonProperty("lineNumber")
    public void setLineNumber(Long value) { this.lineNumber = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("stack")
    public Map<String,Object>  getStack() { return stack; }
    @JsonProperty("stack")
    public void setStack(Map<String,Object>  value) { this.stack = value; }
}
