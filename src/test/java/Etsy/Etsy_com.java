package Etsy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Etsy_com {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // implicit wait interview question
        driver.get("https://www.etsy.com");
        WebElement iphoneCase = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        iphoneCase.sendKeys("Iphone");
        WebElement searchButton = driver.findElement(By.xpath("//span[@class='etsy-icon wt-nudge-b-1']"));
        searchButton.click();
        WebElement searchCase = driver.findElement(By.xpath("(//span[.='14.95'])[1]"));
        System.out.println(searchCase.getText());
    }
}
