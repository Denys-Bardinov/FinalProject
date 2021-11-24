package UI.pages.events;

import UI.pages.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static UI.constants.Constants.Events.PROMO_LIST;
import static UI.constants.Constants.Events.PROMO_LIST_ITEM;

public class Events extends BasePage {
    public Events(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='promo-list__categories']/a")
    List<WebElement> promoList;
    @FindBy(xpath = "//div[@class='promo-list__items']/a")
    List<WebElement> promoListItems;


    public void checkPromoList() {
        Assert.assertTrue(promoList.size() == PROMO_LIST);
    }

    public void checkPromoListItems() {
        Assert.assertTrue(promoListItems.size() == PROMO_LIST_ITEM);
    }
}
