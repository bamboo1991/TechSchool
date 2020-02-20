package HomeWork;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

class TestClass {
static WebDriver driver;
@Parameters("DriverName")
@BeforeTest
public void setUpDriver(String DriverName){
    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver =DriverSetUp.getDriver("chrome");
}
}
