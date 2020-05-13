package Day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EMI_Driver extends Base_driver{

    String emiCalculation(String amount,String rate,String months)

    {

//        enter loan amount
        driver.findElement(By.id("loanamount")).sendKeys (amount);
//        enter interest rate
        driver.findElement(By.name("rate")).sendKeys(rate);
//        enter tenure
        driver.findElement(By.id("pmonths")).sendKeys(months);
//        click on calculate button
        driver.findElement(By.id("Button1")).click();
//        Extract the Value
         String EMI= driver.findElement(By.id("EMI")).getAttribute("value");

         return EMI;
// float emis =  Float.parseFloat(EMI);

    }

}
