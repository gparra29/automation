package pageobject;

import WebDriverUtils.WaitsUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomeMenuPage {
    WebDriver driver;
    WaitsUtils waitsUtils;

    private By logoutUser = By.xpath(".//a[text()='Logout']");

    public WelcomeMenuPage(WebDriver driver){
        this.driver = driver;
        this.waitsUtils = new WaitsUtils(driver);

    }

    public void clickLogout(){
        waitsUtils.elementVisible(logoutUser);
        driver.findElement(logoutUser).click();
    }

}
