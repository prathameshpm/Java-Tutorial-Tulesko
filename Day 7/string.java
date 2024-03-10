/*
 * 
 * String is an array of characters
 * For Character datatype we use single quotes
 * For String datatype we use double quotes
 * 
 */

public class string {
    public static void main(String[] args) {
        // String name = new String("Navin");
        String name = "Navin";
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(", Reddy"));
        System.out.println("Reddy, ".concat(name));
    }
}
