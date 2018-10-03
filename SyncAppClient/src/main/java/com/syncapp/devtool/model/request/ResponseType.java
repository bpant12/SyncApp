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
public interface ResponseType {
    String NULL=null;
    String SCRIPT="Script";
    String XHR = "XHR";
    String DOCUMENT="Document";
    String IMAGE = "Image";
    String STYLESHEET = "Stylesheet";
    String FONT="Font";
    String OTHER = "Other";
}
