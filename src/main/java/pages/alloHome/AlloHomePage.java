package pages.alloHome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class AlloHomePage extends BasePage {

    public AlloHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='search-form__input']")
    WebElement searchFeald;

    public AlloHomePage enterSearchText() {
        searchFeald.click();
        searchFeald.sendKeys("Xiaomi");
        searchFeald.sendKeys(Keys.ENTER);
        return this;
    }
}
