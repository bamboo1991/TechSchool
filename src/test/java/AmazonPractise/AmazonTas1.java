package AmazonPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonTas1 {
    @Test
    public void sumPage1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        WebElement searchIphone = driver.findElement(By.id("twotabsearchtextbox"));
        searchIphone.sendKeys("Iphone");
        WebElement searchButton = driver.findElement(By.xpath("//form/div//input"));
        searchButton.click();
        WebElement higherToLow = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
        higherToLow.click();
        WebElement clickIt = driver.findElement(By.id("s-result-sort-select_2"));
        clickIt.click();
        double sum = 0.0;
        for (int i =0 ; i<=17; i++) {
            List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
            List<WebElement> cents = driver.findElements(By.xpath("//span[@class='a-price-fraction']"));
            String correctPrice=prices.get(i).getText()+"."+cents.get(i).getText();
            correctPrice=correctPrice.replace(",","");
           try{
               double newCorrected = Double.parseDouble(correctPrice);
               sum+=newCorrected;
           } catch (NumberFormatException e) {

           } System.out.println("Exception in Number Format ------------------> ");
        }
        System.out.println(("total price $")+sum);
    }



}

