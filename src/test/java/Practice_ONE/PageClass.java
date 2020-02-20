package Practice_ONE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageClass {
    public PageClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
