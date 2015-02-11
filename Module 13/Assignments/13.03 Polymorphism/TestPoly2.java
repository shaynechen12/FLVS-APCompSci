/**
 * This tests the programs and interfaces with the user.
 * 
 * @author Gatlin Newhouse
 * @version 1/22/15
 */
import java.util.*;
public class TestPoly2
{
    public static void showCenter(Circle2 circle)
    {
        System.out.println("For " + circle + ". center is at " + circle.center() + ".");
    }
    public static void main(String[] args)
    {
        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        shapes.add(new Circle2(2,4,1));
        shapes.add(new Cylinder2(10,15,1,1));
        shapes.add(new Oval2(15,10,1,1));
        shapes.add(new OvalCylinder2(40,10,1,1,1));
        for(Circle2 circ : shapes)
        {
            showCenter(circ);
        }
    }
}
