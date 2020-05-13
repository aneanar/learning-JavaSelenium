package Day8;

public class OutsideClasssSamePackage {

    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.pub);
        System.out.println(am.def);
        System.out.println(am.pro);
        am.pubmethod();
        am.promethod();
        am.defmethod();
    }
}
