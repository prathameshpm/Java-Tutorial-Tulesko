// final - variable, method, class

final class R {
    public void show() {
        System.out.println("in R show");
    }
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

/*class R1 extends R {

}*/

class R1 {
    final public void show() {
        System.out.println("in R1 show");
    }
    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

class R2 extends R1{
    /* public void show() {
        System.out.println("in R2 show");
    } */
}

public class finalKeyword {
    public static void main(String[] args) {
        final int x = 8;
        // x = 9;
        System.out.println(x);
        
        System.out.println("-----------------------------");

        R obj = new R();
        obj.show();
        obj.add(3, 6);

        System.out.println("-----------------------------");

        R2 obj1 = new R2();
        obj1.show();
        obj1.sub(9, 6);
    }
}
