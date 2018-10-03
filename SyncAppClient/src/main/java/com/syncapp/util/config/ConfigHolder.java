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