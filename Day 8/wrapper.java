/*
 * 
 * Java is 99.99% Object Oriented, primitive types stay primitive
 * It helps improve performance
 * For every primitive type has a class
 * Eg: int -> Integer, double -> Double, etc...
 * 
 */

public class wrapper {
    public static void main(String[] args) {
        //  int x = 7;                      // Primitive Data Type
        //  Integer x1 = new Integer(8);    // Boxing (Deprecated)
        //  System.out.println(x1);

        Integer x2 = 8;                     // Autoboxing
        System.out.println(x2);

        Integer x3 = x2.intValue();         // Unboxing
        System.out.println(x3);

        Integer x4 = x2;                    // Autounboxing
        System.out.println(x4);

        String y = "12";
        //  System.out.println(y * 2);
        int y1 = Integer.parseInt(y);
        System.out.println(y1 * 2);
    }
}
