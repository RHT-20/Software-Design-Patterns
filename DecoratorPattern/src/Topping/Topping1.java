package Topping;

import Pizza.Pizza;

public class Topping1 extends Topping
{
    public Topping1(Pizza pizza)
    {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() 
    {
        return (pizza.getDescription() + ", Topping1");
    }

    @Override
    public double getCost() 
    {
        return (pizza.getCost() + 20.0);
    }
}
