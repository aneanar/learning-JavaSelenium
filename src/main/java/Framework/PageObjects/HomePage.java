package Framework.PageObjects;

import Framework.Commons.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObjectBase{
    //Objects list starts here======================
    WebDriver driver;

    @FindBy(linkText = "Sign In")
    private WebElement lk_signIn ;

    public HomePage(WebDriver driver) {

        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Object List ends here==========================



    public void clickSignInLink(){
        click(lk_signIn);
       // lk_signIn.click();
    }

}
