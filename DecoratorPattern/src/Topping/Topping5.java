package Topping;

import Pizza.Pizza;

public class Topping5 extends Topping
{
    public Topping5(Pizza pizza)
    {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() 
    {
        return (pizza.getDescription() + ", Topping5");
    }

    @Override
    public double getCost() 
    {
        return (pizza.getCost() + 60.0);
    }
}
