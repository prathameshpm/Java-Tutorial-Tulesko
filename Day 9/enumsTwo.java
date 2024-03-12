enum Laptop
{
    Macbook(2000), XPS(2200), Surface(), Thinkpad(1800);

    private int price;

    private Laptop() {
        price = 1500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop" + " : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class enumsTwo 
{
    public static void main(String[] args) 
    {
        Laptop lappy = Laptop.Macbook;
        System.out.println(lappy.getPrice());

        for(Laptop lappies : Laptop.values())
        {
            System.out.println(lappies + " : " + lappies.getPrice());
        }
    }
}
