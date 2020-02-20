package utills;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import javax.swing.border.EmptyBorder;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class BrpwserUtils {
   /*
   String mainWindow = driver.getWindowHandle();
     Set<String> pageIds = driver.getWindowHandles();
        System.out.println(pageIds);
        for (String window : pageIds){
        if (!mainWindow.equals(window)) {
            driver.switchTo().window(window);
            System.out.println("After switch " + driver.getTitle());// New Windows
        }             }
    */

            public static void SwitchWindow(WebDriver driver, String targetTitle) {
                String mainWindow = driver.getWindowHandle();
                Set<String> pageIds = driver.getWindowHandles();
                if (!driver.getTitle().equals(targetTitle)) {
                    for (String window : pageIds) {
                        driver.switchTo().window(window);
                        if (driver.getTitle().equals(targetTitle)) {
                            break;
                        }
                    }
                }
            }
            public static void verifyLinks(List<WebElement> links){
                for (WebElement link:links){
                    String linkAddre  = link.getAttribute("href");
                    try {
                        URL url = new URL(linkAddre);
                        HttpURLConnection connect = (HttpURLConnection)url.openConnection();
                        connect.setConnectTimeout(3000);
                        connect.connect();
                        if (connect.getResponseCode()>=300||connect.getResponseCode()>=400){
                            System.out.println(links);
                        }

                    }catch (IOException e ){
                        e.getStackTrace();
                    }

                }

            }

    public void hoverOver(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
            }
    public static void dragAndHold(WebDriver driver, WebElement from, WebElement to){
                Actions actions=new Actions(driver);
                actions.dragAndDrop(from,to).build().perform();
    }
  public static void waitVisibility(WebDriver driver, WebElement element, int seconds){
                WebDriverWait wait = new WebDriverWait(driver, seconds);
                wait.until(ExpectedConditions.visibilityOf(element));

  }
  public static void waitClickable(WebDriver driver, WebElement element, int seconds){
                WebDriverWait wait = new WebDriverWait(driver,seconds);
                wait.until(ExpectedConditions.elementToBeClickable(element));
            }
            public static void takeScreenShots(WebDriver driver) throws IOException {
                File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                File destination = new File("ScreenShotFile\\"+System.currentTimeMillis()+".png");
                FileUtils.copyFile(src,destination);
            }

}

