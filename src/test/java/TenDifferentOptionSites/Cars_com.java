package TenDifferentOptionSites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Cars_com {
    private static WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new  ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void cityOfChicago() {
        driver.get("https://www.cars.com");
        WebElement carsDropDown = driver.findElement(By.name("stockType"));
       String option = "New Cars";
       Select carsDd = new Select(carsDropDown);
       carsDd.selectByVisibleText(option);

   List<WebElement>allSelectedOptions=carsDd.getAllSelectedOptions();
   for (WebElement selectedOption : allSelectedOptions){
    Assert.assertEquals(selectedOption.getText(), option,"this was your test");

   }

    }
    @Test
    public void selectClass(){
        driver.get("https://www.cars.com");
        WebElement pricRange = driver.findElement(By.name("priceMax"));
        Select dropDown = new Select(pricRange);
        dropDown.selectByIndex(10);
        List<WebElement> allSelectedoption = dropDown.getAllSelectedOptions();
        for (WebElement selectedOption : allSelectedoption){
            Assert.assertEquals(selectedOption.getText(),("$40,000"));
        }
    }
@Test
    public void test3(){
    driver.get("https://www.cars.com");
    WebElement pricRange = driver.findElement(By.name("makeId"));
    Select dropDown = new Select(pricRange);
    dropDown.selectByValue("20005");
}
}
