package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyLocators {
    public static void main(String[] args) {

//        Launch the application on Firefox browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aneesh.narayanan\\Desktop\\OLD DEsktop items\\Learning\\Selenium_training_EY\\Artifacts\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.bing.com/");

        driver.findElement(By.className("sb_form_q")).sendKeys("Selenium");
        driver.findElement(By.id("sb_form_go")).submit();
        driver.quit();
        System.exit(1);

    }
}