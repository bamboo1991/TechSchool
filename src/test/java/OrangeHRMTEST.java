import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.testng.Assert;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Test;
        import utills.Driver;

public class OrangeHRMTEST {

    private static WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void setUp(){

        driver = Driver.getDriver("ff");
        driver.manage().window().maximize();
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/client/#/dashboard");
        WebElement logingButton = driver.findElement(By.id("btnLogin"));
        logingButton.click();

    }

    @Test
    public void verifyURL(){
        String expectedUrl="https://orangehrm-demo-6x.orangehrmlive.com/client/#/dashboard";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actual);
    }
    @Test(groups = {"title"})
    public void title(){
        String expectedTitle = "OrangeHRM";
        String actaul = driver.getTitle();
        Assert.assertEquals(expectedTitle,actaul);
    }
}
