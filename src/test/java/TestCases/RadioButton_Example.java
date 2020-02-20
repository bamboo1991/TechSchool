package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButton_Example {
    private static WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void practice1() {


        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        List<WebElement> list = driver.findElements(By.xpath("//p[.='Click on button to get the selected value']/following-sibling::label/input"));
        int elementIndex = 1;
        list.get(elementIndex).click();
checkList(elementIndex,list);
elementIndex=0;
list.get(elementIndex).click();
checkList(elementIndex, list);

    }
     private static void checkList(int element, List<WebElement> list){

       for (int i=0; i<list.size(); i++){
           if (i==element){
               Assert.assertTrue(list.get(i).isSelected());
           }else{
               Assert.assertFalse(list.get(i).isSelected());
           }
       }



        }
    }

