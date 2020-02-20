package HomeWorkAbout_Iphone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Find_Product_With_Highest_And_Lowest_Rating {
    private static WebDriver driver;
@BeforeTest
    public void setup(){

            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void reviews() {
        driver.get("https://www.amazon.com");
        WebElement searchIphone = driver.findElement(By.id("twotabsearchtextbox"));
        searchIphone.sendKeys("Iphone");
        WebElement searchButton = driver.findElement(By.xpath("//form/div//input"));
        searchButton.click();
        List<WebElement> stars = driver.findElements(By.xpath("//span[contains(@aria-label,'out of 5 stars')]"));
        List<WebElement> listOfProducts = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        double []empty=new double[stars.size()];
        int count =0;
        for (WebElement ratings : stars){
            empty[count++] =Double.parseDouble(ratings.getAttribute("aria-label").substring(0, 3));
        }
        double lowest = empty[0];
        double highest  = empty[0];
        for (int i =0; i<empty.length;i++) {
            if (empty[i] > highest)
                highest = empty[i];
            if (empty[i] < lowest)
                lowest = empty[i];
            System.out.println(stars.get(i).getAttribute("aria-label").substring(0, 3)+" "+listOfProducts.get(i).getText());
        }
        System.out.println("this is highest rating in the list "+highest);
        System.out.println("this is lowest rating in the list "+lowest);
}
}