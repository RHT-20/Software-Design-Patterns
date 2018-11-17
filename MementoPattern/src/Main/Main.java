package Main;

import Originator.Originator;
import CareTaker.CareTaker;

public class Main 
{
    public static void main(String[] args) 
    {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        
        originator.setState("state - 1");
        originator.setState("state - 2");
        careTaker.addMemento(originator.save());
        originator.setState("state - 3");
        careTaker.addMemento(originator.save());
        originator.setState("state - 4");
        careTaker.addMemento(originator.save());
        originator.restore(careTaker.undoMemento(), 1);
        //originator.restore(careTaker.redoMemento(), 2);
        originator.setState("state - 5");
        careTaker.addMemento(originator.save());
        originator.restore(careTaker.undoMemento(), 1);
        originator.restore(careTaker.redoMemento(), 2);
    }
}