package TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StudentsDataProvider {
    @DataProvider(name = "Names")
    public Object[][] getName(){
        return new Object[][]{
                {"Ariet", "2000", "Class"},
                {"Baha", "1991", "techtorial"},
                {"Dima", "1990", "tech"}
        }; }
        @Test(dataProvider = "Names",groups = {"student"} )
                public void printStudents(String names,String year, String className){
            System.out.println("Name is "+names+" Year is "+year+" classname "+ className);

    }
}
