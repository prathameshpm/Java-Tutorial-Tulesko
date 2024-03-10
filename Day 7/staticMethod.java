class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1() {
        System.out.println("In Static Method");
        // System.out.println(brand + " : " + price + " : " + name);
        System.out.println(name);
    }
    
    public static void show2(Mobile mob) {
        System.out.println("In Static Method 2");
        System.out.println(mob.brand + " : " + mob.price + " : " + name);
    }
}

public class staticMethod {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        Mobile mob2 = new Mobile();

        mob1.brand = "Apple";
        mob1.price = 999;
        Mobile.name = "Smartphone";

        mob2.brand = "Samsung";
        mob2.price = 799;

        mob1.show();
        mob2.show();

        // Mobile.show();
        // mob1.show1();
        Mobile.show1();
        Mobile.show2(mob1);
        Mobile.show2(mob2);
    }
}
