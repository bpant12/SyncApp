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
