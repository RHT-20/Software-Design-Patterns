package Topping;

import Pizza.Pizza;

public abstract class Topping extends Pizza
{
    Pizza pizza;
    
    public abstract String getDescription();
}
