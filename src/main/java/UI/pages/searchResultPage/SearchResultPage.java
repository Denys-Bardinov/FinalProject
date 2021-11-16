package UI.pages.searchResultPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import UI.pages.base.BasePage;

import java.util.List;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='products-layout__item']//a[@class='product-card__title']")
    List<WebElement> productsItemTitles;

    public SearchResultPage matchSearchResult() {
        List<WebElement> productsItemTitlesResult = productsItemTitles;
        List<String> productsItemTitle = null;
        for (int i = 0; i < productsItemTitlesResult.size(); i++) {
            productsItemTitle.add(productsItemTitles.get(i).getText());
            Assert.assertTrue(productsItemTitle.get(i).contains("Xiaomi"));
        }
        return this;
    }
}
