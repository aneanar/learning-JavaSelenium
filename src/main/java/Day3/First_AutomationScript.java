package Day3;

import Framework.Constants.ApplicationConstants;
import Utilities.PropertiesFile;
import Utilities.Screenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.lang.Enum.valueOf;
import static java.util.concurrent.TimeUnit.SECONDS;

public class First_AutomationScript {
   public static WebDriver driver ;
    public static void main(String[] args) throws Exception {

        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(ApplicationConstants.REPORT_PATH+"\\Report.html");
        ExtentLoggerReporter extentLoggerReporter = new ExtentLoggerReporter(ApplicationConstants.REPORT_PATH);
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter,extentLoggerReporter);
        ExtentTest test = extentReports.createTest("My first Automation script");


        test.info("execution started");


//        launch application on chrome and maximize
        System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);
        Screenshot screenshotObj = new Screenshot() ;
        driver.get(PropertiesFile.readConfigValue(PropertiesFile.readConfigValue("env")));
        driver.manage().window().maximize();



//        enter loan amount
        driver.findElement(By.id("loanamount")).sendKeys("2000");

        screenshotObj.take();

//        enter interest rate
        driver.findElement(By.name("rate")).sendKeys("10");
//        enter tenure
        driver.findElement(By.id("pmonths")).sendKeys("20");
//        click on calculate button
        driver.findElement(By.id("Button1")).click();
//        Extract the Value
        String EMI= driver.findElement(By.id("EMI")).getAttribute("value");
        test.pass("pased");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        screenshotObj.take();
        float emis =  Float.parseFloat(EMI);
        emis = (float)10.873+emis;
        System.out.println(emis);
        test.fail("failed");
        extentReports.flush();
//        close the driver


        driver.quit();
        System.exit(0);

    }
}
