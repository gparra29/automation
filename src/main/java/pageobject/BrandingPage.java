package pageobject;

import WebDriverUtils.WaitsUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BrandingPage {
    WebDriver driver;
    Actions actions;
    WaitsUtils waitsUtils;

    private By usuarioWelcome = By.id("welcome");
    private By imgWelcomePage = By.xpath(".//*[contains(@alt,'OrangeHRM')]");

    public BrandingPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.waitsUtils = new WaitsUtils(driver);
    }

    public void clickUserWelcomeMenu() {
        driver.findElement(usuarioWelcome).click();
    }

    public void checkLoginUser() {
        waitsUtils.elementVisible(imgWelcomePage);
        Assert.assertTrue("Element logo is no present", driver.findElement(imgWelcomePage).isDisplayed());
    }
}
