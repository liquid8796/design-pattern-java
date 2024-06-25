package test;

public class Test {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.increment(); // staticVariable = 1
        obj2.increment(); // staticVariable = 2

        System.out.println(Example.staticVariable); // In ra 2
    }
}