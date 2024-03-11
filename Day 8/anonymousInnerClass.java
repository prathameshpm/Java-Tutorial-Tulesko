class G 
{
    public void show()
    {
        System.out.println("in Show");
    }
}

public class anonymousInnerClass 
{
    public static void main(String[] args) 
    {
        G obj = new G()
        {
            public void show()
            {
                System.out.println("in New Show");
            }
        };
        obj.show();
    }
}
