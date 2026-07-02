package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;

/**
 * Utility class for handling explicit waits.
 * Provides reusable wait methods across the framework.
 */
public class WaitUtils {

    private static final int TIMEOUT = 10;

    /**
     * Wait until the element is visible.
     * @param element WebElement to wait for
     * @return Visible WebElement
     */
    public static WebElement waitForVisibility(WebElement element) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Wait until the element is clickable.
     * @param element WebElement to wait for
     * @return Clickable WebElement
     */
    public static WebElement waitForClickable(WebElement element) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Wait until specified text is present in an element.
     * @param locator Element locator
     * @param text Expected text
     * @return true if text is present
     */
    public static boolean waitForTextPresent(By locator, String text) {

        return new WebDriverWait( DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    /**
     * Wait until URL contains specified text.
     * @param partialUrl Partial URL text
     * @return true if URL contains text
     */
    public static boolean waitForUrlContains(String partialUrl) {

        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions.urlContains(partialUrl));
    }

    /**
     * Wait until page title contains specified text.
     * @param title Expected title text
     * @return true if title contains text
     */
    public static boolean waitForTitleContains(String title) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions.titleContains(title));
    }

    /**
     * Wait until element becomes invisible.
     * @param locator Element locator
     * @return true if element becomes invisible
     */
    public static boolean waitForInvisibility(By locator) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    /**
     * Wait until alert is present.
     * @return Alert object
     */
    public static Alert waitForAlert() {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions.alertIsPresent());
    }

    /**
     * Wait until frame is available and switch to it.
     * @param locator Frame locator
     */
    public static void waitForFrameAndSwitch(By locator) {
        new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }
}