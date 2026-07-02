package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.LoggerUtils;
import utilities.WebActions;

/**
 * Page Object for Home Page.
 * Contains actions and validations related to Home Page.
 */
public class HomePage extends BasePage{

	private static final Logger logger = LoggerUtils.getLogger(HomePage.class);

    /**
     * Constructor initializes page elements.
     * @param driver WebDriver instance
     */
    public HomePage(WebDriver driver) {
        super(driver);
        logger.info( "Home Page initialized successfully");
    }
    
    /**
     * Signup / Login navigation link.
     */
    @FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    private WebElement signupLoginLink;

    /**
     * Clicks Signup/Login link.
     */
    public void clickSignupLogin() {
        logger.info( "Clicking Signup/Login link");
        actions.click(signupLoginLink);
    }

    /**
     * Returns Home Page title.
     *
     * @return Page title
     */
    public String getHomePageTitle() {
        logger.info( "Fetching Home Page title");
        return actions.getPageTitle();
    }

    /**
     * Verifies Signup/Login link is displayed.
     *
     * @return true if link is visible
     */
    public boolean isSignupLoginDisplayed() {
        logger.info("Verifying Signup/Login link visibility");
        return actions.isDisplayed(signupLoginLink);
    }
}