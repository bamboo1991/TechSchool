package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ProjectDay {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://s2.demo.opensourcecms.com/docebo/doceboCore/");
    WebElement navigateToLogin = driver.findElement(By.id("login_userid"));
        navigateToLogin.sendKeys("opensourcecms");
    WebElement navigateToPassword = driver.findElement(By.id("login_pwd"));
        navigateToPassword.sendKeys("opensourcecms");
    WebElement clickButton = driver.findElement(By.id("login_button"));
        clickButton.click();
        WebElement navigateToTheE_learner = driver.findElement(By.xpath("//a[@href='index.php?op=platform_sel&pl_sel=lms']"));
        navigateToTheE_learner.click();
        WebElement E_learning = driver.findElement(By.xpath("(//a[@class='arrow_left'])[5]"));
        E_learning.click();
        WebElement courseManagment = driver.findElement(By.xpath("//a[@href='index.php?modname=course&op=course_list&of_platform=lms&close_over=1']"));
        courseManagment.click();
        WebElement add_Category = driver.findElement(By.xpath("//input[@name='treeview_opnewfolder_course_category']"));
        add_Category.click();
        WebElement Category_name = driver.findElement(By.xpath("//input[@id='treeview_folder_name_course_category']"));
        Category_name.sendKeys("English");
        WebElement Create = driver.findElement(By.xpath("//input[@id='treeview_create_folder_course_category']"));
        Create.click();
    }
    @Test
    public void repeat2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://s2.demo.opensourcecms.com/docebo/doceboCore/");
        WebElement navigateToLogin = driver.findElement(By.id("login_userid"));
        navigateToLogin.sendKeys("opensourcecms");
        WebElement navigateToPassword = driver.findElement(By.id("login_pwd"));
        navigateToPassword.sendKeys("opensourcecms");
        WebElement clickButton = driver.findElement(By.id("login_button"));
        clickButton.click();
        WebElement navigateToTheE_learner = driver.findElement(By.xpath("//a[@href='index.php?op=platform_sel&pl_sel=lms']"));
        navigateToTheE_learner.click();
        WebElement E_learning = driver.findElement(By.xpath("(//a[@class='arrow_left'])[5]"));
        E_learning.click();
        WebElement courseManagment = driver.findElement(By.xpath("//a[@href='index.php?modname=course&op=course_list&of_platform=lms&close_over=1']"));
        courseManagment.click();
        WebElement new_course = driver.findElement(By.xpath("//input[@id='new_course']"));
        new_course.click();
        WebElement codeButton = driver.findElement(By.xpath("//input[@id='course_code']"));
        codeButton.sendKeys("EL001");
        WebElement courseName = driver.findElement(By.xpath("//input[@id='course_name']"));
        courseName.sendKeys("English");
        WebElement createButton = driver.findElement(By.xpath("//input[@id='course_create']"));
        createButton.click();
    }
}
