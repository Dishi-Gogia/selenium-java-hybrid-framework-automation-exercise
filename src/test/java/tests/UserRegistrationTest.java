package tests;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import factory.DriverFactory;
import pages.AccountCreatedPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import utilities.ExcelDataProvider;
import utilities.LoggerUtils;
import utilities.TestDataUtils;

public class UserRegistrationTest extends BaseTest {

    private static final Logger logger = LoggerUtils.getLogger(UserRegistrationTest.class);

    /**
     * Validates end-to-end user registration flow
     * using Data Provider driven test data.
     *
     * Test Flow:
     * Navigate to Login Page
     * Enter Signup Details
     * Validate Account Information Page
     * Complete Registration Form
     * Create Account
     */
    @Test(
            dataProvider = "excelData",
            dataProviderClass = ExcelDataProvider.class, groups = {"smoke, regression"},priority=1)
        
    public void verifyUserCanRegister(  String name, String firstName, String lastName, String company,
            String address, String state,String city,String zipcode,String mobile) {

        logger.info(
                "===== Starting User Registration Test =====");

        HomePage homePage = new HomePage(DriverFactory.getDriver());

        logger.info("Navigating to Signup/Login page");

        homePage.clickSignupLogin();

        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
        String email = TestDataUtils.generateEmail();

        logger.info( "Generated unique email for registration");

        loginPage.signupUser(name, email);

        SignupPage signupPage =new SignupPage( DriverFactory.getDriver());

        logger.info("Validating Account Information page");

        Assert.assertTrue(signupPage.isAccountInformationDisplayed(),"Account Information page is not displayed");

        logger.info("Account Information page displayed successfully");

        logger.info( "Completing registration form");

        signupPage.completeRegistrationForm(firstName,lastName,company,address, state,city,zipcode, mobile);
        
        logger.info("Submitting registration form");

        signupPage.clickCreateAccount();
        
        AccountCreatedPage accountCreatedPage =new AccountCreatedPage(DriverFactory.getDriver());

        Assert.assertTrue(accountCreatedPage .isAccountCreatedDisplayed(),"Account creation failed");

        logger.info("User registration completed successfully");

        logger.info("===== User Registration Test Completed Successfully =====");
    }
}