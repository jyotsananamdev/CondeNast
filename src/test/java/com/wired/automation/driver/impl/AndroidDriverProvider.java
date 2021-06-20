package com.wired.automation.driver.impl;

import com.wired.automation.driver.AppiumSession;
import com.wired.automation.driver.DriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverProvider implements DriverProvider {

    WebDriver driver =null;
    @Override
    public WebDriver createAppiumDriver() {
        AppiumSession.startServer();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("deviceName", "Pixel_4_API_29");
        capabilities.setCapability("platformName", "Android");


        capabilities.setCapability("appPackage", "com.wiredar");
// This package name of your app (you can get it from apk info app)
        capabilities.setCapability("appActivity", "com.wiredar.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
        //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
