package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDown {
    @Test
    public void addElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement sd = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropDown = new Select(sd);
        dropDown.selectByVisibleText("Option 2");




    }
}
