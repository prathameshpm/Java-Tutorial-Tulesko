interface C
{
    int add(int i, int j);
}

public class lambdaExpWRet 
{
    public static void main(String[] args) 
    {
        C obj = (i, j) -> i + j;
        System.out.println(obj.add(3, 5));
    }
}
