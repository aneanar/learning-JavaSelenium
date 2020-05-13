package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public   class PropertiesFile {

  public static Properties prop = null;
    public static String readConfigValue (String key) throws IOException {
        if (prop==null) {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
            prop.load(fis);
            fis.close();
        }
        return (prop.getProperty(key));



    }
}
