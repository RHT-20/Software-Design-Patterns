package Target;

import Main.RoundPeg;

public class RoundHole 
{
    private double radius;
    
    public RoundHole(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public boolean fits(RoundPeg rp)
    {
        return (rp.getRadius() <= radius);
    }
}
