package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageHelper extends PageBase {
    @FindBy (xpath = "//button[@class='ui button login']")
    WebElement loginButton;

    @FindBy (id = "email")
    WebElement emailField;

    @FindBy (id = "password")
    WebElement passwordField;

    public LoginPageHelper(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageIsLoaded() {
        waitUntilElementIsClickable(loginButton, 30);
    }

    public void enterLogin(String login) {
        enterValueToTheField(emailField, login);
    }

    public void enterPassword(String password) {
        enterValueToTheField(passwordField, password);
    }

    public void clickLogin() {
        waitUntilElementIsClickable(loginButton, 3);
        loginButton.click();
    }
}
