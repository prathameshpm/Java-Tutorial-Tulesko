/*
 * < less than?
 * > greater than?
 * = assignment
 * == is equal to?
 * != is not equal to?
 * <= less than or equal to?
 * => greater than or equal to?
 * Output is Boolean (true/ false)
 * 
 */

public class relationalOperators {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 6;

        boolean z1 = x1 < y1;
        System.out.println(z1);

        boolean z2 = x1 > y1;
        System.out.println(z2);

        x1 = 6;

        boolean z3 = x1 == y1;
        System.out.println(z3);

        boolean z4 = x1 != y1;
        System.out.println(z4);

        boolean z5 = x1 <= y1;
        System.out.println(z5);

        boolean z6 = x1 >= y1;
        System.out.println(z6);
        
        double x2 = 6.0;

        boolean z7 = x2 != y1;
        System.out.println(z7);
    }
}
