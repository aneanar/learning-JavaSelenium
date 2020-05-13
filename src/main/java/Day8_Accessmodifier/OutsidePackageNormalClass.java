package Day8_Accessmodifier;

import Day8.AccessModifiers;

public class OutsidePackageNormalClass {

    public static void main(String[] args) {
        AccessModifiers am1 = new AccessModifiers();
        System.out.println(am1.pub);
        am1.pubmethod();
    }

}
