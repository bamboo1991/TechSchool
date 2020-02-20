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

import java.util.concurrent.TimeUnit;

public class AutomateCarPurchased {
    private static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void cityOfChicago() throws InterruptedException {
        driver.get("https://www.cars.com");
        String mainPage =driver.getTitle();
        WebElement carsDropDown = driver.findElement(By.name("stockType"));
        String option = "New Cars";
        Select carsDd = new Select(carsDropDown);
        carsDd.selectByVisibleText(option);
        WebElement pricRange = driver.findElement(By.name("priceMax"));
        Select dropDown = new Select(pricRange);
        dropDown.selectByIndex(10);
        WebElement pricRange1 = driver.findElement(By.name("makeId"));
        Select dropDown1 = new Select(pricRange1);
        dropDown1.selectByValue("20005");
        WebElement distanceRange = driver.findElement(By.name("radius"));
        Select dropDown2 = new Select(distanceRange);
        dropDown2.selectByIndex(2);
        WebElement models = driver.findElement(By.name("modelId"));
        Select dropDown3 = new Select(models);
        dropDown3.selectByIndex(6);
        WebElement searchButton =driver.findElement(By.xpath("//input[@class='NZE2g']"));
        searchButton.click();
        Thread.sleep(3000);
        String name= driver.getTitle();
        Assert.assertNotEquals(mainPage,name);

    }
    @Test
    public void deselect() throws InterruptedException {
        driver.get("https://www.cars.com");
        String mainPage =driver.getTitle();
        //select car options

        WebElement carsDropDown = driver.findElement(By.name("stockType"));
        String option = "New Cars";
        Select carsDd = new Select(carsDropDown);
        carsDd.selectByVisibleText(option);
        Thread.sleep(2);
        carsDd.deselectByVisibleText(option);
    }
}