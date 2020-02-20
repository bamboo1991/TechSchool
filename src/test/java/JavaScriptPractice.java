import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

public class JavaScriptPractice {
    private static WebDriver driver;
    @BeforeTest
    public void setdRIVER(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void javaScriptExec(){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("alert('this is javascript alert')");
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
    @Test
    public void test2() throws InterruptedException {
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.amazon.com/'");
        long width=(Long)js.executeScript("return window.innerWidth");
        long height=(Long)js.executeScript("return window.innerHeight");
        System.out.println("width of the page "+width);
        System.out.println("Heigth of the page "+height);

        js.executeScript("window.scrollBy(0,3520)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-3520)");
        WebElement header=driver.findElement(By.xpath("//div[.='Get to Know Us']"));
        js.executeScript("arguments[0].scrollIntoView(true)",header);

            WebElement career = driver.findElement(By.xpath("//a[.='Careers']"));
            js.executeScript("arguments[0].click()",career);
   }


    }

