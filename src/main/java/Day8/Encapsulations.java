package Day8;

import java.security.PublicKey;

public class Encapsulations {
private int age =0;


    public int getage() {
        System.out.println(age);
        return age;

    }

    public void setage(int a) {
        this.age = a;
        System.out.println(age);
    }

     private String validateAge (int age) {
        if (age>18)
        {
            return "Major";
        }

        else  return "Minor";

    }

    public String getAgeStaus(int age){

        return validateAge(age);
    }


}
