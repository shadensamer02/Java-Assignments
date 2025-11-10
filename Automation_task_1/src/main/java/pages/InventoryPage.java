package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage {
    private WebDriver driver;
    private By title = By.className("app_logo");
    private By cart = By.className("shopping_cart_link");
    private By items = By.className("inventory_item");
    private By producttilte =By.className("title");
    public InventoryPage (WebDriver driver)
    {
        this.driver=driver;
    }
    public String gettitle()
    {
        return driver.findElement(title).getText();
    }
    public boolean getcart ()
    {
        return driver.findElement(cart).isDisplayed();
    }
    public int getitems()
    {
        List <WebElement> item =driver.findElements(items);
        return item.size();
    }
    public String getproducttitle()
    {
        return driver.findElement(producttilte).getText();
    }
}
