package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.reporters.TestHTMLReporter;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeSuite
    @Parameters({"browser"})
    public void startDriver (@Optional("chrome") String browserName)
    {




        if (browserName.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        //FireFox Driver
        else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver" , System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");

            driver = new FirefoxDriver();

        }
        //Edge Driver
        else if (browserName.equalsIgnoreCase("ie"))
        {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }


        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://magento-demo.lexiconn.com/");


    }
    @AfterSuite
    public void quit()
    {
        driver.quit();
    }
}
