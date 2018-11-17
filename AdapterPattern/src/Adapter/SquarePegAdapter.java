package Adapter;

import Main.RoundPeg;
import Adaptee.SquarePeg;

public class SquarePegAdapter extends RoundPeg
{
    private SquarePeg sp;
    
    public SquarePegAdapter(SquarePeg sp)
    {
        this.sp = sp;
    }
    
    @Override
    public double getRadius()
    {
        return ( Math.sqrt(2 * (sp.getWidth() * sp.getWidth())) / 2);
    }
}
