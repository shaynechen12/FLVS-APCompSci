
/**
 * Cube3.
 * 
 * @author Gatlin Newhouse
 * @version 1/23/2015
 */
public class Cube3 extends Box3
{
    /**
     * Constructor for objects of class Cube3
     */
    public Cube3(int x)
    {
       super(x, x, x);
    }
    public String toString(){
     return "Cube - " + getLength() + " x " + getWidth() + " x " + getHeight();
    }
}
