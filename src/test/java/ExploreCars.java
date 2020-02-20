import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreCars {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com");
        WebElement cars = driver.findElement(By.xpath("//button[@id='tab-car-tab-hp']"));
        cars.click();
        WebElement pickUpFiled = driver.findElement(By.xpath("//input[@id='car-pickup-hp-car']"));
        pickUpFiled.sendKeys("Chicago");
        WebElement destination = driver.findElement(By.xpath("//input[@id='car-dropoff-hp-car']"));
        destination.sendKeys("Cleveland");
        WebElement returnDate = driver.findElement(By.xpath("//input[@id='car-dropoff-date-hp-car']"));
        returnDate.sendKeys("02/02/2020");
        WebElement pickupDate = driver.findElement(By.xpath("//input[@id='car-pickup-date-hp-car']"));
        pickupDate.sendKeys("01/28/2020");
        WebElement pickUpTime = driver.findElement(By.xpath("//select[@id='car-pickup-time-hp-car']"));
        pickUpTime.sendKeys("11:20am");
        WebElement checkButtom = driver.findElement(By.xpath("//input[@id='aarp-car-rates-check-hp-car']"));
        checkButtom.click();
        WebElement search = driver.findElement(By.xpath("//button[@id='gcw-submit-car']"));
        search.click();
    }
}