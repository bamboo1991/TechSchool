import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\stamo\\Downloads\\Bank\\SELENIUM\\src\\test\\Java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.expedia.com");
    }
}
