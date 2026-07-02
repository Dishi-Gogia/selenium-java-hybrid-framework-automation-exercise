package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.LoggerUtils;

/**
 * Page Object for Login / Signup page.
 * Contains actions related to user registration.
 */
public class LoginPage extends BasePage {
    private static final Logger logger = LoggerUtils.getLogger(LoginPage.class);

    /**
     * Constructor.
     *
     * @param driver WebDriver instance
     */
    public LoginPage(WebDriver driver) {
        super(driver);
        logger.info("Login Page initialized successfully");
    }

    /**
     * Signup name textbox.
     */
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement signupName;

    /**
     * Signup email textbox.
     */
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement signupEmail;

    /**
     * Signup button.
     */
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signupButton;

    /**
     * Enter user name in signup form.
     * @param name User name
     */
    public void enterSignupName(String name) {

        logger.info("Entering signup name: {}",name);
        actions.type(signupName, name);
    }

    /**
     * Enter email address in signup form.
     * @param email User email
     */
    public void enterSignupEmail(String email) {

        logger.info("Entering signup email");
        actions.type(signupEmail, email);
    }

    /**
     * Click signup button.
     */
    public void clickSignupButton() {

        logger.info("Clicking signup button");
        actions.click(signupButton);
    }

    /**
     * Complete signup form and submit registration request.
     * @param name User name
     * @param email User email
     */
    public void signupUser( String name, String email) {

        logger.info( "Starting user registration process");
        enterSignupName(name);
        enterSignupEmail(email);
        clickSignupButton();
        logger.info( "User registration form submitted successfully");
    }
}