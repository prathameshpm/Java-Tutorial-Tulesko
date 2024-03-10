/*
 * Every Constructor has a hidden super() method in it
 * This super() method calls the parent class' Constructor
 * Every class in Java extends the Object class
 * So, when you call super() in class A, you are calling the
 * Constructor of Object class
 * this() will execute the constructor for same class
 */

class A extends Object {
    public A() {
        System.out.println("A - Constructor");
    }
    public A(int n, int m) {
        System.out.println("A int int - Constructor");
    }
}

class B extends A{
    public B() {
        System.out.println("B - Constructor");
    }
    public B(int n) {
        System.out.println("B int - Constructor");
    }
    public B(int n, int m) {
        super(n, m);
        System.out.println("B int int - Constructor");
    }
    public B(int n, int m, int o) {
        this();
        System.out.println("B int int int - Constructor");
    }
}

public class thisAndSuper {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("--------------------------------------------");
        B obj1 = new B(3);
        System.out.println("--------------------------------------------");
        B obj2 = new B(6, 9);
        System.out.println("--------------------------------------------");
        B obj3 = new B(12, 15, 18);
    }
}
