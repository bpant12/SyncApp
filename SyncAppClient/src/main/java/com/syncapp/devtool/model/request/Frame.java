package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
public class Frame {
    private String id;
    private String loaderID;
    private String mimeType;
    private String name;
    private String parentID;
    private String securityOrigin;
    private String url;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("loaderId")
    public String getLoaderID() { return loaderID; }
    @JsonProperty("loaderId")
    public void setLoaderID(String value) { this.loaderID = value; }

    @JsonProperty("mimeType")
    public String getMIMEType() { return mimeType; }
    @JsonProperty("mimeType")
    public void setMIMEType(String value) { this.mimeType = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("parentId")
    public String getParentID() { return parentID; }
    @JsonProperty("parentId")
    public void setParentID(String value) { this.parentID = value; }

    @JsonProperty("securityOrigin")
    public String getSecurityOrigin() { return securityOrigin; }
    @JsonProperty("securityOrigin")
    public void setSecurityOrigin(String value) { this.securityOrigin = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
