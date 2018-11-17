package Ducks;

import FlyBehaviour.FlyBehaviour;
import QuackBehaviour.QuackBehaviour;

public abstract class Duck 
{
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    
    public void swim()
    {
        System.out.println("I can swim.");
    }
    
    public abstract void display();
    
    
    public void setFlyBehaviour(FlyBehaviour fb)
    {
        flyBehaviour = fb;
    }
    
    public void setQuackBehaviour(QuackBehaviour qb)
    {
        quackBehaviour = qb;
    }
    
    public void performFly()
    {
        flyBehaviour.fly();
    }
    
    public void performQuack()
    {
        quackBehaviour.quack();
    }
}
