package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
public class DevToolInfo {
    private Message message;
    private String webview;

    @JsonProperty("message")
    public Message getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(Message value) { this.message = value; }

    @JsonProperty("webview")
    public String getWebview() { return webview; }
    @JsonProperty("webview")
    public void setWebview(String value) { this.webview = value; }
}
