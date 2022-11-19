package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyDashBoard extends PageBase{
    public MyDashBoard(WebDriver driver) {
        super(driver);
    }

    private WebElement welcomemessage ()
    {
        return driver.findElement(By.xpath("(//p[contains(@class , 'welcome-msg')])"));
    }
   public boolean isExist()
    {
        return welcomemessage().isDisplayed();
    }

}
