import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utills.Driver;

public class explicitl_wait_praictice {


    private static WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        driver = Driver.getDriver("chrome");
    }
    @Test
    public void explicitWait(){
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButtton = driver.findElement(By.xpath("//button"));
        startButtton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement helloWorld=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[.='Hello World!']"))));

String expected = "Hello World!";
String actual = helloWorld.getText();
        Assert.assertEquals(actual,expected);
    }
}