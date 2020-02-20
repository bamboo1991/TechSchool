import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaIntro {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com");
//        WebElement cars = driver.findElement(By.xpath("//button[@id='tab-car-tab-hp']"));
//        cars.click();
//        WebElement pickUpFiled = driver.findElement(By.xpath("//input[@id='car-pickup-hp-car']"));
//        pickUpFiled.sendKeys("Chicago");
//        WebElement destination = driver.findElement(By.xpath("//input[@id='car-dropoff-hp-car']"));
//        destination.sendKeys("Cleveland");
//        WebElement pickupDate = driver.findElement(By.xpath("//input[@id='car-pickup-date-hp-car']"));
//        pickupDate.sendKeys("01/28/2020");
//        WebElement returnDate = driver.findElement(By.xpath("//input[@id='car-dropoff-date-hp-car']"));
//        returnDate.sendKeys("02/02/2020");
//        WebElement pickUpTime = driver.findElement(By.xpath("//select[@id='car-pickup-time-hp-car']"));
//        pickUpTime.sendKeys("11:20am");
//        WebElement checkButtom = driver.findElement(By.xpath("//input[@id='aarp-car-rates-check-hp-car']"));
//        checkButtom.click();
//        WebElement search = driver.findElement(By.xpath("//button[@id='gcw-submit-car']"));
//
//        search.click();

// navigate to expedia.com
        // click on bundle and save button
        //enter some text in origin field
        // enter some text in destination field.
       // driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"));
//        WebElement bundleButton = driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"));
//        bundleButton.click();
//        WebElement originFiled = driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
//        originFiled.sendKeys("Chicago");
//        WebElement destinationFiled = driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
//        destinationFiled.sendKeys("Cleveland, Ohio");
//        destinationFiled.click();
//
//        WebElement returnFiled = driver.findElement(By.xpath("//input[@id='package-returning-hp-package']"));
//        returnFiled.sendKeys("02/03/2020");
//        //WebElement searchFiled = driver.findElement(By.xpath("//button[@id='search-button-hp-package']"));
//        WebElement departingField = driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
//        departingField.sendKeys("01/28/2020"+ Keys.ENTER);
       WebElement title = driver.findElement(By.xpath("//[title='Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations']"));
        System.err.println("---------------------->"+title.getText());
    }
}

