/**
 * Write a description of class IsoscelesRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IsoscelesRight extends Equilateral
{
    private double a;
    private double b;
    private double c;
    public IsoscelesRight(double a)
    {
        super(a);
        b = a;
        c = (a*a) + (b*b);
        c = Math.sqrt(c);
    }
}
