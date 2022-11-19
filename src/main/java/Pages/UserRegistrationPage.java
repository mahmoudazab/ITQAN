package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    private WebElement firstnameTXT ()
    {
        return driver.findElement(By.id("firstname"));
    }

    private WebElement lastnameTXT ()
    {
        return driver.findElement(By.id("lastname"));
    }

    private WebElement emailTXT ()
    {
        return driver.findElement(By.id("email_address"));
    }

    private WebElement passwordTXT ()
    {
        return driver.findElement(By.id("password"));
    }
    private WebElement confirmPasswordTXT ()
    {
        return driver.findElement(By.id("confirmation"));
    }
    private WebElement register_BTN ()
    {
        return driver.findElement(By.xpath("(//button[contains(@class , 'button')])[2]"));
    }




    public void fill_Registeration_data(String firstname , String lastname , String email ,String password)
    {
        setTextElementText(firstnameTXT(),firstname);
        setTextElementText(lastnameTXT(),lastname);
        setTextElementText(emailTXT(),email);
        setTextElementText(passwordTXT(),password);
        setTextElementText(confirmPasswordTXT(),password);
        clickButton(register_BTN());
    }

}
