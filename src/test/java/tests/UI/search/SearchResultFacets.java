package tests.UI.search;

import org.junit.Test;
import tests.UI.base.BaseTest;
import static UI.constants.Constants.Urls.SEARCH_RESULT_PAGE;

public class SearchResultFacets extends BaseTest {

    @Test
    public void checkCategoryFacetAfterSearch() throws InterruptedException {
        basePage.open(SEARCH_RESULT_PAGE);
        searchResultPage.searchWordEqualsResultCategory("Ноутбуки");
        close();
    }
}
