package TestNGPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
    public class groupPractice {
    @BeforeTest

    @Test(groups = {"cars"}, timeOut = 200)
    public void printCars() throws InterruptedException {
        System.out.println("Toyota Corolla");
        System.out.println("Mercedes-c300");
        System.out.println("Porsche - Cayman 718");
        System.out.println("BMW-520");
        Thread.sleep(300);
    }

    @Test(groups = {"languages"})
    public void printLanguages() {
        System.out.println("English");
        System.out.println("Russian");
        System.out.println("Arabic");
        System.out.println("Dutch");
    }

    @Test(groups = {"codeLanguages"})
    public void printCodeLanguages() {
        System.out.println("java");
        System.out.println("python");
        System.out.println("c#");
        System.out.println("c++");
    }

    @Test(groups = {"tools"})
    public void testingTools() {
        System.out.println("Selenium");
        System.out.println("Cucumber");
        System.out.println("TestNG");
        System.out.println("Maven");
        System.out.println("PostMan");
      }

              }






