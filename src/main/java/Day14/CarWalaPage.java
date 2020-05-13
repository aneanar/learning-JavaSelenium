package Day14;

import Day7.Base_driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CarWalaPage extends Base_driver {

public List<WebElement> fetchDropDwonList ()
{

    List<WebElement> options = driver.findElements(By.xpath("//select[@id='drpCity']/option"));

return options;

}

}
