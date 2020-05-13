package Framework.PageObjects;

import com.beust.jcommander.IValueValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * This class contains the basic keywords like click or type etc with a explicit wait by default
 */
public class PageObjectBase {
    public WebDriver driver;
    public static final int DEFAULT_TIME_OUT = 1;
    public PageObjectBase(WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     *
     * @param element - elements to be clicked
     * @param waitTime - user defined wait time to wait for
     */
    public void click(WebElement element, int waitTime)
    {
        getWait(waitTime).until(ExpectedConditions.elementToBeClickable(element)).click();

    }
    public void click(WebElement element)
    {
        click(element,DEFAULT_TIME_OUT);
        //element.click();
    }

    public void type(WebElement element, String value)
    {
        getWait().until(ExpectedConditions.elementToBeClickable(element)).clear();
        element.sendKeys(value);
    }
    public Boolean isDisplayed(WebElement element)
    {
        try {
          getWait().until(ExpectedConditions.elementToBeClickable(element)).isDisplayed();
        } catch (Exception e) {
            return false;

        }
        return true;
        //        return element.isDisplayed();

    }



    public WebDriverWait getWait()
    {
        return getWait(DEFAULT_TIME_OUT);

    }
    public WebDriverWait getWait(int WaitTime)
    {
        return new WebDriverWait(driver, Duration.ofSeconds(WaitTime));

    }

}
