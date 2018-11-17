package CareTaker;

import java.util.ArrayList;
import Memento.Memento;

public class CareTaker 
{
    private ArrayList<Memento> mementos;
    int index;
    
    public CareTaker()
    {
        mementos = new ArrayList<>();
        index = 0;
    }
    
    public void addMemento(Memento m)
    {
        int i = mementos.size();
        while(i!=index)
        {
            i--;
            mementos.remove(i);
        }
        mementos.add(m);
        index++;
    }
    
    public Memento undoMemento()
    {
        if(index >= 2)
        {
            index--;
            return mementos.get(index-1);
        }
        else if(index == 1)
        {
            index--;
            return null;
        }
        else    return null;
    }
    
    public Memento redoMemento()
    {
        if(mementos.size() > index)
        {
            index++;
            return mementos.get(index-1);
        }
        else    return null;
    }
}
