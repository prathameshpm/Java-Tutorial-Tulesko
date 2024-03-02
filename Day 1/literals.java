public class literals {
    public static void main(String args[])
    {
        // literals

        int num1 = 0b10010;         // binary
        System.out.println(num1);

        int num2 = 0x7E;            // hexadecimal
        System.out.println(num2);

        int num3 = 10_00_00_000;    // underscore in int
        System.out.println(num3);

        double num4 = 55;           // int to double conversion
        System.out.println(num4);

        double num5 = 12e10;        // 12 to the power of 10
        System.out.println(num5);

        char c = 'x';
        c++;
        System.out.println(c);
    }
}
