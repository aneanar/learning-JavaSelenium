package Day12;

import Day10.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapIterator {
     String Key;
    Iterator<String> itr;
    HyundaiCustomerInfo Obj;
  List<HyundaiCustomerInfo> lObj = new ArrayList<HyundaiCustomerInfo>();
   int count=0;

    public List <HyundaiCustomerInfo> hashmp (Map humap)
    {
    itr = humap.keySet().iterator();
        for (int i=0;i<humap.keySet().size();i++){
        while (itr.hasNext()) {
            Key = itr.next();
            Obj = (HyundaiCustomerInfo) humap.get(Key);
            lObj.add(Obj);
        }
            return lObj;



    }

        return null;
    }
}
