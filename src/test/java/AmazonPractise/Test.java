package AmazonPractise;

import HomeWork.DriverSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utills.Driver;
class TestBase  {
        static WebDriver driver;
        @Parameters("DriverName")
        @BeforeTest(alwaysRun = true)
        public void setupDriver(String DriverName){
            driver = Driver.getDriver(DriverName);
            driver.manage().window().maximize();



    }
}
