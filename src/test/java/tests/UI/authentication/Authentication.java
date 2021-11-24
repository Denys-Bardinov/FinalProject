package tests.UI.authentication;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import tests.UI.base.BaseTest;

import static UI.constants.Constants.Urls.ALLO_HOME_PAGE;

public class Authentication extends BaseTest {

    @Test
    public void checkWrongEmailAuthentication() {
        basePage.open(ALLO_HOME_PAGE);
        loginForm.clickAuthentication();
        loginForm.enterInvalidEmail();
        close();
    }

    @Test
    public void checkWrongPasswordAuthentication() {
        basePage.open(ALLO_HOME_PAGE);
        loginForm.clickAuthentication();
        loginForm.enterInvalidPassword();
        close();
    }

    @Test
    public void checkWValidAuthentication() {
        basePage.open(ALLO_HOME_PAGE);
        loginForm.clickAuthentication();
        loginForm.validAuthentication();
        close();
    }
}
