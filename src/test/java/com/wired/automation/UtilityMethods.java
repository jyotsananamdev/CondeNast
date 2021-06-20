package com.wired.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class UtilityMethods extends PreprocessorTest {
    WebDriverWait wait= null;
    /*Method used to click on element by-
     * pass by(arg) */
    public void click(By by)
    {
        waitForElementToBeClickable(by, 30);
        getDriver().findElement(by).click();
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
        waitForElementToBeVisible(by, 30);
        find(by).sendKeys(inputText);
    }

    /*Method used to wait for Webelement to be visible*/
    public void waitForElementToBeVisible(By by, long sec)
    {
        wait = new WebDriverWait(getDriver(), sec);
        wait.until(ExpectedConditions.visibilityOf(find(by)));
    }

    /*Method used to wait for Webelement to be clickable*/
    public void waitForElementToBeClickable(By by, long sec)
    {
        wait = new WebDriverWait(getDriver(), sec);
        wait.until(ExpectedConditions.visibilityOf(find(by)));
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
        waitForElementToBeVisible(by, 20);
        return find(by).getText();
    }

    /*Method used to get value of webelement*/
    public String getValue(By by)
    {
        waitForElementToBeVisible(by, 20);
        return find(by).getAttribute("value");
    }
}
