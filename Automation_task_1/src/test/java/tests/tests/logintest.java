package tests.tests;
import org.json.JSONArray;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InventoryPage;
import static org.testng.Assert.assertTrue;
import tests.base.basetest;
import utils.DataDriven;

import java.io.IOException;


public class logintest extends basetest{
    private WebDriver driver;
    /*@DataProvider(name = "usersData")
    public Object[][] getUsersData() throws IOException, ParseException {
        JSONArray users = DataDriven.getUsers();
        Object[][] data = new Object[users.size()][2];

        for (int i = 0; i < users.size(); i++) {
            JSONObject user = (JSONObject) users.get(i);
            data[i][0] = user.get("username");
            data[i][1] = user.get("password");
        }
        return data;
    }*/
    @Test
    public void testsucclogin() throws IOException, ParseException {
        //loginPage login = new loginPage(driver);
        login.setUsernameF(DataDriven.getValue(0,"username"));
        login.setPasswordF(DataDriven.getValue(0,"password"));
        InventoryPage Inventory = login.clicklogin();
        assertTrue(Inventory.getproducttitle().contains("Products"));

    }
    @Test
    public void testFaillogin() throws IOException, ParseException {
        //loginPage login = new loginPage(driver);
        login.setUsernameF(DataDriven.getValue(1,"username"));
        login.setPasswordF(DataDriven.getValue(1,"password"));
        InventoryPage Inventory = login.clicklogin();
        assertTrue(login.geterrormsg().contains("Username and password do not match any user in this service"));
    }
    @Test
    public void testmissingpasslogin() throws IOException, ParseException {
        //loginPage login = new loginPage(driver);
        login.setUsernameF(DataDriven.getValue(2,"username"));
        login.setPasswordF(DataDriven.getValue(2,"password"));
        InventoryPage Inventory = login.clicklogin();
        assertTrue(login.geterrormsg().contains("Password is required"));
    }

}
