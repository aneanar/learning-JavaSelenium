package Framework.Commons;

import Framework.Constants.ApplicationConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;

import static Framework.Constants.ApplicationConstants.REPORT_PATH;

public class ReportUtility {


    private static ReportUtility report ;
    private static ExtentReports extentReports;


    private ReportUtility()
    {

        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(REPORT_PATH+"\\Report.html");
        ExtentLoggerReporter extentLoggerReporter = new ExtentLoggerReporter(REPORT_PATH);
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter,extentLoggerReporter);

    }

    public static ExtentReports getReport (){
        if (report==null)
        {
            report = new ReportUtility();
        }
        return extentReports;
    }


    public static void pass (ExtentTest test, String comment)
    {
        test.pass(comment);
    }
    public static void pass (ExtentTest test, String comment,String screenshotPath)  {
        try{
            test.pass(comment, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath.replace(REPORT_PATH+"\\","")).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fail (ExtentTest test, String comment)
    {
        test.fail(comment);
    }

    public static void fail (ExtentTest test, String comment,String screenshotPath)
    {
        try{
            test.pass(comment,MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath.replace(REPORT_PATH+"\\","")).build());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
