package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import factory.DriverFactory;

/**
 * Utility class for capturing screenshots.
 * Used during test failures and reporting.
 */
public class ScreenshotUtils {

    /**
     * Captures screenshot and saves it in screenshots folder.
     *
     * @param testName Name of test method
     * @return Screenshot file path
     */
    public static String captureScreenshot(String testName) {

        String path = "screenshots/"
                + testName
                + "_"
                + System.currentTimeMillis()
                + ".png";

        File source = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);

        File destination = new File(path);

        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;
    }
}