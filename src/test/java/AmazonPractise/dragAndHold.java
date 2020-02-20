package AmazonPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dragAndHold {
    private static WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void HoverOver(){
        driver.navigate().to("http://the-internet.herokuapp.com/horizontal_slider");

    }
}
