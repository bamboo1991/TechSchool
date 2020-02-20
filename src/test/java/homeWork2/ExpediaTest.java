package homeWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExpediaTest {
    private static WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }
    @Test
    public void TestExpedia() throws InterruptedException {
        driver.get("https://www.expedia.com");
        WebElement flightButton = driver.findElement(By.id("tab-flight-tab-hp"));
        flightButton.click();
        WebElement originFiled = driver.findElement(By.id("flight-origin-hp-flight"));
        originFiled.sendKeys("Chicago");
        WebElement destinationFiled = driver.findElement(By.id("flight-destination-hp-flight"));
        destinationFiled.sendKeys("Cleveland, Ohio");
        WebElement departingField = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
        departingField.sendKeys("02/06/2020");
        WebElement returnFiled = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
        returnFiled.sendKeys("02/16/2020");
        WebElement closeButton = driver.findElement(By.xpath("//button[@class='datepicker-close-btn close btn-text']"));
        closeButton.click();
        WebElement travelers = driver.findElement(By.xpath("//div[@id='traveler-selector-hp-flight']/child::div"));
        travelers.click();
        WebElement addAdult = driver.findElement(By.xpath("//div[@id='traveler-selector-hp-flight']//span[.='Add Adult']//preceding-sibling::span/.."));
        for (int i=0;i<2;i++){
            addAdult.click();
    }
        Thread.sleep(5000);
        WebElement addChild = driver.findElement(By.xpath("//div[@id='traveler-selector-hp-flight']//span[.='Add Child']//preceding-sibling::span/.."));
          try {
              for (int i=0;i<3;i++){
                  addChild.click();
              }
          }catch (Exception e){
              System.out.println("got it "+e);
          }
WebElement childAge1 = driver.findElement(By.id("flight-age-select-1-hp-flight"));
        WebElement childAge2 = driver.findElement(By.id("flight-age-select-2-hp-flight"));
        WebElement childAge3 = driver.findElement(By.id("flight-age-select-3-hp-flight"));
          Select dropDown1 = new Select(childAge1);
        Select dropDown2 = new Select(childAge2);
        Select dropDown3 = new Select(childAge3);
          dropDown1.selectByIndex(4);
        dropDown2.selectByIndex(3);

        dropDown3.selectByIndex(2);


        WebElement search =driver.findElement(By.xpath("//div[@id='f-fh-msg-tooltip-hp-flight']//preceding-sibling::label//button"));
        search.click();
        List<WebElement> listOfFlights = driver.findElements(By.xpath("//li[@class='flight-module segment offer-listing']"));
        int count =0;
        for (WebElement flightNum :listOfFlights) {
            count++;

        }
        System.out.println("total number of flights are: " + count);

    }
}
