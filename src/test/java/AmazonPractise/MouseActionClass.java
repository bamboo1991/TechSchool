package AmazonPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class MouseActionClass extends TestBase {
   @BeforeTest
    public void beforeTest() {

        driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
        System.out.println("-------------------------------------");
        System.out.println("------------BEFORE TEST--------------");
        System.out.println("-------------------------------------");
    }

    @Test(priority = 2)
    public void doublClickItnro() {
        Actions actions = new Actions(driver);
        WebElement puff = driver.findElement(By.id("puff_header"));
        actions.doubleClick(puff).build().perform();
    }

    @Test(priority = 1)
    public void doublClickItnro2() {
        Actions actions = new Actions(driver);
        List<WebElement> elementsList = driver.findElements
                (By.xpath("//tbody//div[contains(@id,'header')]//following-sibling::div"));//or //tbody//div[contains(@id,'content')]
        for (WebElement element : elementsList) {
            switch (element.getText()) {
                case "click":
                    actions.click(element).build().perform();
                    break;
                case "doubleClick":
                    actions.doubleClick(element).build().perform();
                    break;
            }
//            driver.get("URL");
//            driver.findElement(By.linkText("Todays's deals")).click();
//            driver.findElement(By.partialLinkText("Best Sellers")).click();
//            driver.close();
//            driver.quit();
        }

    }
}