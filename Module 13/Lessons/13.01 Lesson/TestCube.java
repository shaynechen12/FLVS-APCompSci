/**
 * test program for cube - box - rectangle
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class TestCube
{
	public static void main (String []args)
	{
	    Rectangle one = new Rectangle(2, 4);
	    Cube two = new Cube(4);
	    System.out.println("One's dimensions are " + one.getLength() + " X " + one.getWidth());
	    System.out.println();
	    System.out.println("Cube's dimensions are " + two.getLength() + " X " + two.getLength() + " X " + two.getLength());
	}
}
