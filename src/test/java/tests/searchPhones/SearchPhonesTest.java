package tests.searchPhones;

import org.junit.Test;
import pages.alloHome.AlloHomePage;
import tests.base.BaseTest;

import static constants.Constants.Urls.ALLO_HOME_PAGE;

public class SearchPhonesTest extends BaseTest {


    @Test
    public void checkListSearchResult() {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.enterSearchText();
        searchResultPage.matchSearchResult();
        close();
    }
}
