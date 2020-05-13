package Day22;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class DataProviderImplementation {

    @Test(dataProvider="dpIteratorExcel", dataProviderClass = Day22.DP.class,enabled = false)
    public void dataProvider(Map<String,String> hm)
    {

        System.out.println(hm.get("Name"));
        System.out.println(hm.get("City"));
        System.out.println(hm.get("State"));
        System.out.println(hm.get("Block"));
        System.out.println(hm.get("Product"));
        System.out.println(hm.get("Package"));
        System.out.println(hm.get("Country"));
        System.out.println(hm.get("Zipcode"));

    }

    @Test(dataProvider="dpIteratorHardcoded", dataProviderClass = DP.class,enabled = false)
    public void dataProvider1(Map<String,String> hm)
    {

        System.out.println(hm.get("Name"));
        System.out.println(hm.get("City"));

    }
    @Test(dataProvider="dpObjectArray", dataProviderClass = DP.class,enabled = false)
    public void dataProvider2(String key, String value)
    {
        System.out.println(key+" : "+value);
    }



    @Test(dataProvider="dpIteratorObjectArrayofClass", dataProviderClass = DP.class,enabled = false)
    public void dataProvider3(Map<String,Student> hm)
    {

        System.out.println(hm.get("Aneesh").getName());
        System.out.println(hm.get("Aneesh").getCity());
        System.out.println(hm.get("Jim").getName());
        System.out.println(hm.get("Jim").getCity());


    }

    @Test(dataProvider="dpIteratorClassObject", dataProviderClass = DP.class,enabled = true)
    public void dataProvider4(Student student)
    {

        System.out.println(student.getName());
        System.out.println(student.getCity());



    }

    @Test(dataProvider="dpIteratormap", dataProviderClass = DP.class,enabled = false)
    public void dataProvider5(Map<String,String> hm)
    {

        System.out.println(hm.get("Name"));
        System.out.println(hm.get("City"));



    }
}
