class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class downcastAndUpcast {
    public static void main(String[] args) {
        A obj = new A();
        obj.show1();

        A obj1 = new B();
        obj1.show1();

        A obj2 = (A) new B();       // Typecast type of child class to type of parent class
        obj2.show1();               // Upcasting -> Happens implicitly, no need to mention

        B obj3 = (B) obj1;          // Typecast type of parent class to child class
        obj3.show1();               // Downcasting -> Has to be done explicitly
        obj3.show2();               // Gives access to parent and child attributes and behaviours
    }
}
