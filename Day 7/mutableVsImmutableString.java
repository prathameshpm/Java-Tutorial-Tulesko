/*
 * Mutable = change
 * Immutable = unchanged
 * 
 */

public class mutableVsImmutableString {
    public static void main(String[] args) {
        String name = "Navin";
        name = name + " Reddy";
        System.out.println(name);

        StringBuffer sBuffer = new StringBuffer("Navin");
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.length());
        sBuffer.append(" Reddy");
        System.out.println(sBuffer);
        sBuffer.deleteCharAt(2);
        System.out.println(sBuffer);
        sBuffer.insert(5, "Java ");
        System.out.println(sBuffer);
        System.out.println(sBuffer.length());
        sBuffer.setLength(30);
        System.out.println(sBuffer.length());
    }
}
