package Day9;

public class DriverInterface {
    public static void main(String[] args) {
        ArithmeticInterface inf = new ImplementsInterface();
        System.out.println(inf.add(1,2));
        System.out.println(ArithmeticInterface.age);


    }
}
