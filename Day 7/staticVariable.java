/* 
 * Static Variable have to called with reference to class
 * They can not be called with reference to objects
 * If you still go ahead and do it, there will be warning
 */


class Mobile {
    String brand;
    int price;
    static String name = "Smartphone";

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class staticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        
        obj1.brand = "Apple";
        obj1.price = 1500;
        // obj1.name = "Smartphone";

        obj2.brand = "Samsung";
        obj2.price = 1200;
        // obj2.name = "Smartphone";

        // obj1.name = "Phone";
        Mobile.name = "Phone";
        
        obj1.show();
        obj2.show();
    }
}
