package WebDriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtils {
    WebDriver driver;
    private Actions actions;

    public ActionsUtils(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void hoverElement(By element){
        actions.moveToElement(driver.findElement(element)).perform();
    }
}

