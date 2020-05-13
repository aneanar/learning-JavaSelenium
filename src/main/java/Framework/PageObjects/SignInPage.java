package Framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends PageObjectBase {
    WebDriver driver;
    //Objects list for Sign in page starts here======================
    @FindBy(name = "logid")
    private WebElement txt_emailID;
    @FindBy(name = "pswd")
    private WebElement txt_passwod;
    @FindBy(xpath="//input[@value='Login']")
    private WebElement btn_login;
    @FindBy(xpath="//b[contains(text(),'The username and/or password you entered is incorrect.')]")
    private WebElement lbl_errorMessage;


    /**
     *constructor to initiate all webelement from test script
     * @param driver
     *
     */

    public SignInPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Object List for Sign In page ends here==========================

    //Page reusable functions as below

    /**
     *function accept user name and password and do login attempt
     * @param userName
     * @param password
     */
    public void enterUserCredential(String userName, String password)
    {
        type(txt_emailID,userName);
        type(txt_passwod,password);
        click(btn_login);

//        txt_emailID.sendKeys(userName);
//        txt_passwod.sendKeys(password);
//        btn_login.click();

    }

    /**
     * 
     * @return
     */
    public boolean isInvalidErrorMessageDisplayed()
    {
//        return lbl_errorMessage.isDisplayed();
        return isDisplayed(lbl_errorMessage);
    }



}
