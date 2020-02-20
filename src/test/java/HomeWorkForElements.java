import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWorkForElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.chase.com");
        WebElement firstElement = driver.findElement(By.xpath("//div/a[@class='header__section__item header__section--sidemenu icon-menu chaseanalytics-track-link']"));
        firstElement.click();
        WebElement homeButton = driver.findElement(By.xpath("//li/a[@class=' chaseanalytics-track-link category-home']"));
        homeButton.click();
        WebElement nextButton = driver.findElement(By.xpath("//div[3]/button[@class='slick-next chaseanalytics-track-link slick-arrow']"));
        nextButton.click();
        WebElement homeMortgage = driver.findElement(By.id("DA_529180903462"));
        homeMortgage.click();
    }
}
