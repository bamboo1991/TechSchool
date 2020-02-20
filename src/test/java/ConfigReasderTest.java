import org.testng.annotations.Test;
import utills.configReader;

public class ConfigReasderTest {
    @Test
public void testConfig1(){
    String auth = configReader.getProporties("Authorization");
    System.out.println(auth);
    String username= configReader.getProporties("username");
    System.out.println(username);
    String password= configReader.getProporties("password");
    System.out.println(password);
    String adrr = configReader.getProporties("WebsiteAddress");
    System.out.println(adrr);
    String token = configReader.getProporties("tokenWebsiteAddress");
    System.out.println(token);
    String api = configReader.getProporties("ApiUrl");
    System.out.println(api);
    String base = configReader.getProporties("baseUrl");
    System.out.println(base);
}
}
