package Framework.Commons;

import Utilities.PropertiesFile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static Framework.Constants.ApplicationConstants.*;


public class BaseClass {

    public WebDriver driver;
    public static GlobalConfig configreader;
    public static ExtentReports extentReports;
    public ExtentTest test;
    public CustomAssertor myAssertor;

    @BeforeSuite
    public void initSuite() {

        configreader = GlobalConfig.getProperties();
        extentReports=ReportUtility.getReport();
    }
    /*
    This function is to execute before every @Test case
     */
    @Parameters("browser")
    @BeforeMethod
    public void lauchApp(String browser) throws IOException {

        switch (browser.toLowerCase())
        {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("useAutomationExtension", false);
                System.setProperty("webdriver.chrome.driver",CHROME_DRIVER_PATH);
                driver = new ChromeDriver(options);
                LoggerClass.info("Browser launched");
                driver.get(configreader.get(configreader.get(CURENT_ENVIRONMENT)));
                LoggerClass.info("navigated to the url : "+configreader.get(configreader.get(CURENT_ENVIRONMENT)));
                break;

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    /*
This function is to execute after every @Test case
 */
    @AfterMethod
    public void tearDown () throws InterruptedException {
        driver.quit();
        extentReports.flush();
        LoggerClass.info("Browser closed successfully and reports were saved");
    }

    public  void closeAlert()
    {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String getscreenShot()  {

        String fileName= REPORT_PATH+"\\screenshots\\Screenshot_"+getUniqueDateTimeStamp()+".png";

        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File temp = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(temp, new File(fileName));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return fileName;
    }

    public String getUniqueDateTimeStamp ()
    {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy hh-mm-sss");
        return formatter.format(date);
    }




}
