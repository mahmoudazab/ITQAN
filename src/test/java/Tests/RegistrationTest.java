package Tests;

import Pages.HomePage;
import Pages.MyDashBoard;
import Pages.UserRegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{

    HomePage home ;
    UserRegistrationPage register;

    MyDashBoard dashBoard;


    @Test
    public void register_test ()
    {
        home = new HomePage(driver);
        home.openRegisterationPage();
        register = new UserRegistrationPage(driver);
        register.fill_Registeration_data("Mahmoud" , "Azab" , "Mahmoud@Mahmoud.com", "Mahmoud8585");
        dashBoard = new MyDashBoard(driver);
        Assert.assertTrue(dashBoard.isExist());
    }
}
