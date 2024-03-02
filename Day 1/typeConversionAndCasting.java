public class typeConversionAndCasting {
    public static void main(String[] args) {
        byte x = 127;
        int y = 100;
        // x = y; Error: incompatible types possible lossy conversion froom int to byte
        y = x;                      // implicit conversion
        System.out.println(y);

        byte x1 = 127;
        int y1 = 100;
        x1 = (byte)y1;              // type casting aka explicit conversion
        System.out.println(x1);

        byte x2 = 127;
        int y2 = 260;
        x2 = (byte)y2;              // 260 % 256 = 4 (256 because range of byte is 256, -128 to 127)
        System.out.println(x2);

        int x3 = 5;
        float y3 = 6.5f;
        x3 = (int)y3;               // Loss of digits after decimal
        System.out.println(x3);

        byte x4 = 10;
        byte y4 = 30;
        int result = x4 * y4;       // type promotions
        System.out.println(result);
    }
}
