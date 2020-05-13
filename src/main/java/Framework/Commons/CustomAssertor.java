package Framework.Commons;

import com.aventstack.extentreports.ExtentTest;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class CustomAssertor extends SoftAssert {


    private  ExtentTest test;

    public CustomAssertor(ExtentTest test) {
        this.test=test;

    }
    @Override
    public void onAssertSuccess(IAssert<?> assertCommand) {
        if(assertCommand.getMessage().contains("#")) {
            ReportUtility.pass(test, assertCommand.getMessage().split("#")[0]);
            ReportUtility.pass(test,"", assertCommand.getMessage().split("#")[1]);
        }
        else {
            ReportUtility.pass(test,assertCommand.getMessage());
        }
    }

    @Override
    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
        if(ex.toString().contains("#")) {

            ReportUtility.fail(test,ex.getMessage().split("#")[0]);
            ReportUtility.fail(test, "", ex.getMessage().split("#")[1]);
        }
        else {
            ReportUtility.fail(test,ex.getMessage());
        }

    }


}
