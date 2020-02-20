package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utills.Driver;

import java.util.List;

public class AmazonPage1 {
    public AmazonPage1(){
        PageFactory.initElements(DriverSetUp.getDriver("chrome"),this);}

        @FindBy(xpath = "//span[@class='a-size-base']")
                public List<WebElement>ratings;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
public List<WebElement>listOfProducts;
}