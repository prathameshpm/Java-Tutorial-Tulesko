class MyCalc {
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}

public class methodOverload {
    public static void main(String[] args) {
        int x1 = 4;
        int y1 = 5;
        MyCalc calc = new MyCalc();

        int z1 = calc.add(x1, y1);
        System.out.println("z1 = " + z1);

        int x2 = 10;
        int y2 = 20;
        int z2 = 30;

        int a1 = calc.add(x2, y2, z2);
        System.out.println("a1 = " + a1);

        double x3 = 7.9;
        int y3 = 8;

        double z3 = calc.add(x3, y3);
        System.out.println("z3 = " + z3);
    }
    
}
