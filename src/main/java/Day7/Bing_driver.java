package Day7;

import org.openqa.selenium.By;

public class Bing_driver extends Base_driver{

    public Bing_driver()
    {
        System.out.println("super constructor");
    }

   void selectValue(String searchValue)

    {
    driver.findElement(By.cssSelector(" input[class='sb_form_q']")).sendKeys(searchValue);
    driver.findElement(By.cssSelector(" input#sb_form_go")).submit();

    }

}
