package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
public class Headers {
    private String upgradeInsecureRequests;
    private String userAgent;
    private String xDevToolsEmulateNetworkConditionsClientID;
    private String referer;
    private String origin;
    private String accept;
    private String contentType;

    @JsonProperty("Upgrade-Insecure-Requests")
    public String getUpgradeInsecureRequests() { return upgradeInsecureRequests; }
    @JsonProperty("Upgrade-Insecure-Requests")
    public void setUpgradeInsecureRequests(String value) { this.upgradeInsecureRequests = value; }

    @JsonProperty("User-Agent")
    public String getUserAgent() { return userAgent; }
    @JsonProperty("User-Agent")
    public void setUserAgent(String value) { this.userAgent = value; }

    @JsonProperty("X-DevTools-Emulate-Network-Conditions-Client-Id")
    public String getXDevToolsEmulateNetworkConditionsClientID() { return xDevToolsEmulateNetworkConditionsClientID; }
    @JsonProperty("X-DevTools-Emulate-Network-Conditions-Client-Id")
    public void setXDevToolsEmulateNetworkConditionsClientID(String value) { this.xDevToolsEmulateNetworkConditionsClientID = value; }

    @JsonProperty("Referer")
    public String getReferer() { return referer; }
    @JsonProperty("Referer")
    public void setReferer(String value) { this.referer = value; }

    @JsonProperty("Origin")
    public String getOrigin() { return origin; }
    @JsonProperty("Origin")
    public void setOrigin(String value) { this.origin = value; }

    @JsonProperty("Accept")
    public String getAccept() { return accept; }
    @JsonProperty("Accept")
    public void setAccept(String value) { this.accept = value; }

    @JsonProperty("Content-Type")
    public String getContentType() { return contentType; }
    @JsonProperty("Content-Type")
    public void setContentType(String value) { this.contentType = value; }
}
