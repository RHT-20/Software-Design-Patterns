package Topping;

import Pizza.Pizza;

public class Topping2 extends Topping
{
    public Topping2(Pizza pizza)
    {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() 
    {
        return (pizza.getDescription() + ", Topping2");
    }

    @Override
    public double getCost() 
    {
        return (pizza.getCost() + 30.0);
    }
}
