package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
public class CallFrame {
    private Long columnNumber;
    private String functionName;
    private Long lineNumber;
    private String scriptID;
    private String url;

    @JsonProperty("columnNumber")
    public Long getColumnNumber() { return columnNumber; }
    @JsonProperty("columnNumber")
    public void setColumnNumber(Long value) { this.columnNumber = value; }

    @JsonProperty("functionName")
    public String getFunctionName() { return functionName; }
    @JsonProperty("functionName")
    public void setFunctionName(String value) { this.functionName = value; }

    @JsonProperty("lineNumber")
    public Long getLineNumber() { return lineNumber; }
    @JsonProperty("lineNumber")
    public void setLineNumber(Long value) { this.lineNumber = value; }

    @JsonProperty("scriptId")
    public String getScriptID() { return scriptID; }
    @JsonProperty("scriptId")
    public void setScriptID(String value) { this.scriptID = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
