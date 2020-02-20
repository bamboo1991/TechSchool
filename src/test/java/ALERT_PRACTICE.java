//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.HerokuAlertPage;
//
//public class ALERT_PRACTICE extends TestBase {
//    @Test(priority = 1)
//    public void firstAlert(){
//        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//        HerokuAlertPage page = new HerokuAlertPage(driver);
//        page.firstAlert.click();
//        Alert alert =driver.switchTo().alert();
//        alert.accept();
//        page.firstAlert.click();
//        alert.accept();
//        System.out.println(page.result.getText());
//
//    }
//    @Test(priority = 2)
//    public void secondAlert() {
//        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//        HerokuAlertPage page = new HerokuAlertPage(driver);
//        page.secondAlert.click();
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//        String expected = "Cancel";
//        String actual = page.getResult.getText();
//        Assert.assertTrue(actual.contains(expected));
//    }
//    @Test(priority = 3)
//        public void ThirdAlert(){
//        HerokuAlertPage page = new HerokuAlertPage(driver);
//        page.thirdAlert.click();
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("Techtorial");
//       alert.accept();
//       String expected = "Techtorial";
//       String actual = page.getResult.getText();
//       Assert.assertTrue(actual.endsWith(expected));
//
//        }
//        @Test(priority = 4)
//    public void sweetAlert(){
//        driver.get("https://sweetalert2.github.io/");
//        HerokuAlertPage page = new HerokuAlertPage(driver);
//        page.showNormalAlert.click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//    }
//    @Test(priority = 5)
//    public void htmlAlert(){
//        HerokuAlertPage page = new HerokuAlertPage(driver);
//        page.showSuccess.click();
//        page.htmlHnadled.click();
//
//    }
//
//
//}
