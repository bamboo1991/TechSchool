package TestNGPractice;

import org.testng.annotations.Test;

public class DependsOnMehtod {

    @Test(dependsOnMethods = {"secondMethod"})
    public void firstMethod(){
        System.out.println("this is first method");
    }
    @Test
    public void secondMethod(){
        System.out.println("this is second method");
    }


}
