package Topping;

import Pizza.Pizza;

public class Topping3 extends Topping
{
    public Topping3(Pizza pizza)
    {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() 
    {
        return (pizza.getDescription() + ", Topping3");
    }

    @Override
    public double getCost() 
    {
        return (pizza.getCost() + 40.0);
    }
}
