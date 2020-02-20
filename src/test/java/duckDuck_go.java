import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class duckDuck_go extends TestBase{
    @Test
    public void TestDuck(){

        driver.navigate().to("https://www.duckduckgo.com");
    }
}
