package com.wired.automation.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public interface DriverProvider {

    public AndroidDriver createAppiumDriver();
}
