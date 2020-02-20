import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    private static WebDriver driver;
    @BeforeTest
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void checkBox1(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1 =driver.findElement(By.xpath("//input[last()-1]"));
        List<WebElement> checkBox2 =driver.findElements(By.xpath("//input[@id='checkboxes']"));
        for (WebElement task : checkBox2){
            if (task.isSelected()){
                task.click();
                Assert.assertFalse(checkBox1.isSelected(),"it is failed because saasd");
            }else if (!task.isSelected()){
                task.click();
                Assert.assertTrue(checkBox1.isSelected(),"it is failed because saasd");
        }


}

    }
    @Test
    public void checkBox2(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1 =driver.findElement(By.xpath("//input[last()-1]"));
        checkBox1.click();
        System.out.println(checkBox1.getAttribute("checked" ));
    }
}