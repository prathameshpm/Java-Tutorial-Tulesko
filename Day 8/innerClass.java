class D 
{

    int age;

    public void show() 
    {
        System.out.println("in Show");
    }

    class E 
    {
        public void config() 
        {
            System.out.println("in Config");
        }
    }

    static class F
    {
        public void perform()
        {
            System.out.println("in Perform");
        }
    }
}

public class innerClass 
{
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.show();

        D.E obj1 = obj.new E();
        obj1.config();

        D.F obj2 = new D.F();
        obj2.perform();
    }
}
