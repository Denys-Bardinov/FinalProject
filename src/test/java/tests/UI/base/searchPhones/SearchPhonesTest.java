package tests.UI.base.searchPhones;

import org.junit.Test;
import tests.UI.base.BaseTest;

import static UI.constants.Constants.Urls.ALLO_HOME_PAGE;

public class SearchPhonesTest extends BaseTest {


    @Test
    public void checkListSearchResult() {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.enterSearchText();
        searchResultPage.matchSearchResult();
        close();
    }
}
