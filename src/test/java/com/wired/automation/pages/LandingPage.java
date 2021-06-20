package com.wired.automation.pages;

import com.wired.automation.UtilityMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage extends UtilityMethods {

    By topStoriesText= By.xpath("//android.widget.TextView[@text='TOP STORIES']");


    public void verifyLandingPage()
    {
        Assert.assertTrue(isElementPresent(topStoriesText),"Users should be landed to TOP Stories page" );
    }
}
