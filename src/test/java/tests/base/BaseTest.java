package tests.base;

import common.CommonActions;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.alloHome.AlloHomePage;
import pages.base.BasePage;
import pages.searchResultPage.SearchResultPage;

import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected AlloHomePage alloHomePage = new AlloHomePage(driver);
    protected SearchResultPage searchResultPage = new SearchResultPage(driver);


    protected void close() {
        driver.close();
    }
}
