package Day14;
import Day7.Base_driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReadDropdwonValues extends Base_driver {

        public static String xlPath ="C:\\Users\\aneesh.narayanan\\OneDrive - EY\\Documents\\Aneesh_backup\\OLD Desktop\\Learning\\Selenium_training_EY\\Search.xlsx";

        public static void main(String[] args) throws IOException, InterruptedException {

            CarWalaPage cwObj = new CarWalaPage();
            cwObj.launchSite("https://www.carwale.com/used/cars-in-kochi/#sc=-1&so=-1&city=9&pc=9&pn=1");
           List<WebElement> elements = cwObj.fetchDropDwonList();
           int optionCount = elements.size();
           int i=0;
            ExcelRW xlObj = new ExcelRW(xlPath);
           int rowCount = xlObj.getRowCount("CountryList");
            Iterator<WebElement> itr = elements.iterator();
            while (itr.hasNext())
            {
                try {
                i++;
                WebElement dropDownElement = itr.next();
                String dropDownValueText = dropDownElement.getText();

                    String dropDownValue = dropDownValueText.substring(0, dropDownValueText.indexOf(" ("));
                    xlObj.excelWrite("CountryList",i,0,dropDownValue);
                }

                catch (Exception e) {
                    System.out.println("Not a City-Ignored");;
                }
            }
            xlObj.excelSaveAndClose(xlPath);
            cwObj.tearDown();
            System.exit(0);


    }



}
