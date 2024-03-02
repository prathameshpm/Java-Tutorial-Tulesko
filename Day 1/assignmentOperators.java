public class assignmentOperators {
    public static void main(String[] args) {
        int x1 = 7;
        int y1 = 5;

        int z1 = x1 + y1;
        System.out.println(z1);

        int z2 = x1 - y1;
        System.out.println(z2);

        int z3 = x1 * y1;
        System.out.println(z3);

        int z4 = x1 / y1;
        System.out.println(z4);

        int z5 = x1 % y1;
        System.out.println(z5);

        x1 += 2;
        System.out.println(x1);

        x1 -= 2;
        System.out.println(x1);

        x1 *= 2;
        System.out.println(x1);

        x1 /= 2;
        System.out.println(x1);

        x1++;                       // post increment
        System.out.println(x1);
        int a1 = x1++;              // x1 incremented after assigning value to a1, hence post increment
        System.out.println(a1);

        ++x1;                       // pre increment
        System.out.println(x1);
        int a2 = ++x1;              // x1 incremented before assigning value to a2, hence pre increment
        System.out.println(a2);

        x1--;                       // decrement
        System.out.println(x1);
    }    
}
