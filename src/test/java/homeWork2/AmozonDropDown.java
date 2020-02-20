package homeWork2;

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

public class AmozonDropDown {
    private static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void slideOver(){
        driver.navigate().to("https://www.amazon.com");
        WebElement dd1 =driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dd1);
        select.selectByVisibleText("Books");

        List<WebElement> listOfProducts= select.getAllSelectedOptions();
       Assert.assertTrue(!listOfProducts.isEmpty(),"No it was something else");
       for (WebElement allSelected:listOfProducts){
            System.out.println(allSelected.getText());
        }

    }
}
