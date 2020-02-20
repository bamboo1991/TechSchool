
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;


        public class FileUpload extends TestBase{
            @Test
            public void uploadFile() {
                driver.navigate().to("http://demo.guru99.com/test/upload/");
            }
                @Test( )
                public void uploadFile2(){
                HerokuAppPage page = new HerokuAppPage(driver);
                page.chooseFile.sendKeys("C:C:\\Users\\stamo\\Downloads\\breakUpload.png");
                page.terms.click();
                page.fileSubmit.click();
                String expected = page.Header1.getText();
                String actual = page.Header1.getText();
                    System.out.println(actual);
                Assert.assertEquals(expected,actual);

                }



            }

