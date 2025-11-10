package tests.base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basetest {
    protected WebDriver driver;
    protected loginPage login;
    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        login = new loginPage(driver);
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
