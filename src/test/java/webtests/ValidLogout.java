package webtests;

import basetests.Basetests;
import org.junit.Test;


public class ValidLogout extends Basetests {
    @Test
    public void validLogout(){
        loginPage.loginUser("Admin", "admin123");
        brandingPage.checkLoginUser();
        brandingPage.clickUserWelcomeMenu();
        welcomeMenuPage.clickLogout();
        loginPage.checkLogout();
    }
}
