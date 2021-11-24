package UI.pages.loginForm;

import UI.pages.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static UI.constants.Constants.LoginData.*;

public class LoginForm extends BasePage {

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='auth']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='v-login-password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@class='modal-submit-button']")
    WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"form-validate-login\"]/div/div[1]/div[1]/div[2]/div/span")
    WebElement validationError;
    @FindBy(xpath = "//div[@id='account-top-name']")
    WebElement divUserName;
    @FindBy(xpath = "//div[@id='account-top-name']/span")
    WebElement userName;

    public LoginForm enterInvalidEmail() {
        emailField.click();
        emailField.sendKeys(INVALID_EMAIL);
        passwordField.sendKeys(VALID_PASSWORD);
        submitButton.click();
        waitElementIsVisible(validationError);
        String validationEmailErrorMessage = validationError.getText();
        Assert.assertTrue(validationEmailErrorMessage.contains("Пользователь с email"));
        return this;
    }

    public LoginForm enterInvalidPassword() {
        emailField.click();
        emailField.sendKeys(VALID_EMAIL);
        passwordField.sendKeys(INVALID_PASSWORD);
        submitButton.click();
        waitElementIsVisible(validationError);
        String validationEmailErrorMessage = validationError.getText();
        Assert.assertTrue(validationEmailErrorMessage.contains("Неверный адрес электронной почты (email) или пароль."));
        return this;
    }

    public LoginForm validAuthentication() {
        emailField.click();
        emailField.sendKeys(VALID_EMAIL);
        passwordField.sendKeys(VALID_PASSWORD);
        submitButton.click();
        waitElementIsVisible(divUserName);
        String userNameValue = userName.getText();
        Assert.assertTrue(userNameValue.contains(USER_NAME));
        return this;
    }
}
