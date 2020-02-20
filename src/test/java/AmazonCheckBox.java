import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class AmazonCheckBox {
    private static WebDriver driver;
    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @AfterTest
    public void tearDown() {
        //driver.quit();
    }
    @Test
    public void remove$() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        WebElement searchIphone = driver.findElement(By.id("twotabsearchtextbox"));
        searchIphone.sendKeys("Iphone");
        WebElement searchButton = driver.findElement(By.xpath("//form/div//input"));
        searchButton.click();
WebElement checkbox = driver.findElement(By.xpath("//li[@id='p_89/Apple']//i"));
checkbox.click();
        checkbox = driver.findElement(By.xpath("//li[@id='p_89/Apple']//input"));
        Assert.assertTrue(checkbox.isSelected());
        WebElement iOS = driver.findElement(By.xpath("//li[@id='p_n_feature_twenty_browse-bin/17881878011']//i"));
        iOS.click();
        iOS = driver.findElement(By.xpath("//li[@id='p_n_feature_twenty_browse-bin/17881878011']//input"));
        Assert.assertTrue(iOS.isSelected());
        WebElement _128GB = driver.findElement(By.xpath("//li[@id='p_n_feature_twelve_browse-bin/14674911011']//i"));
        _128GB.click();
        _128GB = driver.findElement(By.xpath("//li[@id='p_n_feature_twelve_browse-bin/14674911011']//input"));
        Assert.assertTrue(_128GB.isSelected());

     }
}