package Ducks;

import FlyBehaviour.NoFly;
import QuackBehaviour.MuteQuack;

public class WoodenDuck extends Duck
{
    public WoodenDuck()
    {
        setFlyBehaviour(new NoFly());
        setQuackBehaviour(new MuteQuack());
    }
    
    @Override
    public void display() 
    {
        System.out.println("I am Wooden Duck.");
    }
}
