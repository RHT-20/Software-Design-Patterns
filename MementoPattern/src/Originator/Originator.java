package Originator;

import Memento.Memento;

public class Originator 
{
    private String state;

    public void setState(String state)
    {
        this.state = state;
        System.out.println("Originator: Current state: " + this.state);
    }
    
    public Memento save()
    {
        System.out.println("Originator: Saving to memento.");
        return  (new Memento(state));
    }
    
    public void restore(Memento m,int type)
    {
        if(m == null)   return;
        
        state = m.getState();
        if(type == 1)   System.out.println("Originator: State after undo operation: " + state);
        else            System.out.println("Originator: State after redo operation: " + state);
    }
}
