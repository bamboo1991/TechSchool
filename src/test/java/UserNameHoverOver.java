import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserNameHoverOver {
    private static WebDriver driver;


    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println();





    }


    @Test
    public void rightClick(){
        Actions actions =new Actions(driver);
        actions.contextClick();// this is interview question.
        driver.get("http://the-internet.herokuapp.com/context_menu");
        WebElement HotSpot = driver.findElement(By.id("hot-spot"));
        actions.contextClick(HotSpot).build().perform();
        System.out.println();

    }
    @Test
    public void hoverOver(){
        Actions actions =new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement HotSpot = driver.findElement(By.xpath("//h5[.='name: user1']//parent::div//preceding-sibling::img[@src='/img/avatar-blank.jpg']"));
        actions.moveToElement(HotSpot).perform();
        WebElement userInfo1 = driver.findElement(By.xpath("//h5[.='name: user2']"));
        WebElement userInf2 = driver.findElement(By.xpath("//h5[.='name: user3']"));

Assert.assertFalse(userInf2.isDisplayed());
    }
    @Test
    public void user3HoverOver(){
        Actions actions =new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement user3 = driver.findElement(By.xpath("//h5[.='name: user3']//parent::div//preceding-sibling::img"));
        actions.moveToElement(user3).perform();
        WebElement user1Info =driver.findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2info=driver.findElement(By.xpath("//h5[.='name: user2']"));
        boolean bool = user1Info.isDisplayed()&user2info.isDisplayed();
        Assert.assertFalse(bool,"false");
    }
}
