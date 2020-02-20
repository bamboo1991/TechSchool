package DeselectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Deselect1 {
    private static WebDriver driver;
    @BeforeTest
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void tes1() throws InterruptedException {
        Thread.sleep(4);
        driver.manage().window().maximize();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement dd1 = driver.findElement(By.id("multiple-select-example"));
       Select selectAll = new Select(dd1);
       String option1 = "apple";
       String option2 ="orange";
       String option3 = "peach";
       if (selectAll.isMultiple()) {
           selectAll.selectByValue(option1);
            selectAll.selectByValue(option2);
            selectAll.selectByValue(option3);
       }else
       selectAll.selectByValue("honda");
       selectAll.deselectByValue(option1);
    }


        }








