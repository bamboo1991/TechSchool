package DeselectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class deselectByIndex {
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
        WebElement selectAll = driver.findElement(By.id("carselect"));
        int index1 =0;
        int index2 =1;
        int index3=2;
        Select dd1 = new Select(selectAll);
        if (dd1.isMultiple()){
            dd1.selectByIndex(index1);
        }else
            dd1.selectByIndex(index3);

    }
}
