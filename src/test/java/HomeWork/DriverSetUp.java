package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetUp {
    private static WebDriver driver;
    private DriverSetUp(){}
        public static WebDriver getDriver(String DriverName){
           if (driver!=null){
               return driver;
           }
           switch (DriverName){
               case "fireFox":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;
               default:
                   WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
               break;
           }
        return driver;
    }
}
