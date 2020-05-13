package Framework.TestScript;

import Framework.Commons.BaseClass;
import Framework.Commons.CustomAssertor;
import Framework.Commons.LoggerClass;
import Framework.Commons.ReportUtility;
import Framework.PageObjects.HomePage;
import Framework.PageObjects.SignInPage;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginTest extends BaseClass {

    @Test(enabled = true, groups = {"Smoke"}, dataProvider = "InvalidLoginData", dataProviderClass = Framework.DataProviders.Dp_Login.class)
    public void validateInvalidLoginScenario(Map<String, String> testdata) {
        LoggerClass.info("execution Started for validateInvalidLoginScenario");
        test = extentReports.createTest("validateInvalidLoginScenario");
        test.info("Execution Started");
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        LoggerClass.info("Navigated to Home screen");
        homePage.clickSignInLink();
        LoggerClass.info("Navigated to Sign In page");
        signInPage.enterUserCredential(testdata.get("UserName"), testdata.get("Password"));
        myAssertor= new CustomAssertor(test);
        // Note -Give the symbol # so that screenshot get captured on report as well
        myAssertor.assertTrue(signInPage.isInvalidErrorMessageDisplayed(),"Validated Error Message and test case PASSED#"+getscreenShot()+"#");

  /*      if (signInPage.isInvalidErrorMessageDisplayed())

        {
            System.out.println("Test Case Pass");
            //adding to report with out sreenshot using ReportUtlity class wrapper function
            ReportUtility.pass(test, "Validated Error Message and test case PASSED");

            //adding to report with screenshot using ReportUtlity class wrapper function
            ReportUtility.pass(test, "", getscreenShot());


            //test.pass("Validated Error Message and test case PASSED");
        }
*/

   /*     else {
            System.out.println("Test Case Fail");

            //adding to report with out sreenshot using ReportUtlity class wrapper function
            ReportUtility.fail(test, "Validated Error Message and test case FAILED");

            //adding to report with screenshot using ReportUtlity class wrapper function
            ReportUtility.fail(test, "", getscreenShot());
            //Normal usage of status reporting to the report
            //test.fail("Validated Error Message and test case PASSED");
        }

    */
        myAssertor.assertAll();
    }


}
