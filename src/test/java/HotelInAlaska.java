import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HotelInAlaska {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com");
        WebElement hotelInAlaska = driver.findElement(By.id("tab-hotel-tab-hp"));
        hotelInAlaska.click();
        WebElement goingTo = driver.findElement(By.id("hotel-destination-hp-hotel"));
        goingTo.sendKeys("Alaska");
        WebElement check_Out = driver.findElement(By.id("hotel-checkout-hp-hotel"));
        check_Out.sendKeys("02/10/2020");
        WebElement check_In = driver.findElement(By.id("hotel-checkin-hp-hotel"));
        check_In.sendKeys("02/01/2020"+ Keys.ENTER);

    }
}
