import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleElement {
    @Test
    public void TestGoole() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        WebElement googleSearch = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        googleSearch.click();
        googleSearch.sendKeys("selenium webDriver");
        googleSearch.click();
WebElement searchButton = driver.findElement(By.xpath("//input[@class='gNO89b']"));
searchButton.click();
WebElement numbersOfLinks = driver.findElement(By.id("resultStats"));
System.out.println(numbersOfLinks.getText());
List<WebElement> list = driver.findElements(By.xpath("//h3"));
       for (WebElement element : list){
           if (!element.getText().toLowerCase().contains("videos")){
               Assert.assertTrue(element.getText().toLowerCase().contains("selenium"));
       }
       }

    }
}