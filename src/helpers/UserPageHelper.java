package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageHelper extends PageBase {
    @FindBy (xpath = "//h3[contains(text(),'Welcome')]")
    WebElement welcomeText;

    public UserPageHelper(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageIsLoaded() {
        waitUntilElementIsVisible(welcomeText, 10);
    }

    public boolean verifyIfWelcomeTextIsDisplayed() {
        return driver.findElement(By.xpath("//div[@class='welcome-container']"))
                .getText().contains("Welcome");
    }
}
