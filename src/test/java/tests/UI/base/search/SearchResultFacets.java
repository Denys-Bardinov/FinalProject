package tests.UI.base.search;

import org.junit.Test;
import tests.UI.base.BaseTest;

import static UI.constants.Constants.Urls.ALLO_HOME_PAGE;

public class SearchResultFacets extends BaseTest {

    @Test
    public void checkCategoryFacetAfterSearch() throws InterruptedException {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.enterSearchText("Телефон");
        waitElementIsVisible();
        searchResultPage.searchWordEqualsResultCategory("Ноутбуки");
        close();
    }
}
