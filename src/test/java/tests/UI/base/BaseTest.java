package tests.UI.base;

import UI.common.CommonActions;
import org.openqa.selenium.WebDriver;
import UI.pages.alloHome.AlloHomePage;
import UI.pages.base.BasePage;
import UI.pages.searchResultPage.SearchResultPage;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected AlloHomePage alloHomePage = new AlloHomePage(driver);
    protected SearchResultPage searchResultPage = new SearchResultPage(driver);


    protected void close() {
        driver.close();
    }
}
