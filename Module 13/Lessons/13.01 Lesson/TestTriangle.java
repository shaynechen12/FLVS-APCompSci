
/**
 * Write a description of class TestTriangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestTriangle
{
	public static void main (String []args)
	{
	    Triangle one = new Triangle(4.0, 5.0, 6.0);
	    Equilateral two = new Equilateral(5.0);
	    IsoscelesRight three = new IsoscelesRight(1.5);
	    System.out.println("Triangle has sides A = " + one.getA() + ", B = " + one.getB() + ", C = " + one.getC());
	    System.out.println("Equilateral Triangle has sides A = " + one.getB() + ", B = " + one.getB() + ", C = " + one.getB());
	    System.out.println("Isosceles Right Triangle has sides A = " + one.getA() + ", B = " + one.getB() + ", C = " + one.getC());
	}
}
