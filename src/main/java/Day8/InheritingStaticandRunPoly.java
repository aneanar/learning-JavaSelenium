package Day8;

public class InheritingStaticandRunPoly extends StaticPolymorphism{

    int add (int a, int b) {

        System.out.println("I am at overriden methode of base with same signature");
        return 1;
    }

    int add (int a, int b, int c, int d) {

        System.out.println("I am at overriden methode of base with diff signature");
        return 1;
    }
}
