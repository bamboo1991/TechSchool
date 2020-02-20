package utills;

import java.io.FileInputStream;
import java.util.Properties;

public  class configReader {
   static Properties configFIle;

    static {
        try {
            String path = "ariet.properties";
            FileInputStream input = new FileInputStream(path);
            configFIle = new Properties();
            configFIle.load(input);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static String getProporties(String keyName){
        return  configFIle.getProperty(keyName);

    }
}