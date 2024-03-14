public class exHandling 
{
    public static void main(String[] args) 
    {
        int i = 9;
        int j = 0;

        int n[] = new int[5];
        String str = null;
        int strLength = 0;

        try
        {
            j = 18/i;
            strLength = str.length();
            System.out.println(n[1]);
            System.out.println(n[5]);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Array exception");
        }
        catch(Exception ex)
        {
            System.out.println("Something went wrong..." + ex);
        }

        System.out.println(j);
        System.out.println("Bye!!!");
    }
}
