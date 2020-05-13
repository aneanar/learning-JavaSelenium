package Day1;

import org.testng.asserts.SoftAssert;

public class Learning {

    public static void main(String[] args) {
//       long m = 9_223_372_036_854_775_807L;
//        double f= m;
//        System.out.println(f);
//        long i=(long)f;
//        System.out.println(i);
//        int asci = 7289;
//        char ch = (char) asci;
//        System.out.println(ch);

        int [] myArray = {1,2,3,4,5};
        System.out.println(myArray[3]);
        System.out.println(myArray.length);
        SoftAssert assertor = new SoftAssert();
        assertor.assertEquals(myArray[1],4,"this is not the element");
        assertor.assertAll();


    }
}
