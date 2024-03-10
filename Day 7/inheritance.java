public class inheritance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(6, 7);
        System.out.println(r1 + ", " + r2);
        AdvCalc obj1 = new AdvCalc();
        int r3 = obj1.add(4, 5);
        int r4 = obj1.sub(6, 7);
        int r5 = obj1.mul(8, 9);
        int r6 = obj1.div(1, 2);
        int r7 = obj1.mod(3, 4);
        System.out.println(r3 + ", " + r4 + ", " + r5 + ", " + r6 + ", " + r7);
    }
}
