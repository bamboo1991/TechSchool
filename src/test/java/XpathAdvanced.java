import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class XpathAdvanced {
    @Test
    public void testHeader(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/abtest");
        WebElement header1 = driver.findElement(By.tagName("h3"));
        System.out.println(header1.getText());
        Assert.assertEquals(header1.getText(),"A/B Test Variation 1");
    }
}
