package tests;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import factory.DriverFactory;
import pages.HomePage;
import utilities.LoggerUtils;

public class LoginNavigationTest extends BaseTest {

    private static final Logger logger =
            LoggerUtils.getLogger(LoginNavigationTest.class);

    /**
     * Validates that user can navigate
     * from Home Page to Login Page
     * using Signup/Login link.
     */
    @Test(priority=2, groups = "smoke")
    public void verifyUserCanNavigateToLoginPage() {

        logger.info( "===== Starting Login Navigation Test =====");

        HomePage homePage =   new HomePage( DriverFactory.getDriver());

        logger.info("Clicking Signup/Login link");

        homePage.clickSignupLogin();

        String currentUrl = DriverFactory.getDriver().getCurrentUrl();

        logger.info( "Current URL after navigation : {}", currentUrl);

        Assert.assertTrue( currentUrl.contains("login"),
                "User was not navigated to Login Page");

        logger.info( "Login page navigation validated successfully");

        logger.info("===== Login Navigation Test Completed Successfully =====");
    }
}