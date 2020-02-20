//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import pages.HerokuAlertPage;
//import pages.HerokuAppPage;
//import utills.BrpwserUtils;
//
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//public class MultipleWindows  {
//    private static WebDriver driver;
//    @BeforeTest
//    public void setDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver =new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//    @Test(priority = 1)
//    public void TEST1(){
//        driver.get("http://the-internet.herokuapp.com/windows");
//       HerokuAlertPage page = new HerokuAlertPage(driver);
//       page..click();
//        System.out.println(driver.getWindowHandle());
//        String mainWindow = driver.getWindowHandle();
//        Set<String> pageIds = driver.getWindowHandles();
//        System.out.println(pageIds);
//        for (String window : pageIds){
//            if (!mainWindow.equals(window)){
//                driver.switchTo().window(window);
//                System.out.println("After switch "+driver.getTitle());// New Windows
//            }
//        }
//        driver.switchTo().window(mainWindow);
//        System.out.println("After switching to the main "+ driver.getTitle());// the internet
//    }
//    @Test(priority = 2)
//    public void switchTitle(){
//       driver.get("http://the-internet.herokuapp.com/windows");
//       HerokuAlertPage page = new HerokuAlertPage(driver);
//       page.clickHereBtn.click();
//       String mainWinDow =driver.getWindowHandle();
//        System.out.println("before switch "+ driver.getTitle());
//        BrpwserUtils.SwitchWindow(driver,"New Window");
//        System.out.println("after switch "+driver.getTitle());
//        driver.switchTo().window(mainWinDow);
//    }
//}
