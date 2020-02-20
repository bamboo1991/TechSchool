import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class AddElment extends TestBase{
    @Test
    public void addElements(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement header = driver.findElement(By.tagName("h3"));
        Assert.assertEquals(header.getText(),"Add/Remove Elements");
        WebElement addElement = driver.findElement(By.xpath("//div/button[@onclick='addElement()']"));
        for (int i=0;i<=4; i++){
            addElement.click();
        }
        WebElement deleteButton = driver.findElement(By.xpath("//div/button[@onclick='deleteElement()']"));
int count = 0;
while (count<=4){
    deleteButton.click();
     deleteButton = driver.findElement(By.xpath("//div/button[@onclick='deleteElement()']"));
     count++;
}
Assert.assertTrue(deleteButton.isDisplayed());


    }
    @Test
    public void deleteButtons(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElement = driver.findElement(By.xpath("//div/button[@onclick='addElement()']"));
        for (int i=0; i<=4; i++){
            addElement.click();
        }
        List<WebElement> deleteButtonList = driver.findElements(By.xpath("//div/button[@onclick='added-manually']"));
        Assert.assertEquals(5,deleteButtonList.size());
        int count =0;
        while (count<=4){
            deleteButtonList.get(count).click();
            count++;
        }
        deleteButtonList = driver.findElements(By.xpath("//div/button[@onclick='added-manually']"));
        Assert.assertEquals(1,deleteButtonList.size());
    }
}
