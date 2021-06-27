package com.wired.automation.tests;

import com.wired.automation.BaseTest;
import org.testng.annotations.Test;

public class CommonTest extends BaseTest {


    @Test(priority = 1 , description = "Test case for check landing page and Post Details")
    public void verifyLandingPage()
    {
        cPage.verifyLandingPage();
        cPage.verifyAllIssuesPage();
        cPage.clickOnSubscribeButton();
        cPage.verifyPurchasePopup();
        cPage.androidBack();
        cPage.clickOnPosts();
        cPage.verifyPostPage();
        cPage.clickOnLoginButton();
        cPage.verifyAlreadySubsPage();
        cPage.clickOnSubscribeButton();
        cPage.verifyPurchasePopup();
        cPage.androidBack();
        cPage.androidBack();
        cPage.clickOnDownloadButton();
        cPage.clickOnAllIssuesButton();
    }

    @Test(priority = 2, description = "Test case for account tab")
    public void accountTest()
    {
        cPage.clickOnMoreButton();
        cPage.verifyMoreOption();
        cPage.clickOnAccount();
        cPage.verifyAccountPage();
        cPage.clickOnExistingSubsButton();
        cPage.verifyExistingSubsPage();
        cPage.checkLoginForInvalidUser("test", "test");
        cPage.clickOnBackButton();
        cPage.clickAppStorePurchase();
        cPage.clickOnPurchaseButton();
        cPage.verifyPurchasePopup();
        cPage.clickOnOneMonthAlert();
        cPage.verifyPaymentMethod();
        cPage.backToHome();
        cPage.verifyWantToCashPopup();
    }

    @Test(priority = 3, description = "Test case for settings tab")
    public void settingsTest()
    {
        cPage.clickOnMoreButton();
        cPage.clickOnSettings();
        cPage.verifySettingsPage();
        cPage.clickOnHelpButton();
        cPage.verifyHelpPage();
        cPage.clickOnAboutSettingButton();
        cPage.verifyAboutSettingPage();
        cPage.clickOnGeneralSettingButton();
        cPage.verifyGeneralPage();
        cPage.clickOnPrivacySettingButton();
        cPage.verifyPrivacyPage();
        cPage.androidBack();
    }

}
