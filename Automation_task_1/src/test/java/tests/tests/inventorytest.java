package tests.tests;
import org.openqa.selenium.WebDriver;
import pages.InventoryPage;
import static org.testng.Assert.assertTrue;
import tests.base.basetest;
import org.testng.annotations.Test;

public class inventorytest extends basetest {
    private WebDriver driver;
    @Test
    public void testtile()
    {
        //loginPage login = new loginPage(driver);
        login.setUsernameF("standard_user");
        login.setPasswordF("secret_sauce");
        InventoryPage Inventory = login.clicklogin();
        assertTrue(Inventory.gettitle().contains("Swag Labs"));
    }
    @Test
    public void testcart()
    {
        //loginPage login = new loginPage(driver);
        login.setUsernameF("standard_user");
        login.setPasswordF("secret_sauce");
        InventoryPage Inventory = login.clicklogin();
        assertTrue(Inventory.getcart());
    }
    @Test
    public void numberofitems(){
        //loginPage login = new loginPage(driver);
        login.setUsernameF("standard_user");
        login.setPasswordF("secret_sauce");
        InventoryPage Inventory = login.clicklogin();
        assertTrue(Inventory.getitems()==6);
    }
}
