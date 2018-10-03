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
