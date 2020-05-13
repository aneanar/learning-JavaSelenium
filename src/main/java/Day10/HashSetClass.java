package Day10;

import java.util.*;
import java.util.Arrays;

public class HashSetClass {

    public static void main(String[] args) {
        List<String> arrlist = new ArrayList<String>(Arrays.asList("US","INDIA","CHINA","CUBA"));
        String[] sarray = new String[] {"ANeesh","manju"};
        Set<String> hashset = new HashSet<String>(Arrays.asList("US1","INDIA1","CHINA1","CUBA1"));
        Set<String> hashset1 = new HashSet<String>(Arrays.asList("US1","INDIA1","CHINA1","CUBA1"));
//        hashset.add("US");
//        hashset.add("INDIA");
//        hashset.add("CHINA");
//        hashset.add("CUBA");
        hashset.addAll(arrlist);
        hashset.addAll(hashset1);

        Iterator<String> it = hashset.iterator();
        while (it.hasNext())
        {

            System.out.println( it.next());


        }


    }
}
