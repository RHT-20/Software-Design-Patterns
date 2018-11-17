package Ducks;

import FlyBehaviour.CanFly;
import QuackBehaviour.Quack;

public class RedHeadDuck extends Duck
{
    public RedHeadDuck()
    {
        setFlyBehaviour(new CanFly());
        setQuackBehaviour(new Quack());
    }
    
    @Override
    public void display() 
    {
        System.out.println("I am Red Head Duck");
    }
}
