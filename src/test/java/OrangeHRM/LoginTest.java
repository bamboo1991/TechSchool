package OrangeHRM;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @DataProvider(name = "credential")
    public Object[][] getData(){
        return new Object[][]{
                {"admin","admin123"},
                {"admin","123"},
                {"ad","admin123"},
                {"as","ad"}
        };
    }
    @Test(dataProvider = "credential")
    public void testLogin(String userName, String password){
        OrangeHRMPage orangeHRMPage = new OrangeHRMPage(driver);
driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
orangeHRMPage.username.clear();
orangeHRMPage.username.sendKeys(userName);
orangeHRMPage.password.clear();
orangeHRMPage.password.sendKeys(password);
orangeHRMPage.loginbtn.click();
if (userName.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin123")) {


    String expected = "Dashboard";
    String actaul = orangeHRMPage.dashboard.getText();
    Assert.assertEquals(expected, actaul);
    driver.navigate().back();
} else{
    String expected= "Retry Login";
String actaul = orangeHRMPage.retryLogin.getText();
Assert.assertEquals(expected,actaul);
driver.navigate().back();
}
    }



}
