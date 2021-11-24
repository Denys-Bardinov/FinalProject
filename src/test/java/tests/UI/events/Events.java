package tests.UI.events;

import org.junit.Test;
import tests.UI.base.BaseTest;

import static UI.constants.Constants.Urls.ALLO_HOME_PAGE;

public class Events extends BaseTest {

    @Test
    public void checkPromoListCountEvents() {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.clickEventButton();
        events.checkPromoList();
        close();
    }

    @Test
    public void checkPromoListItemCount() {
        basePage.open(ALLO_HOME_PAGE);
        alloHomePage.clickEventButton();
        events.checkPromoListItems();
        close();
    }
}
