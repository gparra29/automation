package webtests;

import basetests.Basetests;
import org.junit.Test;

public class ValidLogin extends Basetests {

    @Test
    public void loginValid() {
        loginPage.loginUser("Admin", "admin123");
        brandingPage.checkLoginUser();
    }
}
