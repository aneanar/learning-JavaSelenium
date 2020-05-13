package Day11;

import java.util.*;

public class CustomerDetails {

    public static void main(String[] args) {

        HyundaiCustomerInfo custInfo1 = new HyundaiCustomerInfo();
        custInfo1.setName("Rajesh");
        custInfo1.setCity("Bangalore");
        custInfo1.setState("Karanataka");
        custInfo1.setCarModel("i10");
        HashSet<String> phoneNumber = new HashSet<String>();
        phoneNumber.add("988678677");
        phoneNumber.add("988678293");
        custInfo1.setPhoneNumbers(phoneNumber);

        HyundaiCustomerInfo custInfo2 = new HyundaiCustomerInfo();
        custInfo2.setName("John");
        custInfo2.setCity("Kochi");
        custInfo2.setState("Kerala");
        custInfo2.setCarModel("i20");
        custInfo2.setPhoneNumbers(new HashSet<String>(Arrays.asList("9567083843","8861983843")));


        HyundaiCustomerInfo custInfo3 = new HyundaiCustomerInfo();
        custInfo3.setName("Jim");
        custInfo3.setCity("Chennai");
        custInfo3.setState("Tamil Nadu");
        custInfo3.setCarModel("Creta");
        custInfo3.setPhoneNumbers(new HashSet<String>(Arrays.asList("6666666","99999999")));

        Map<String, HyundaiCustomerInfo> humap = new HashMap<String, HyundaiCustomerInfo>();
        humap.put(custInfo1.getName(),custInfo1);
        humap.put(custInfo2.getName(),custInfo2);
        humap.put(custInfo3.getName(),custInfo3);

        Iterator<String>itr = humap.keySet().iterator();
        while (itr.hasNext())
        {
            String key = itr.next();
            HyundaiCustomerInfo Obj = humap.get(key);
            System.out.println(Obj.getName());
            System.out.println(Obj.getCity());
            System.out.println(Obj.getState());
            Iterator<String> itrset = Obj.getPhoneNumbers().iterator();
            while (itrset.hasNext()) {
                String Phone_number= itrset.next();
                System.out.println(Phone_number);
            }
            System.out.println("=============================");



        }





    }
}
