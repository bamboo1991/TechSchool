package AmazonPractise;

import HomeWork.DriverSetUp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AmazonPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonPrice extends TestBase {
    @AfterTest
    public void tearDown(){
       //driver.quit();
   }

    @Test()
    public void remove$(){
       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        WebElement searchIphone = driver.findElement(By.id("twotabsearchtextbox"));
        searchIphone.sendKeys("Iphone");

        WebElement searchButton = driver.findElement(By.xpath("//form/div//input"));
        searchButton.click();
        AmazonPage amazonPage = new AmazonPage();
        List<WebElement> ratings = amazonPage.ratings;
        double sum = 0;
        int highest =0;
        int lower =Integer.parseInt(ratings.get(0).getText());
        for (int i =0; i<ratings.size(); i++) {
            try{
                String vote = ratings.get(i).getText().replace(",","");
                int temp=Integer.parseInt(vote);
                if (highest<temp){
                    highest=temp;
                }else if (lower>temp){
                    lower=temp;
                }

            }catch (Exception e){
                System.out.println("Message "+e);
            }
        } System.out.println("high number: "+highest+" and small "+ lower);

        }
    }
