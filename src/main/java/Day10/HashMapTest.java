package Day10;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> hmap = new LinkedHashMap<String, String>();
        hmap.put("USA","Chicago");
        hmap.put("USA1","Chicago1");
        hmap.put("USA2","Chicago2");
        hmap.put("USA3","Chicago3");

        Iterator<String> itr = hmap.keySet().iterator();

        while (itr.hasNext())
        {
            String key = itr.next();
            System.out.println(key+" : "+hmap.get(key));



        }


    }
}
