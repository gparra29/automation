package basetests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.BrandingPage;
import pageobject.LoginPage;
import pageobject.WelcomeMenuPage;

public class Basetests {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected WelcomeMenuPage welcomeMenuPage;
    protected BrandingPage brandingPage;

    public void instantiatePages(){
        loginPage = new LoginPage(driver);
        this.welcomeMenuPage = new WelcomeMenuPage(driver);
        this.brandingPage = new BrandingPage(driver);
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        instantiatePages();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
