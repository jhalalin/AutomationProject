package flipkart.utils;

import flipkart.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    public static void waitForElementVisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,
                java.time.Duration.ofSeconds(Config.IMPLICIT_WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitForElementClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,
                java.time.Duration.ofSeconds(Config.IMPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
