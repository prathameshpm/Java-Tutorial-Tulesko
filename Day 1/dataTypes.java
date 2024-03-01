
/*
 * Data Types:
 *      Primitive
 *          1) Integer
 *              a) byte     -> 1 byte -> 2 to power 8   -> -128 to 128
 *              b) short    -> 2 bytes -> 2 to power 16
 *              c) int      -> 4 bytes -> 2 to power 32
 *              d) long     -> 8 bytes -> 2 to power 64
 *          2) Float
 *              a) double   -> 8 bytes
 *              b) float    -> 4 bytes
 *          3) Character    -> 2 bytes  ->  Unicode instead of ASCII
 *          4) Boolean      
 *      ??
 * 
 */
public class dataTypes {
    public static void main(String[] args) {
        int num1 = 1;
        byte num2 = 2;
        short num3 = 3;
        long num4 = 4l;
        float score1 = 9.6f;
        double score2 = 9.6;
        char grade = 'A';
        boolean result = true;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(score1);
        System.out.println(score2);
        System.out.println(grade);
        System.out.println(result);
    }
}
