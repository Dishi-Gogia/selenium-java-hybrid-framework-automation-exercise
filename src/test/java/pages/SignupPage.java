package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.LoggerUtils;

/**
 * Page Object for Signup Page.
 * Contains registration form actions and validations.
 */
public class SignupPage extends BasePage {

    private static final Logger logger = LoggerUtils.getLogger(SignupPage.class);

    /**
     * Constructor.
     * @param driver WebDriver instance
     */
    public SignupPage(WebDriver driver) {
        super(driver);
        logger.info( "Signup Page initialized successfully");
    }

    /**
     * Account Information header.
     */
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement accountInformationHeader;

    @FindBy(id = "id_gender1")
    private WebElement mrRadioButton;

    @FindBy(id = "password")
    private WebElement passwordTextbox;

    @FindBy(id = "days")
    private WebElement dayDropdown;

    @FindBy(id = "months")
    private WebElement monthDropdown;

    @FindBy(id = "years")
    private WebElement yearDropdown;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    private WebElement offersCheckbox;

    @FindBy(id = "first_name")
    private WebElement firstNameTextbox;

    @FindBy(id = "last_name")
    private WebElement lastNameTextbox;

    @FindBy(id = "company")
    private WebElement companyTextbox;

    @FindBy(id = "address1")
    private WebElement addressTextbox;

    @FindBy(id = "country")
    private WebElement countryDropdown;

    @FindBy(id = "state")
    private WebElement stateTextbox;

    @FindBy(id = "city")
    private WebElement cityTextbox;

    @FindBy(id = "zipcode")
    private WebElement zipcodeTextbox;

    @FindBy(id = "mobile_number")
    private WebElement mobileTextbox;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement createAccountButton;

    /**
     * Verify Account Information section is displayed.
     *
     * @return true if displayed
     */
    public boolean isAccountInformationDisplayed() {
        logger.info( "Verifying Account Information section");
        return actions.isDisplayed(accountInformationHeader);
    }

    /**
     * Select title as Mr.
     */
    public void selectTitle() {
        logger.info( "Selecting title as Mr");
        actions.click(mrRadioButton);
    }

    /**
     * Enter password.
     * @param password Account password
     */
    public void enterPassword(String password) {
        logger.info("Entering password");
        actions.type(passwordTextbox,password);
    }

    /**
     * Select birth day.
     * @param day Day value
     */
    public void selectDay(String day) {
        new Select(dayDropdown).selectByVisibleText(day);
    }

    /**
     * Select birth month.
     * @param month Month value
     */
    public void selectMonth(String month) {
        new Select(monthDropdown).selectByVisibleText(month);
    }

    /**
     * Select birth year.
     * @param year Year value
     */
    public void selectYear(String year) {
        new Select(yearDropdown) .selectByVisibleText(year);
    }

    /**
     * Subscribe to newsletter.
     */
    public void selectNewsletter() {
        actions.selectCheckbox(newsletterCheckbox);
    }

    /**
     * Subscribe to special offers.
     */
    public void selectSpecialOffers() {
        actions.selectCheckbox(offersCheckbox);
    }

    /**
     * Enter first name.
     */
    public void enterFirstName(String firstName) {
        actions.type(firstNameTextbox,firstName);
    }

    /**
     * Enter last name.
     */
    public void enterLastName(String lastName) {
        actions.type(lastNameTextbox,lastName);
    }

    /**
     * Enter company name.
     */
    public void enterCompanyName(String companyName) {
        actions.type( companyTextbox,companyName);
    }

    /**
     * Enter address.
     */
    public void enterAddressDetails(String address) {
        actions.type(addressTextbox,address);
    }

    /**
     * Select country.
     */
    public void selectCountry(String country) {
        new Select(countryDropdown) .selectByVisibleText(country);
    }

    /**
     * Enter state.
     */
    public void enterStateDetails(String state) {
        actions.type( stateTextbox,state);
    }

    /**
     * Enter city.
     */
    public void enterCityDetails(String city) {
        actions.type( cityTextbox, city);
    }

    /**
     * Enter zipcode.
     */
    public void enterZipcodeDetails(String zipcode) {
        actions.type(zipcodeTextbox,zipcode);
    }

    /**
     * Enter mobile number.
     */
    public void enterMobileDetails(String mobile) {
        actions.type( mobileTextbox, mobile);
    }

    /**
     * Complete registration form.
     *
     * @param firstName First name
     * @param lastName Last name
     * @param company Company name
     * @param address Address
     * @param state State
     * @param city City
     * @param zipcode Zipcode
     * @param mobile Mobile number
     */
    public void completeRegistrationForm(String firstName,String lastName,String company, String address,
            String state,String city,String zipcode,  String mobile) {

        logger.info("Completing registration form");

        selectTitle();
        enterPassword("Admin123");
        selectDay("10");
        selectMonth("May");
        selectYear("1989");
        selectNewsletter();
        selectSpecialOffers();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterCompanyName(company);
        enterAddressDetails(address);
        selectCountry("India");
        enterStateDetails(state);
        enterCityDetails(city);
        enterZipcodeDetails(zipcode);
        enterMobileDetails(mobile);

        logger.info(
                "Registration form completed successfully");
    }

    /**
     * Click Create Account button.
     * @return AccountCreatedPage
     */
    public AccountCreatedPage clickCreateAccount() {
        logger.info("Clicking Create Account button");
        actions.click(createAccountButton);
        return new AccountCreatedPage(driver);
    }
}