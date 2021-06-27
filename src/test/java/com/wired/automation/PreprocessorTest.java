package com.wired.automation;

import com.wired.automation.driver.AppiumSession;
import com.wired.automation.driver.impl.AndroidDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PreprocessorTest {
    public static AndroidDriver driver = null;
    private Properties prop;

    @Parameters({ "platformName" })
    @BeforeTest
    public void startUp(String platformName)
    {
        AppiumSession.startServer();
        if(platformName.equalsIgnoreCase("Android")) {
            driver = new AndroidDriverProvider().createAppiumDriver();
        }
        else {
            driver = new AndroidDriverProvider().createAppiumDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static AndroidDriver getDriver()
    {
        return driver;
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
        AppiumSession.stopServer();
    }
}
