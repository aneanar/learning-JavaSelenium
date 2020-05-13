package Day8;

public class Driver_Encapsulations {

    public static void main(String[] args) {
        Encapsulations encp = new Encapsulations();
        encp.setage(100);
       String status = encp.getAgeStaus(encp.getage());
        System.out.println(status);
    }
}
