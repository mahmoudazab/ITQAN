package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }



    private WebElement register_btn()
    {
        return driver.findElement(By.linkText("Register"));
    }
    public void openRegisterationPage ()
    {
        clickButton(register_btn());
    }
}