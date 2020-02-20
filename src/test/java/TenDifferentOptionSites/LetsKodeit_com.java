package TenDifferentOptionSites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LetsKodeit_com {
    private static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
@Test
    public void test1(){
        driver.manage().window().maximize();

        driver.get("https://learn.letskodeit.com/p/practice");
    WebElement dropDown = driver.findElement(By.id("multiple-select-example"));
    Select selcet = new Select(dropDown);
    if (selcet.isMultiple()){
        selcet.selectByIndex(0);
        selcet.selectByIndex(1);
    }else{
        selcet.selectByIndex(2);
    }
    List<WebElement> selectOption = selcet.getAllSelectedOptions();
    Assert.assertTrue(selectOption.size()>0);
    if (selcet.isMultiple()){
        selcet.deselectAll();
    }
    selectOption=selcet.getAllSelectedOptions();
    Assert.assertEquals(selectOption.size(),0);
    }
}
