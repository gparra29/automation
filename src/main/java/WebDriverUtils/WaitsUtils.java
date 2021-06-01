package WebDriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsUtils {
    WebDriver driver;
    WebDriverWait webDriverWait;

    //Constructor
    public WaitsUtils(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 10);
    }

    public void elementVisible(By element) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
