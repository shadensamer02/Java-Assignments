package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
    private By usernameF = By.id("user-name");
    private By passwordF = By.id("password");
    private By ButtonF = By.id("login-button");
    private By errormsg = By.tagName("h3");
    public loginPage (WebDriver driver)
    {
        this.driver=driver;
    }
    public void setUsernameF (String username){
        driver.findElement(usernameF).sendKeys(username);
    }
    public void setPasswordF (String password)
    {
        driver.findElement(passwordF).sendKeys(password);
    }
    public InventoryPage clicklogin()
    {
        driver.findElement(ButtonF).click();
        return new InventoryPage(driver);
    }
    public String geterrormsg()
    {
        return driver.findElement(errormsg).getText();
    }
    /*public InventoryPage newinveentory(String username , String password)
    {
        driver.findElement(usernameF).sendKeys(username);
        driver.findElement(passwordF).sendKeys(password);
        driver.findElement(ButtonF).click();
        return new InventoryPage(driver);
    }*/

}
