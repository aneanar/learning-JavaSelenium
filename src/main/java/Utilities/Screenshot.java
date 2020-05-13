package Utilities;

import Day3.First_AutomationScript;
import Day7.Base_driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Screenshot extends First_AutomationScript {


    public void take() throws IOException {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy hh-mm-sss");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File img= screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img, new File(System.getProperty("user.dir") + "\\Screenshots\\screenshot"+formatter.format(date)+".png"));
    }

}
