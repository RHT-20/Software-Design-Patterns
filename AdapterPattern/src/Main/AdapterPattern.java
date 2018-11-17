package Main;

import Adaptee.SquarePeg;
import Target.RoundHole;
import Adapter.SquarePegAdapter;

public class AdapterPattern 
{
    public static void main(String[] args)
    {
        RoundHole rh = new RoundHole(10);
        SquarePeg sp = new SquarePeg(10);
        SquarePegAdapter spa = new SquarePegAdapter(sp);
        
        if(rh.fits(spa)) System.out.println("Square Peg of width 10 fits into Round Hole of radius 10.");
        else    System.out.println("Square Peg of width 10 does not fit into Round Hole of radius 10.");
        
        sp = new SquarePeg(20);
        spa = new SquarePegAdapter(sp);
        
        if(rh.fits(spa)) System.out.println("Square Peg of width 20 fits into Round Hole of radius 10.");
        else    System.out.println("Square Peg of width 20 does not fit into Round Hole of radius 10.");
    }
}
