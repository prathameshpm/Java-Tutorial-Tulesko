/**
 * MyCalculator
 */
class MyCalculator {
    public int add(int a, int b)
    {
        int c =  a + b;
        return c;
    }
    public int sub(int a, int b)
    {
        int c =  a - b;
        return c;
    }
    public int mul(int a, int b)
    {
        int c =  a * b;
        return c;
    }
    public int div(int a, int b)
    {
        int c =  a / b;
        return c;
    }
    public int mod(int a, int b)
    {
        int c =  a % b;
        return c;
    }
    public void fun()
    {
        System.out.println("Just chilling :) !!!");
    }
}

public class Demo01 {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        MyCalculator calc = new MyCalculator();

        int z1 = calc.add(x,y);
        System.out.println(z1);
        
        int z2 = calc.sub(x,y);
        System.out.println(z2);
        
        int z3 = calc.mul(x,y);
        System.out.println(z3);
        
        int z4 = calc.div(x,y);
        System.out.println(z4);
        
        int z5 = calc.mod(x,y);
        System.out.println(z5);

        calc.fun();
    }
}
