package Test;

import Helpers.Helper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    private Helper help;

    @BeforeClass
    public void setUp() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        help= new Helper();
        driver.get(help.OPENCART_URL);
    }

    @AfterClass
    public void tearDown() throws Exception{
        driver.close();
    }
}
