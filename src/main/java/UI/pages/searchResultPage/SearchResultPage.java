package UI.pages.searchResultPage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
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
    @FindBy(xpath = "//div[@class='sort-by__select']/span")
    WebElement defaultSearch;
    @FindBy(xpath = "//*[@id='search-form__input']")
    WebElement searchFeald;
    @FindBy(xpath = "//li[@class='cat-list-radio__item active']//span")
    WebElement activeCategoryAfterSearch;

    public SearchResultPage matchSearchResult() {
        List<WebElement> productsItemTitlesResult = productsItemTitles;
        List<String> productsItemTitle = null;
        for (int i = 0; i < productsItemTitlesResult.size(); i++) {
            productsItemTitle.add(productsItemTitles.get(i).getText());
            Assert.assertTrue(productsItemTitle.get(i).contains("Xiaomi"));
        }
        return this;
    }

    public SearchResultPage defaultSort(){
        String defaultSearchResult = defaultSearch.getText();
        Assert.assertTrue(defaultSearchResult.contains("по популярности"));
        return this;
    }

    public SearchResultPage searchWordEqualsResultCategory(String searchWord) {
        searchFeald.click();
        searchFeald.sendKeys(searchWord);
        searchFeald.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String activeCategory = activeCategoryAfterSearch.getText();
        Assert.assertTrue(activeCategory.contains(searchWord));
        return this;
    }
}
