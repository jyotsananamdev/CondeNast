package com.wired.automation.pages;

import com.wired.automation.UtilityMethods;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CommonPage extends UtilityMethods {
    By topStoriesText= By.xpath("//android.widget.TextView[@text='TOP STORIES']");
    By allIssuesText= By.xpath("//android.widget.TextView[@text='ALL ISSUES']");
    By downloadedText= By.xpath("//android.widget.TextView[@text='DOWNLOADED']");
    By searchButton = By.id("uk.co.condenast.wired:drawable/globalsearch");
    By postImage= By.xpath("//android.widget.ImageView[@content-desc= 'WIREDUKJULAUG2021']");
    By accountButton= By.xpath("//android.widget.TextView[@text='Account']");
    By settingsButton= By.xpath("//android.widget.TextView[@text='Settings']");
    By scrapbookButton= By.xpath("//android.widget.TextView[@text='Scrapbook']");
    By subscribeButton= By.xpath("//android.widget.Button[@text='SUBSCRIBE']");
    By postLoginButton= By.xpath("//android.widget.Button[@text='LOG IN']");
    By pricebutton= By.xpath("(//android.widget.Button[@resource-id=‘uk.co.condenast.wired:id/documentActionsButton’ and @index=‘2’])[1]");
    By existingSubsButton= By.xpath("//android.widget.TextView[@text='EXISTING SUBSCRIPTIONS']");
    By appStoreButton= By.xpath("//android.widget.TextView[@text='APP STORE PURCHASES']");
    By alreadySubsText= By.id("uk.co.condenast.wired:id/settings_title");
    By userNameInput = By.id("uk.co.condenast.wired:id/userID");
    By passwordInput = By.id("uk.co.condenast.wired:id/password");
    By loginButton= By.id("uk.co.condenast.wired:id/loginButton");
    By loginErrorMessage= By.id("uk.co.condenast.wired:id/errorMessage");
    By backButton = By.xpath("//android.widget.ImageButton[@content-desc='Back']");
    By purchaseButton= By.id("uk.co.condenast.wired:id/purchaseButton");
    By buySubsAlert= By.xpath("//android.widget.TextView[@text='Buy Subscription']");
    By oneMonthAlert= By.xpath("//android.widget.TextView[@text='1 Month']");
    By oneYearAlert= By.xpath("//android.widget.TextView[@text='1 Year']");
    By moreOptionButton = By.xpath("//android.widget.ImageView[@content-desc='More options']");
    By paymentMethodButton = By.xpath("//android.widget.TextView[@text='Start by adding a payment method']");
    By addCreditCardButton = By.xpath("//android.widget.TextView[@text='Add credit or debit card']");
    By closeButton= By.xpath("//*[@content-desc='Close' and index='1']");
    By generalSettingButton = By.xpath("//android.widget.TextView[@text='GENERAL']");
    By helpSettingButton = By.xpath("//android.widget.TextView[@text='HELP']");
    By aboutSettingButton = By.xpath("//android.widget.TextView[@text='ABOUT']");
    By privacySettingButton = By.xpath("//android.widget.TextView[@text='PRIVACY']");
    By wantToPayText= By.xpath("//android.widget.TextView[@text='Want to pay with cash?']");
    By noSavedArticlesText= By.xpath("//android.widget.TextView[@index='2']");
    By scrapBooktext= By.xpath("//android.widget.TextView[@text='MY SCRAPBOOK']");
    By downloadMessage= By.xpath("//android.widget.TextView[@text='Your downloaded issues will appear here.']");
    String serachedTextBeforeLogin = "You must be signed in to use cross-edition search.";
    String invalidCrdentials= "Invalid e-mail or password. Please try again or reset your password.";
    String downlodedText= "Your downloaded issues will appear here.";
    String noSavedArtText= "You have no saved articles";

    public void verifyLandingPage()
    {
        sleep(10);
        if(isElementPresent(closeButton))
        {
            click(closeButton);
        }
        Assert.assertTrue(isElementPresent(allIssuesText),"Users should be landed to All issues tab" );
        Assert.assertTrue(isElementPresent(downloadedText),"Users should be able to see download tab" );
    }
    public void verifyAllIssuesPage()
    {
        Assert.assertTrue(isElementPresent(subscribeButton), "Subscribe button should appear on post page");
    }
    public void clickOnDownloadButton()
    {
        click(downloadedText);
        Assert.assertTrue(isElementPresent(downloadMessage),"user should navigate to downloaded page");
    }
    public void clickOnPosts()
    {
        click(postImage);
    }
    public void verifyPostPage()
    {
        Assert.assertTrue(isElementPresent(subscribeButton), "Subscribe button should appear on post page");
        Assert.assertTrue(isElementPresent(postLoginButton), "Login button should appear on post page");
    }
    public void clickOnSubscribeButton()
    {
        click(subscribeButton);
    }
    public void clickOnLoginButton()
    {
        click(postLoginButton);
    }
    public void verifyAlreadySubsPage()
    {
        Assert.assertTrue(isElementPresent(alreadySubsText), "Already subs text should appear on page");
        androidBack();
        androidBack();
    }
    public void clickOnAllIssuesButton()
    {
        click(allIssuesText);
    }
    public void clickOnMoreButton()
    {
        click(moreOptionButton);
    }
    public void verifyMoreOption()
    {
        Assert.assertTrue(isElementPresent(scrapbookButton), "ScrapBook Tab should appear on page");
        Assert.assertTrue(isElementPresent(accountButton), "Account tab should appear on page");
        Assert.assertTrue(isElementPresent(settingsButton), "Setting tab should appear on page");
    }

    public void clickOnAccount()
    {
        click(accountButton);
    }
    public void verifyAccountPage()
    {
        Assert.assertTrue(isElementPresent(existingSubsButton), "Existing subscription link  should appear on page");
        Assert.assertTrue(isElementPresent(appStoreButton), "App store purchase link should appear on page");
    }
    public void clickOnExistingSubsButton()
    {
        click(existingSubsButton);
    }
    public void verifyExistingSubsPage()
    {
        Assert.assertTrue(isElementPresent(alreadySubsText), "Already subscription text should appear on page");
        Assert.assertTrue(isElementPresent(userNameInput), "Username Input should appear on page ");
        Assert.assertTrue(isElementPresent(passwordInput), "Password Input should appear on page");
        Assert.assertTrue(isElementPresent(loginButton), "Login button should appear on page");
    }
    public void checkLoginForInvalidUser(String uName, String pass)
    {
        sendKeys(userNameInput, uName);
        sendKeys(passwordInput, pass);
        click(loginButton);
        Assert.assertTrue(getText(loginErrorMessage).contains(invalidCrdentials), invalidCrdentials+" should appear on page");
    }
    public void clickOnBackButton()
    {
        click(backButton);
    }
    public void clickAppStorePurchase()
    {
        click(appStoreButton);
        Assert.assertTrue(isElementPresent(purchaseButton), "Purchase button should appear on page");
    }
    public void clickOnPurchaseButton()
    {
        click(purchaseButton);
    }
    public void verifyPurchasePopup()
    {
        Assert.assertTrue(isElementPresent(buySubsAlert), "Buy subscription popup should appear");
        Assert.assertTrue(isElementPresent(oneMonthAlert), "One month option should available on popup");
        Assert.assertTrue(isElementPresent(oneYearAlert), "One year option should available on popup");

    }
    public void clickOnOneMonthAlert()
    {
        click(oneMonthAlert);
    }
    public void verifyPaymentMethod()
    {
        Assert.assertTrue(isElementPresent(addCreditCardButton), "Add credit card button should appear on page");
        Assert.assertTrue(isElementPresent(paymentMethodButton), "Payment method button should appear on page");
    }

    public void backToHome()
    {
        androidBack();
    }
    public void verifyWantToCashPopup()
    {
        Assert.assertTrue(isElementPresent(wantToPayText), "Want to pay text should appear on page");
        backToHome();
    }
    public void clickOnSettings()
    {
        click(settingsButton);
    }
    public void verifySettingsPage()
    {
        Assert.assertTrue(isElementPresent(helpSettingButton), "Help Setting Should appear on page");
        Assert.assertTrue(isElementPresent(generalSettingButton), "General Setting should appear on page");
        Assert.assertTrue(isElementPresent(privacySettingButton), "Privacy setting should appear on page");
        Assert.assertTrue(isElementPresent(aboutSettingButton), "About Setting should appear on page");
    }
    public void clickOnHelpButton()
    {
        click(helpSettingButton);
    }
    public void verifyHelpPage()
    {
        Assert.assertTrue(pageSource().contains("NEED HELP?"), "Need help text should appearon page");
        androidBack();

    }
    public void clickOnGeneralSettingButton()
    {
        click(generalSettingButton);
    }

    public void clickOnPrivacySettingButton()
    {
        click(privacySettingButton);
    }

    public void clickOnAboutSettingButton()
    {
        click(aboutSettingButton);
    }
    public void verifyAboutSettingPage()
    {
        Assert.assertTrue(pageSource().contains("ABOUT"), "About text should appear on page");
        androidBack();

    }
    public void verifyPrivacyPage()
    {
        Assert.assertTrue(pageSource().contains("PRIVACY POLICY"), "Privacy policy text should appear on page");
        androidBack();

    }
    public void verifyGeneralPage()
    {
        Assert.assertTrue(pageSource().contains("AUTOMATIC DOWNLOADS"), "Automatic Downloads should visible on page");
        Assert.assertTrue(pageSource().contains("FEEDBACK"), "feedback heading should visible on page");
        androidBack();

    }

}
