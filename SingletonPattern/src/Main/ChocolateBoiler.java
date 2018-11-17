package Main;

public class ChocolateBoiler 
{
    private boolean empty, boiled;
    private static volatile ChocolateBoiler chocolateBoiler = null;
    
    private ChocolateBoiler()
    {
        empty = true;
        boiled = false;
    }
    
    public static ChocolateBoiler getInstanceChocolateBoiler()
    {
        if(chocolateBoiler == null)
        {
            synchronized (ChocolateBoiler.class)
            {
                if(chocolateBoiler == null)
                {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    public boolean isEmpty() 
    {
        return empty;
    }

    public boolean isBoiled() 
    {
        return boiled;
    }
    
    public void fill()
    {
        printStatus();
        if(isEmpty())
        {
            empty = false;
            boiled = false;
        }
    }
    
    public void boil()
    {
        printStatus();
        if(!isEmpty() && !isBoiled())
        {
            boiled = true;
        }
    }
    
    public void drain()
    {
        printStatus();
        if(!isEmpty() && isBoiled())
        {
            empty = true;
            boiled = false;
        }
    }
    
    public void printStatus()
    {
        System.out.println("Empty: " + isEmpty() + ", Boiled: " + isBoiled());
    }
}
