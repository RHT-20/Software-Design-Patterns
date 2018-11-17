package Ducks;

import FlyBehaviour.NoFly;
import QuackBehaviour.Squack;

public class RubberDuck extends Duck
{
    public RubberDuck()
    {
        setFlyBehaviour(new NoFly());
        setQuackBehaviour(new Squack());
    }
    
    @Override
    public void display() 
    {
        System.out.println("I am Rubber Duck");
    }
}
