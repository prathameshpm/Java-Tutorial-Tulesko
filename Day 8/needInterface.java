interface Computer
{
    void code();
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, Compile, Run : Faster");
    }
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code, Compile, Run");
    }
}

class Developer
{
    public void devApp(Computer machine) 
    {
        machine.code();
    }
}

public class needInterface 
{
    public static void main(String[] args) 
    {
        Computer lappy = new Laptop();
        Computer desky = new Desktop();

        Developer Prathamesh = new Developer();
        Prathamesh.devApp(desky);
        Prathamesh.devApp(lappy);
    }
}
