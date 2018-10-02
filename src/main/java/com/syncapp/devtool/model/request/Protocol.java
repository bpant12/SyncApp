package com.syncapp.devtool.model.request;

/**
 * Created by bhupesh pant on 5/12/2018.
 */
public interface  Protocol{
    String Network_RequestWillBeSent = "Network.requestWillBeSent";
    String Network_ResponseReceived = "Network.responseReceived";
    String Network_DataReceived = "Network.dataReceived";
    String Network_LoadingFinished = "Network.loadingFinished";
    String Network_ResourceChangedPriority =  "Network.resourceChangedPriority";
    String Network_LoadingFailed = "Network.loadingFailed";
    String Network_RequestServedFromCache = "Network.requestServedFromCache";
    String Page_LoadEventFired = "Page.loadEventFired";
    String Page_DomContentEventFired = "Page.domContentEventFired";
    String Page_FrameStartedLoading = "Page.frameStartedLoading";
    String Page_FrameNavigated = "Page.frameNavigated";
    String Page_FrameStoppedLoading = "Page.frameStoppedLoading";
    String Page_FrameAttached = "Page.frameAttached";
    String Page_FrameDetached = "Page.frameDetached";
    String Page_FrameClearedScheduledNavigation = "Page.frameClearedScheduledNavigation";
    String Page_FrameScheduledNavigation = "Page.frameScheduledNavigation";
}
