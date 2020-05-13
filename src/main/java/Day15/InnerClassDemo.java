package Day15;

public class InnerClassDemo {


    public static void main(String args[]) {
        // Instantiating the outer class
        Outer_Demo outer = new Outer_Demo();

        // Accessing the display_Inner() method.
        Outer_Demo.Inner_Demo od = outer.createInner();
    }
}

