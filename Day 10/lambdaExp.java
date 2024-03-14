interface B
{
    void show(int i);
}

public class lambdaExp 
{
    public static void main(String[] args) 
    {
        B obj = i -> System.out.println("in show " + i);
        obj.show(4);
    }
}
