package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPage {
    public OrangeHRMPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "txtUsername")
    public WebElement username;
    @FindBy(id = "txtPassword")
    public WebElement password;
    @FindBy(id = "btnLogin")
    public WebElement loginbtn;
    @FindBy(className = "page-title")
    public WebElement dashboard;
    @FindBy(className = "dashboardCard-title-for-card")
    public WebElement retryLogin;


}
