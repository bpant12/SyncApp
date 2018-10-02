package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {
    private Map<String,Object> headers;
    private String initialPriority;
    private String method;
    private String mixedContentType;
    private String referrerPolicy;
    private String url;
    private Boolean hasPostData;
    private String postData;
    private Boolean isLinkPreload;

    @JsonProperty("headers")
    public Map<String,Object> getHeaders() { return headers; }
    @JsonProperty("headers")
    public void setHeaders(Map<String,Object> value) { this.headers = value; }

    @JsonProperty("initialPriority")
    public String getInitialPriority() { return initialPriority; }
    @JsonProperty("initialPriority")
    public void setInitialPriority(String value) { this.initialPriority = value; }

    @JsonProperty("method")
    public String getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(String value) { this.method = value; }

    @JsonProperty("mixedContentType")
    public String getMixedContentType() { return mixedContentType; }
    @JsonProperty("mixedContentType")
    public void setMixedContentType(String value) { this.mixedContentType = value; }

    @JsonProperty("referrerPolicy")
    public String getReferrerPolicy() { return referrerPolicy; }
    @JsonProperty("referrerPolicy")
    public void setReferrerPolicy(String value) { this.referrerPolicy = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("hasPostData")
    public Boolean getHasPostData() { return hasPostData; }
    @JsonProperty("hasPostData")
    public void setHasPostData(Boolean value) { this.hasPostData = value; }

    @JsonProperty("postData")
    public String getPostData() { return postData; }
    @JsonProperty("postData")
    public void setPostData(String value) { this.postData = value; }

    @JsonProperty("isLinkPreload")
    public Boolean getIsLinkPreload() { return isLinkPreload; }
    @JsonProperty("isLinkPreload")
    public void setIsLinkPreload(Boolean value) { this.isLinkPreload = value; }
}
