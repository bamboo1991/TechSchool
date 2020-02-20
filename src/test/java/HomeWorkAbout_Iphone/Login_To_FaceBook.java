package HomeWorkAbout_Iphone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login_To_FaceBook {
    private static WebDriver driver;

    @
            BeforeTest
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @
            Test
    public void fcBookLogin() {
        driver.get("http://www.facebook.com");

        WebElement usernameButton = driver.findElement(By.id("email"));
        usernameButton.sendKeys("12166358732");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("0551038616a");
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        loginButton.click();

        WebElement story = driver.findElement(By.xpath("//div[@class='_827c'][3]"));
        story.click();
        WebElement Like = driver.findElement(By.xpath("//span[@aria-label='Like']"));
        Like.click();
        WebElement Like1 = driver.findElement(By.xpath("//span[@aria-label='Like']"));
        Like1.click();
        WebElement Lik2e = driver.findElement(By.xpath("//span[@aria-label='Like']"));
        Lik2e.click();
        WebElement Like3 = driver.findElement(By.xpath("//span[@aria-label='Like']"));
        Like3.click();
        WebElement logout = driver.findElement(By.id("userNavigationLabel"));
        logout.click();
//    WebElement actualLogOut = driver.findElement(By.xpath())
        List<WebElement> links = driver.findElements(By.tagName("//a"));
        for (WebElement link : links) {
            String add = link.getAttribute("href");
            link.click();
            driver.navigate().to(add);
        }


    }
}