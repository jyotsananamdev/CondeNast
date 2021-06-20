package com.wired.automation.tests;

import com.wired.automation.BaseTest;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest {

    @Test
    public void verrifyLandingPage()
    {
        lPage.verifyLandingPage();
    }
}
