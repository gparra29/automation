package pageobject;

import WebDriverUtils.WaitsUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    WebDriver driver;
    WaitsUtils waitsUtils;
    Actions actions;
    BrandingPage brandingPage;

    private By userName = By.name("txtUsername");
    private By password = By.name("txtPassword");
    private By btnLogin = By.id("btnLogin");
    private By loginPanel = By.id("logInPanelHeading");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.waitsUtils = new WaitsUtils(driver);
        this.actions = new Actions(driver);
        this.brandingPage = new BrandingPage(driver);
    }

    public void loginUser(String user,String pass){
        this.enterUserName(user);
        this.enterPassword(pass);
        this.clickInLogin();
    }

    public void enterUserName(String user) {
        waitsUtils.elementVisible(userName);
        driver.findElement(userName).sendKeys(user);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickInLogin(){
        driver.findElement(btnLogin).click();
    }

    public void checkLogout(){
        waitsUtils.elementVisible(loginPanel);
        Assert.assertTrue("Element loginPanel is not present",driver.findElement(loginPanel).isDisplayed());
    }
}

