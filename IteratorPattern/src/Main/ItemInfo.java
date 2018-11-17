package Main;

public class ItemInfo 
{
    String name;
    double price;
    
    public ItemInfo(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }
}
