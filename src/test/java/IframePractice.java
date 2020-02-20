import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframePractice {
    private static WebDriver driver;
    @BeforeTest
            public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void typeWords(){
        driver.get("http://the-internet.herokuapp.com/iframe");
       driver.switchTo().frame(0);
        // driver.switchTo().frame("mce_0_ifr");
      WebElement startTyping = driver.findElement(By.id("tinymce"));
      startTyping.clear();
      startTyping.sendKeys("Ariet Stamov");
        driver.switchTo().defaultContent();
      WebElement header = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));

        System.out.println(header.getText());

    }
    @Test
    public void practiceTest(){
        driver.get("https://www.quirksmode.org/iframetest.html");
        driver.switchTo().frame(0);
        WebElement text = driver.findElement(By.xpath("//h1[.='Test page in iframe']"));
        String expectedText ="Test page in iframe";
        String actaul = text.getText();
        System.out.println(actaul);
        Assert.assertEquals(actaul,expectedText);
    }
    @Test
    public void iframePractice(){
        driver.get("https://www.toolsqa.com/iframe-practice-page/");
       driver.switchTo().frame("iframe1");
        WebDriverWait wait = new WebDriverWait(driver,12);
       Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
       WebElement softWareTools =wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[.='Software Testing Tutorial']"))));

      softWareTools.click();

    }

}
