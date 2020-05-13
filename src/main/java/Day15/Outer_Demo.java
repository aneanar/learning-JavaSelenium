package Day15;



public class Outer_Demo {
    int num;

    // inner class
    public class Inner_Demo {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    // Accessing he inner class from the method within
    public Inner_Demo createInner() {
        return Outer_Demo.this.new Inner_Demo();

    }
}