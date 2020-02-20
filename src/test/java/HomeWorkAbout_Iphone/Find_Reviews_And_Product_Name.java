package HomeWorkAbout_Iphone;

import HomeWork.AmazonPage1;
import HomeWork.DriverSetUp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Find_Reviews_And_Product_Name {
    private static WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }
    @AfterTest
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void remove$(){

        driver.get("https://www.amazon.com");
        WebElement searchIphone = driver.findElement(By.id("twotabsearchtextbox"));
        searchIphone.sendKeys("Iphone");
        WebElement searchButton = driver.findElement(By.xpath("//form/div//input"));
        searchButton.click();
        AmazonPage1 amazonPage1 =new AmazonPage1();

        List<WebElement> ratings = amazonPage1.ratings;
        List<WebElement> listOfProducts = amazonPage1.listOfProducts;
        for (int i =0; i<listOfProducts.size(); i++){
            if (listOfProducts.get(i).getText().contains(ratings.get(i).getText())){

            }System.out.println("total numbers of reviews: "+ratings.get(i).getText()+" and product name: "+listOfProducts.get(i).getText());
        }
}}
