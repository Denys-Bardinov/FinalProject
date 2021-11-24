package UI.pages.alloHome;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import UI.pages.base.BasePage;

public class AlloHomePage extends BasePage {

    public AlloHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='search-form__input']")
    WebElement searchFeald;
    @FindBy(xpath = "//li[@class='allo-programs__item'][5]")
    WebElement eventButton;


    public AlloHomePage enterSearchText(String searchString) {
        searchFeald.click();
        searchFeald.sendKeys(searchString);
        searchFeald.sendKeys(Keys.ENTER);
        return this;
    }

public AlloHomePage clickEventButton() {
        eventButton.click();
        return this;
}

}
