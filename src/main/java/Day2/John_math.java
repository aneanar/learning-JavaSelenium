package Day2;

import Day1.BasicJava;


public class John_math {

    public static void main(String[] args) {
        Common_arithmetic ar1= new Common_arithmetic();
        Common_arithmetic ar2 = new Common_arithmetic();
        System.out.println("Sum of values is :"+ ar1.add(10,20));
        System.out.println("Product of values is :"+ ar1.multiplication(10,20));
        System.out.println("============================================");
        System.out.println("Value of J: "+ar1.j);
        System.out.println("Value of k: "+Common_arithmetic.k);
        ar1.increment1();
        System.out.println("============================================");
        ar1.increment1();
        System.out.println(ar1.j);
        System.out.println(Common_arithmetic.k);
        System.out.println("============================================");
        System.out.println("Value of J: "+ar2.j);
        System.out.println("Value of k: "+ar2.k);




    }

}
