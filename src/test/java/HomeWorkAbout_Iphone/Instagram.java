package HomeWorkAbout_Iphone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Instagram {
    private static WebDriver driver;
    @BeforeTest
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void logIn(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.instagram.com");
        WebElement logInButton = driver.findElement(By.xpath("//button[.='Log in with Facebook']"));
        logInButton.click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("12166358732");
        WebElement passwd = driver.findElement(By.id("pass"));
        passwd.sendKeys("Arizona2020%");
        WebElement logInButton1 = driver.findElement(By.id("loginbutton"));
        logInButton1.click();
        WebElement notKnow = driver.findElement(By.xpath("//button[.='Not Now'] "));
        notKnow.click();
        WebElement secondPost = driver.findElement(By.xpath("//article[@class='_8Rm4L M9sTE  L_LMM SgTZ1   ePUX4'][2]//span[@class='fr66n']"));
        secondPost.click();



     }
}
