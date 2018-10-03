package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
public class Stack {
    private CallFrame[] callFrames;

    @JsonProperty("callFrames")
    public CallFrame[] getCallFrames() { return callFrames; }
    @JsonProperty("callFrames")
    public void setCallFrames(CallFrame[] value) { this.callFrames = value; }
}
