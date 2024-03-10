class A {
    A() {
        System.out.println("Object created");
    }
    public void show() {
        System.out.println("In A show()");
    }
}

public class anonymousObject {
    public static void main(String[] args) {
        new A();            //  Anonymous Object
        new A().show();
    }
}
