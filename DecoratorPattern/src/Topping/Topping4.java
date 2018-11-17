package Topping;

import Pizza.Pizza;

public class Topping4 extends Topping
{
    public Topping4(Pizza pizza)
    {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() 
    {
        return (pizza.getDescription() + ", Topping4");
    }

    @Override
    public double getCost() 
    {
        return (pizza.getCost() + 50.0);
    }
}
