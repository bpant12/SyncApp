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

import com.syncapp.util.devtool.SyncappUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.logging.Level;

/**
 * Created by bhupesh pant on 5/13/2018.
 */
public class TestSelenium {
    public static void main(String[] args) throws Exception {

         DesiredCapabilities cap = DesiredCapabilities.chrome();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        cap.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
        ChromeDriverService chromeDriverService = new ChromeDriverService.Builder().usingDriverExecutable(new File("C:\\Others-DRIVE\\" + "chromedriver.exe")).usingAnyFreePort().build();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
        WebDriver driver = new ChromeDriver(chromeDriverService,chromeOptions);
        ThreadLocal<WebDriver> threadedDriver = new ThreadLocal<>();
        threadedDriver.set(driver);

        //Recorder class instance
        SyncappUtil devtoolAnalyzer = new SyncappUtil();
        for (int i = 0; i < 2; i++) {

            //Start recording

           devtoolAnalyzer.startTracking(threadedDriver);
            driver.get("https://stackoverflow.com/questions");
            devtoolAnalyzer.endTracking("Stackoverflow-Web","Questions","testuser2@gmail.com");

            devtoolAnalyzer.startTracking(threadedDriver);
            driver.get("https://stackoverflow.com/jobs");
            devtoolAnalyzer.endTracking("Stackoverflow-Web","Job","testuser2@gmail.com");

        }

        driver.quit();
    }
}
