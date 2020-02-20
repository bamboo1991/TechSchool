package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class duckDuckDo_page {
    public duckDuckDo_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
        @FindBy(id = "search_form_input_homepage")
                public WebElement searchbox;
    @FindBy(id = "search_form_homepage")
                public WebElement searchButton;
        @FindBy(xpath = "//a[.='Videos']")
                public WebElement vidoeSection;


    }
