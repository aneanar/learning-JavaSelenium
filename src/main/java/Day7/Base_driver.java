package Day7;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;

        import java.util.concurrent.TimeUnit;

public class Base_driver {

  public   WebDriver driver;

    public  void launchSite(String url){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\aneesh.narayanan\\OneDrive - EY\\Documents\\Aneesh_backup\\OLD Desktop\\Learning\\Selenium_training_EY\\Artifacts\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url); ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void tearDown () throws InterruptedException {
//        Thread.sleep(2000);
        driver.quit();


    }

}
