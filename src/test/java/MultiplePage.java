import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MultiplePage {
    public MultiplePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
