/**
 * Calculate the fuel economy of your family or personal car in terms of gallons per mile 
 * and the total cost for one fill-up. 
 * 
 * @author Gatlin Newhouse
 * @version 11/10/14
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class CarV7
{
    int startMiles1, endMiles1;
    double gallonsUsed1, mpg1, distance1, gpm1, pricepergallon1, cost1;
    String carName1;
    CarV7()
    {
    }
    CarV7(String name1, int start1, int end1, double gallons1, double price1)
    {
        carName1 = name1;
        startMiles1 = start1;
        endMiles1 = end1;
        gallonsUsed1 = gallons1;
        pricepergallon1 = price1;
    }
    public double calcMPG(double distance1, double gallonsUsed1)
    {
        return distance1 / gallonsUsed1;
    }
    public double calcDistance(int startMiles1, int endMiles1)
    {
        return endMiles1 - startMiles1;
    }
    public double calcCost(double gallonsUsed1, double pricepergallon1)
    {
        return pricepergallon1 * gallonsUsed1;
    }
    public double calcGallonPerMile(double gallonsUsed1, double distance1)
    {
        return gallonsUsed1 / distance1;
    }
    public void printIt(String carName1, int startMiles1, int endMiles1, double distance1, double gallonsUsed1, double pricepergallon1, double cost1, double mpg1, double gpm1)
    {
        System.out.printf("%10s %7s %15s %11.3s %11s %13s %11.2f %11.1f %11.3f \n", carName1, startMiles1, endMiles1, distance1, gallonsUsed1, pricepergallon1, cost1, mpg1, gpm1);
    }
}