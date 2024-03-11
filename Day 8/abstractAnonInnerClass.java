abstract class H
{
    public abstract void show();
    public abstract void config();
}

public class abstractAnonInnerClass 
{
    public static void main(String[] args) 
    {
        H obj = new H()
        {
            public void show()
            {
                System.out.println("in Show");
            }
            public void config()
            {
                System.out.println("in Config");
            }
        };
        obj.show();
        obj.config();
    }
}
