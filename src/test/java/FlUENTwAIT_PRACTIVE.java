import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utills.Driver;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FlUENTwAIT_PRACTIVE {

    private static WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        driver = Driver.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void fluentWaitTest(){
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement Enabled = driver.findElement(By.xpath("//button"));
        Enabled.click();
        WebDriverWait wait1 = new WebDriverWait(driver,10);
        Boolean isvisibility = wait1.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("LOADING"))));
        assert isvisibility;
        Wait<WebDriver> wait =
                new FluentWait(driver).
                withTimeout(Duration.
                ofSeconds(10)
        ).pollingEvery(Duration.ofSeconds(2)
        ).ignoring(NoSuchElementException.class);
WebElement enabledMessage = wait.until(new Function<WebDriver, WebElement>() {
    @Override
    public WebElement apply(WebDriver driver) {
        return driver.findElement(By.xpath("//p[@id='message']"));
    }
});
        Assert.assertTrue(enabledMessage.getText().equals("It's enabled!"));
    }

}