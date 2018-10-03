package com.syncapp.devtool.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by bhupesh pant on 5/13/2018.
 */
public class SyncAppRecords {
    private String domEventFired;
    private String loadEventFired;
    private Network[] network;

    @JsonProperty("domEventFired")
    public String getDOMEventFired() { return domEventFired; }
    @JsonProperty("domEventFired")
    public void setDOMEventFired(String value) { this.domEventFired = value; }

    @JsonProperty("loadEventFired")
    public String getLoadEventFired() { return loadEventFired; }
    @JsonProperty("loadEventFired")
    public void setLoadEventFired(String value) { this.loadEventFired = value; }

    @JsonProperty("network")
    public Network[] getNetwork() { return network; }
    @JsonProperty("network")
    public void setNetwork(Network[] value) { this.network = value; }
}

