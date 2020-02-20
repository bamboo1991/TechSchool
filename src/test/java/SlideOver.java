import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SlideOver {
    private static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void slideOver(){
        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
sliderHelper(5,0);
WebElement range =driver.findElement(By.xpath("//span[@id='range']"));
double r =Double.parseDouble(range.getText());
Assert.assertNotEquals(r,0.0);
Assert.assertTrue(r>0.0);
Assert.assertTrue(!range.getText().equals("0"));
    }
public static void sliderHelper(int Xnum, int Ynum){
        Actions actions =new Actions(driver);
    WebElement button=driver.findElement(By.xpath("//input[@type='range']"));
    actions.clickAndHold(button).moveByOffset(Xnum,Ynum).release().build().perform();
    }
@Test
    public void hoverOver(){
        driver.manage().window().maximize();
    Actions actions =new Actions(driver);
    actions.contextClick();
    driver.get("https://learn.letskodeit.com/p/practice");
        WebElement mouseButton =driver.findElement(By.id("mousehover"));
    actions.moveToElement(mouseButton).build().perform();
    WebElement reload =driver.findElement(By.xpath("//a[.='Reload']"));
    reload.click(); }
@Test
    public void Effect(){
    driver.manage().window().maximize();
    driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
    Actions actions =new Actions(driver);
    List<WebElement> list = driver.findElements(By.xpath("//tbody//div[contains(@id,'content')]"));
    for (WebElement element : list){
        switch (element.getText()){
            case "click":
                actions.click(element).build().perform();
                break;
            case "doubleclick":
                actions.doubleClick(element).build().perform();
                break;
        }}}}
