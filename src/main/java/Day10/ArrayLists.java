package Day10;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class ArrayLists<H> {

    public static void main(String[] args) {

        List<String> arrlist = new ArrayList<String>(Arrays.asList("US","INDIA","CHINA","CUBA"));
//        arrlist.add("US");
//        arrlist.add("INDIA");
//        arrlist.add("CHINA");
//        arrlist.add("CUBA");

        Iterator<String> it = arrlist.iterator();
        while (it.hasNext())
        {

            System.out.println( it.next());


        }


    }
}
