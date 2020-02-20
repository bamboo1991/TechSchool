import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.testng.annotations.Test;
import utills.BrpwserUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class brokenLinks extends TestBase {
    @Test
    public void testBroken() {
        driver.get("https://www.softwaretestingmaterial.com/");
            List<WebElement> links = driver.findElements(By.xpath("//a"));
            BrpwserUtils.verifyLinks(links);
            }
        }



