package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HerokuAlertPage {
    public HerokuAlertPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(id = "search_form_input_homepage")
    public WebElement searchbox;
    @FindBy(id = "search_button_homepage")
    public WebElement searchButton;
    @FindBy(xpath = "//a[.='Videos']")

    public WebElement vidoeSection;
@FindBy(xpath = "//div[@class='tile  tile--c--w  tile--vid  has-detail  opt--t-xxs']")
    public List<WebElement> videos;



    }

