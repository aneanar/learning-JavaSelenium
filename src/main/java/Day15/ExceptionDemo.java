package Day15;
import Day7.Base_driver;
import org.openqa.selenium.Alert;

import java.lang.*;


public class ExceptionDemo extends Base_driver {

    public static void main(String[] args) throws InterruptedException {

        try {
            Thread.sleep(10);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        int a;
        int b=10;
        try{a=b/0;}
        catch (java.lang.ArithmeticException e) {
            System.out.println("Divided Zero");
            try {
                throw new MyException("Aneesh_Exception");
            }
                    catch(MyException e1)
            {
                System.out.println(e1.toString());
            }
        }

        //Thread.sleep(90);
        System.out.println("End of program");


    }

    public void AlertDemo()
    {

        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.accept();
        alert.dismiss();


    }

}
