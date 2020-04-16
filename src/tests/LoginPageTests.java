package tests;

import helpers.HomePageHelper;
import helpers.UserPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import helpers.LoginPageHelper;


public class LoginPageTests extends TestBase {
    HomePageHelper homePage;
    LoginPageHelper loginPage;
    UserPageHelper userPage;

    @BeforeMethod
    public void initTests() {
        homePage = PageFactory.initElements(driver, HomePageHelper.class);
        loginPage = PageFactory.initElements(driver, LoginPageHelper.class);
        userPage = PageFactory.initElements(driver, UserPageHelper.class);
    }

    @Test
    public void testLoginPositive() {
        homePage.openLoginPage();
        loginPage.waitUntilPageIsLoaded();
        loginPage.enterLogin(LOGIN);
        loginPage.enterPassword(PASSWORD);
        loginPage.clickLogin();
        userPage.waitUntilPageIsLoaded();

        Assert.assertTrue(userPage.verifyIfWelcomeTextIsDisplayed());
    }

}
