package TenDifferentOptionSites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OhareAirportLanguageChange {
    private static WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void testAny(){
        driver.get("https://www.flychicago.com/ohare/home/pages/default.aspx");
        WebElement SelectLanguage = driver.findElement(By.xpath("//select[@class='goog-te-combo']"));
        Select dropDown =new Select(SelectLanguage);
        dropDown.selectByVisibleText("Kyrgyz - кыргызча");
                }
                }
