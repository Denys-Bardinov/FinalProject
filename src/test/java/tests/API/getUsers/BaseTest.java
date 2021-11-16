package tests.API.getUsers;

import API.common.CommonActions;
import API.pages.BasePage;
import API.pages.ListUsers;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected ListUsers listUsers = new ListUsers(driver);

    protected void close() {
        driver.close();
    }
}
