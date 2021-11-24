package tests.UI.search;

import org.junit.Test;
import tests.UI.base.BaseTest;

import static UI.constants.Constants.Urls.ALLO_HOME_PAGE;

public class SearchPhones extends BaseTest {

    @Test
    public void checkListSearchResult() {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.enterSearchText("Xiaomi");
        searchResultPage.matchSearchResult();
        close();
    }

    @Test
    public void checkDefaultSearchValue() {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.enterSearchText("Смартфон");
        searchResultPage.defaultSort();
        close();
    }




}
