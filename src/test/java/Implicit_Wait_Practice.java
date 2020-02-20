
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Implicit_Wait_Practice {
   private static WebDriver driver;
    @BeforeClass
    public void setUpDriver(){
        driver= Driver.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test(priority = 2,description = "Remove btn will display the 'it is gone' contects")
    public void validateRemoveBtn(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement button = driver.findElement(By.xpath("//form[@id='checkbox-example']//following-sibling::button"));
        button.click();
        WebElement TEXT = driver.findElement(By.id("message"));
        String actual = TEXT.getText();
        String expected = "It's gone!";
        Assert.assertEquals(actual,expected);
        button.click();
        WebElement backMsg = driver.findElement(By.xpath("//p[@id='message']"));
        String expectedText = "It's back!";
        String actualText = backMsg.getText();
        Assert.assertTrue(backMsg.isDisplayed());
        Assert.assertEquals(expectedText,actualText);
    }
    @Test(priority = 1,description = "explicit wait")
    public void enabled(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement Enabled = driver.findElement(By.xpath("//button[.='Enable']"));
        Enabled.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement Enabled1=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[.=\"It's enabled!\"]"))));
        System.out.println("It's enabled!");
        String actual =Enabled1.getText();
        assert "It's enabled!".equals(actual);
    }
    @Test(priority = 3,description = "invisibility of ")
public void visibility() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement Enabled = driver.findElement(By.xpath("//button[.='Enable']"));
        Enabled.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Boolean loadindButton = wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
        assert (loadindButton);
    }
@Test
    public void secondEnableButton(){
    driver.get("http://the-internet.herokuapp.com/dynamic_controls");
    WebDriverWait wait = new WebDriverWait(driver, 20);
    WebElement Enabled = driver.findElement(By.xpath("//button[.='Enable']"));
    Enabled.click();
    Wait<WebDriver> wait2 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
    WebElement message = wait2.until(
       driver->driver.findElement(By.id("message"))
    );

    assert "It's enabled!".equals(message.getText());

    }

}
