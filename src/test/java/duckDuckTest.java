import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HerokuAlertPage;
import pages.HerokuAppPage;
import utills.BrpwserUtils;

import java.io.IOException;
import java.util.ListIterator;

public class duckDuckTest extends TestBase {
   @DataProvider(name = "searchValue")
   public Object[][]getSearchValue(){
       return new Object[][]{{"Selenium"},{"Docker"},{"Api"}};


   }


    @Test(dataProvider = "searchValue")
    public void testDuck(String searchValue){
        HerokuAlertPage page = new HerokuAlertPage(driver);
        driver.navigate().to("https://duckduckgo.com/");
        page.searchbox.sendKeys(searchValue);
        page.searchButton.click();
        String expected=searchValue+" at DuckDuckGo";
        String actual =driver.getTitle();
        sa.assertEquals(expected,actual);
        page.vidoeSection.click();
        BrpwserUtils.waitVisibility(driver,page.videos.get(0),10);
        int countVideo=page.videos.size();
        System.out.println(countVideo);
        System.out.println("this is total numbers of videos");

        sa.assertTrue(countVideo>29);
        sa.assertAll();
   }
    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
if (result.getStatus()==ITestResult.FAILURE)
       BrpwserUtils.takeScreenShots(driver);

    }

}
