package tests.UI.authentication;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import tests.UI.base.BaseTest;

import static UI.constants.Constants.Urls.ALLO_HOME_PAGE;

public class Authentication extends BaseTest {

    @Test
    public void checkWrongEmailAuthentication() throws InterruptedException {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.clickAuthentication();
        loginForm.enterInvalidEmail();
        close();
    }

    @Test
    public void checkWrongPasswordAuthentication() throws InterruptedException {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.clickAuthentication();
        loginForm.enterInvalidPassword();
        close();
    }

    @Test
    public void checkWValidAuthentication() throws InterruptedException {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.clickAuthentication();
        loginForm.validAuthentication();
        close();
    }
}
