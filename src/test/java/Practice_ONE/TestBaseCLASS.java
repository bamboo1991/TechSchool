package Practice_ONE;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utills.Driver;

import java.util.concurrent.TimeUnit;

public class TestBaseCLASS {
    static WebDriver driver;
    @Parameters("DriverName")
    @BeforeTest
    public void setDriver(String DriverName){
        driver= Driver.getDriver(DriverName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
