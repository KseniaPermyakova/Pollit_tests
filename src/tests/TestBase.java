package tests;

import helpers.HomePageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public static final String LOGIN = "kseniatest7@gmail.com";
    public static final String PASSWORD = "123456";
    WebDriver driver;
    HomePageHelper homePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        homePage = PageFactory.initElements(driver, HomePageHelper.class);
        //===========Enter to Pollit====
        driver.manage().window().maximize();
        driver.get("https://pollit.co.il/");
        homePage.waitUntilPageIsLoaded();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
