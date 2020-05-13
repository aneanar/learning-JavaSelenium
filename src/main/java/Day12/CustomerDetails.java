package Day12;

import java.util.*;

public class CustomerDetails {
   public static List<HyundaiCustomerInfo> Obj;
   public static HyundaiCustomerInfo hobject;
    public static void main(String[] args) {

        HashSet<String> phoneNumber = new HashSet<String>();
        phoneNumber.add("988678677");
        phoneNumber.add("988678293");

        HyundaiCustomerInfo custInfo1 = new HyundaiCustomerInfo("Rajesh", "Bangalore", "Karnataka", "i10", phoneNumber);
        HyundaiCustomerInfo custInfo2 = new HyundaiCustomerInfo("John", "Kochi", "Kerala", "i20", new HashSet<String>(Arrays.asList("9567083843", "8861983843")));
        HyundaiCustomerInfo custInfo3 = new HyundaiCustomerInfo("Jim", "Chennai", "Tamil Nadu", "Creta", new HashSet<String>(Arrays.asList("6666666", "99999999")));


        Map<String, HyundaiCustomerInfo> humap = new HashMap<String, HyundaiCustomerInfo>();
        humap.put(custInfo1.getName(), custInfo1);
        humap.put(custInfo2.getName(), custInfo2);
        humap.put(custInfo3.getName(), custInfo3);
        HashMapIterator hashMapIterator = new HashMapIterator();


        Obj = hashMapIterator.hashmp(humap);
        Iterator<HyundaiCustomerInfo> itrset = Obj.iterator();
        while (itrset.hasNext()) {
            hobject = itrset.next();
            System.out.println(hobject.getName());
            System.out.println(hobject.getCity());
            System.out.println(hobject.getState());
            Iterator<String> itrsetphone = hobject.getPhoneNumbers().iterator();
            while (itrsetphone.hasNext()) {
                String Phone_number = itrsetphone.next();
                System.out.println(Phone_number);
            }
            System.out.println("=============================");
        }
    }



}
