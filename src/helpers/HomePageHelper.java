package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHelper extends PageBase {
    @FindBy (xpath = "//div[@class='auth-menu']//a[@class='login'][contains(text(),'Log in')]")
    WebElement loginIcon;

    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageIsLoaded() {
        waitUntilElementIsClickable(loginIcon, 40);
    }

    public void openLoginPage() {
        loginIcon.click();
    }
}
