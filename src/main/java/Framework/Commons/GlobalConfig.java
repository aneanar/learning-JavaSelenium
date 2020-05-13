package Framework.Commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalConfig {
//Singleton class
    private static GlobalConfig config = null;
    private Properties prop;
    private FileInputStream fis;


    private GlobalConfig()  {

        try
        {
            prop = new Properties();
            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
            prop.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static GlobalConfig getProperties() {
        if (config==null){
           config= new GlobalConfig();
        }

        return config;
    }

    public String get(String key) {
        return prop.getProperty(key);
    }

    public void set(String key, String value) {
        prop.setProperty(key,value);
    }
}
