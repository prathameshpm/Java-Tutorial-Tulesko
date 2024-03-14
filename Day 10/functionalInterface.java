// Functional interface has only one method

interface A
{
    void show();
}

public class functionalInterface 
{
    public static void main(String[] args) 
    {
        A obj = new A()
        {
            @Override
            public void show()
            {
                System.out.println("In Show");
            }
        };
        obj.show();
    }
}
