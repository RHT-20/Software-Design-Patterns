package Ducks;

import FlyBehaviour.CanFly;
import QuackBehaviour.Quack;

public class MallarDuck extends Duck
{
    public MallarDuck()
    {
        setFlyBehaviour(new CanFly());
        setQuackBehaviour(new Quack());
    }
    
    @Override
    public void display() 
    {
        System.out.println("I am Mallar Duck.");
    }
}
