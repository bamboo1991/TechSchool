package TestNGPractice;

import org.testng.annotations.*;

public class AnnotationPractice {
    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class annotation");
    }

@BeforeMethod
public void beforeMethod(){
    System.out.println("this is before method annotation ");
}
@Test(priority = 1, enabled = false,alwaysRun = true)
    public void test(){
    System.out.println("this is form test 1 ");
}
@Test(priority = 2)
    public void test2(){
        System.out.println("this is form test 2 ");
    }
@AfterMethod
    public void afterMethod(){
    System.out.println("this is from after method annotation");
}
@AfterClass
    public void afterClass(){
    System.out.println("this is after class annotation ");
}


}
