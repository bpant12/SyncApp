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

package com.syncapp.util.config;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.io.IOException;

/**
 * Created by bhupesh pant on 10/2/2018.
 */
public class ConfigHolder {


    private static ConfigHolder objConfigHolder;

    private ReadContext jsonContext;


    String env;

    public String getEnv() {
        env = System.getProperty("env");
        if(StringUtils.isBlank(env)){
            env = "local";
        }
        return env;
    }

    private  ConfigHolder() throws IOException {
        jsonContext = JsonPath.parse(new File("target"+File.separator+"classes"+File.separator+"config"+File.separator+"config.json"));
    }

    public static ConfigHolder getInstance() throws IOException {
        if(objConfigHolder==null){
            objConfigHolder = new ConfigHolder();
        }
        return objConfigHolder;
    }


    public String getHostName() {
        return jsonContext.read("$." + this.getEnv() + ".url");
    }

}