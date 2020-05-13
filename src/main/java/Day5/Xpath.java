package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static java.lang.Enum.valueOf;
import static java.util.concurrent.TimeUnit.SECONDS;
public class Xpath {

    public static void main(String[] args) throws InterruptedException {
//        launch application on chrome and maximize
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aneesh.narayanan\\Desktop\\OLD DEsktop items\\Learning\\Selenium_training_EY\\Artifacts\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx"); ;
        driver.manage().window().maximize();
        Thread.sleep(5000);


//        enter loan amount
        driver.findElement(By.xpath("//input[@name='loanamount']")).sendKeys("2000");



//        enter interest rate
        driver.findElement(By.xpath("//tr[@id='Tr1']/td[3]/input")).sendKeys("10");
//        enter tenure
        driver.findElement(By.xpath("//tr[@id='Tr2']/td[3]/input[@name='pmonths']")).sendKeys("20");
//        click on calculate button
        driver.findElement(By.xpath("//input[@name='Button1' or @id='Button1']")).click();
//        Extract the Value
        String EMI= driver.findElement(By.id("EMI")).getAttribute("value");
        float emis =  Float.parseFloat(EMI);
        emis = (float)10.873+emis;
        System.out.println(emis);
        Thread.sleep(10000);
//        close the driver


        driver.quit();
        System.exit(0);
    }

}
