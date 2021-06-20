package com.wired.automation.driver;

import org.openqa.selenium.WebDriver;

public interface DriverProvider {

    public WebDriver createAppiumDriver();
}
