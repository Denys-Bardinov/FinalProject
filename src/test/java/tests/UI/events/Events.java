package tests.UI.events;

import io.qameta.allure.Attachment;
import org.junit.Test;
import tests.UI.base.BaseTest;

import static UI.constants.Constants.Urls.ALLO_HOME_PAGE;

public class Events extends BaseTest {


    @Attachment(value = "{0}", type = "image/png")
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
