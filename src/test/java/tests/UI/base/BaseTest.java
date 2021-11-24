package tests.UI.base;

import UI.common.CommonActions;
import UI.pages.loginForm.LoginForm;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import UI.pages.alloHome.AlloHomePage;
import UI.pages.base.BasePage;
import UI.pages.searchResultPage.SearchResultPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.UI.authentication.Authentication;

import static UI.constants.Constants.TimeoutVariable.EXPLICIT_WAIT;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected AlloHomePage alloHomePage = new AlloHomePage(driver);
    protected SearchResultPage searchResultPage = new SearchResultPage(driver);
    protected LoginForm loginForm = new LoginForm(driver);




    protected void close() {
        driver.close();
    }
}
