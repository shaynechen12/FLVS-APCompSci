
/**
 * Write a description of class someObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class someObject
{
	public static final int BASE = 14;
	private static double h;
	public someObject(double height)
	{
		h = height;
	}
	public static double calcRectangleArea(double height)
	{
	    h = height;
		return (h * BASE);
	}
}
