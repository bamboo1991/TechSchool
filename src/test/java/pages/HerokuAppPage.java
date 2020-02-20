package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppPage {
    public HerokuAppPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='uploadfile_0']")
    public WebElement chooseFile;


    @FindBy(xpath = "//input[@id='terms']")
    public WebElement terms;



    @FindBy(xpath = "//button[@id='submitbutton']")
    public WebElement fileSubmit;

    @FindBy(xpath = "//h3")
    public WebElement Header1;

}