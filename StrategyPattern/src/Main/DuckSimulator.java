package Main;

import Ducks.MallarDuck;
import Ducks.RedHeadDuck;
import Ducks.RubberDuck;
import Ducks.WoodenDuck;
import FlyBehaviour.CanFly;

public class DuckSimulator 
{
    public static void main(String[] args) 
    {
        MallarDuck mallarDuck = new MallarDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        System.out.println();
        
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println();
        
        rubberDuck.setFlyBehaviour(new CanFly());
        rubberDuck.performFly();
        System.out.println();
    }
}
