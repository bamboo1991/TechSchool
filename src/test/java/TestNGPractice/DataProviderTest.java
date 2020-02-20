package TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @DataProvider(name = "states")
    public Object[][] getDta(){
            return new Object[][]{
                    {"Il","Chicago","60018"},
                    {"Az", "Nevada","66668"},
                    {"NJ","Cherry Hill","55555"}

            };
    }
    @Test(dataProvider = "states",groups = {"usa"})
    public void printsTATES(String state, String city, String zipcode){
        System.out.println("State is "+state+" City is "+ city+" ZipCode is "+zipcode);
    }
}
