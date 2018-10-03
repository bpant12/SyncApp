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

