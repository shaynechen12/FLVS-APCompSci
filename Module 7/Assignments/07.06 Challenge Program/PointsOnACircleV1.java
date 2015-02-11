/**
 * Write a program to calculate the (x, y) coordinates of points on a circle of radius 1.0. 
 * 
 * @author Gatlin Newhouse
 * @version 10/29/2014
 */
import java.io.*;
import java.text.*;
public class PointsOnACircleV1
{
    public static void main(String[] args)
    {
        double[] xcoords = {1.00, 0.90, 0.80, 0.70, 0.60, 0.50, 0.40, 0.30, 0.20, 0.10, 0.00, -0.10, -0.20, -0.30, -0.40, -0.50, -0.60, -0.70, -0.80, -0.90, -1.00};
        double radius = 1.0;
        System.out.printf("%s \n","        Points on a Circle of Radius 1.0","");
        System.out.printf("%10s %7s %13s %7s \n","X1","Y1","X2","Y2");
        System.out.println("--------------------------------------------------");
        for(int count = 0; count < xcoords.length; count++)
        {
            double ycoords1 = Math.sqrt(Math.pow(radius,2) - Math.pow(xcoords[count], 2));
            double ycoords2 = -ycoords1;
            System.out.printf("%10.2f %7.2f %13.2f %7.2f \n", xcoords[count], ycoords1, xcoords[count], ycoords2);
        }
    }
}
