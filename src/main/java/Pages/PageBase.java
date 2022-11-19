package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {

    WebDriver driver;
    public PageBase (WebDriver driver)
    {
        this.driver = driver;
    }

    protected static void clickButton (WebElement button)
    {
        button.click();
    }
    protected static void setTextElementText(WebElement txtElement , String value) {

        txtElement.sendKeys(value);

    }
}
