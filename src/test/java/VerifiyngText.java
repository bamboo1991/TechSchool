import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class VerifiyngText {
    @Test
    public void testText(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/abtest");
        WebElement test = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(test.getText().startsWith("Also"));

    }
}
