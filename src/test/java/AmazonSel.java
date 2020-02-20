import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonSel {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // implicit wait interview question
        driver.get("https://www.amazon.com");
        WebElement searchIphone = driver.findElement(By.id("twotabsearchtextbox"));
        searchIphone.sendKeys("Iphone");
        WebElement searchButton = driver.findElement(By.xpath("//form/div//input"));
        searchButton.click();
        WebElement searchIphone11 = driver.findElement(By.xpath("//h2//span[.='Simple Mobile Prepaid - Apple iPhone XS (64GB) - Gold']"));
        searchIphone11.click();
WebElement iphonePrice = driver.findElement(By.xpath("//td//span[@id='priceblock_ourprice']"));
        System.out.println("the iphone Price "+ iphonePrice.getText());

    }
}
