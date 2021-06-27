package com.wired.automation;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class UtilityMethods extends PreprocessorTest {

    /*Method used to click on element by-
     * pass by(arg) */
    public void click(By by)
    {
        getDriver().findElement(by).click();
    }
    public String pageSource()
    {
        return getDriver().getPageSource();
    }

    /*Method used to click on element by-
     * pass WebElement(arg) */
    public void click(WebElement ele)
    {
        ele.click();
    }

    /*Method used to sendKeys on element*/
    public void sendKeys(By by,String inputText)
    {
        find(by).sendKeys(inputText);
    }

    /*Method used to verify Webelement is present on the page or not*/
    public Boolean isElementPresent(By by)
    {
        int count= getDriver().findElements(by).size();
        return count>0;
    }

    /*Method used to return Webelement*/
    public WebElement find(By by)
    {
        return getDriver().findElement(by);
    }

    /*Method used to return List<Webelement>*/
    public List<WebElement> finds(By by)
    {
        return getDriver().findElements(by);
    }

    /*Method used to get attribute value of webelement*/
    public String getAttributeValue(By by, String attribute)
    {
        return find(by).getAttribute(attribute);
    }

    /*Method used to get text of webelement*/
    public String getText(By by)
    {
        return find(by).getText();
    }

    /*Method used to get value of webelement*/
    public String getValue(By by)
    {
        return find(by).getAttribute("value");
    }

    /*Method to click on android back button*/
    public void androidBack()
    {
        getDriver().pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    public void sleep(int no)
    {
        try {
            Thread.sleep(1000*no);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
