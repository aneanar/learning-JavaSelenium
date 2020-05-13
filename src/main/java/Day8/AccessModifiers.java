package Day8;

public class AccessModifiers {


    public int pub=10;
    private int pri=20;
    protected int pro=30;
    int def=40;

    public void pubmethod(){
        System.out.println("The Method is public");
    }

    private void primethod(){
        System.out.println("The Method is private");
    }
    protected void promethod(){
        System.out.println("The Method is protected");
    }
    void defmethod(){
        System.out.println("The Method is default");
    }


    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.pub);
        System.out.println(am.pro);
        System.out.println(am.pri);
        System.out.println(am.def);

        am.pubmethod();
        am.promethod();
        am.primethod();
        am.defmethod();




    }

}
