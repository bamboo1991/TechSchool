package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utills.Driver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    static WebDriver driver;
    @Parameters("DriverName")
    @BeforeTest
    public void setupDriver(String DriverName){
        driver = Driver.getDriver(DriverName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


}

