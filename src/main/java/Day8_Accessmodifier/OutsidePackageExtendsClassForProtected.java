package Day8_Accessmodifier;

import Day8.AccessModifiers;

public class OutsidePackageExtendsClassForProtected extends AccessModifiers {

    public static void main(String[] args) {
        OutsidePackageExtendsClassForProtected am2 = new OutsidePackageExtendsClassForProtected();
        System.out.println(am2.pro);
        System.out.println(am2.pub);
        am2.promethod();
        am2.pubmethod();
    }


}
