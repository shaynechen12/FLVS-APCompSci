/**
 * Calculate the fuel economy of your family or personal car for one fill-up. 
 * 
 * @author Gatlin Newhouse
 * @version 11/7/2014
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class CarV3
{
    CarV3()
    {
    }
    public double calcMPG(double distance1, double gallonsUsed1)
    {
        return distance1 / gallonsUsed1;
    }
    public double calcDistance(int sM1, int eM1)
    {
        return eM1 - sM1;
    }
    public static void main(String[] args)
    {
        int startMiles1, endMiles1;
        double gallonsUsed1, mpg1, distance1;
        String carName;
        startMiles1 = 14373; endMiles1 = 14731;
        gallonsUsed1 = 16.2;
        carName = "08 Toyota RAV4";
        CarV3 car = new CarV3();
        distance1 = car.calcDistance(startMiles1, endMiles1);
        mpg1 = car.calcMPG(distance1, gallonsUsed1);
        System.out.printf("%55s\n" , "Gas Mileage Calculations");
        System.out.printf("%s\n","=============================================================================");
        System.out.printf("%10s %14s %13s %11s %11s %11s \n" ,"Type of Car","Start Miles","End Miles","Distance","Gallons","Miles/Gal");
        System.out.printf("%s\n","=============================================================================");
        System.out.printf("%10s %7s %13s %11s %11.1f %11.1f \n", carName, startMiles1, endMiles1, distance1, gallonsUsed1, mpg1);
    }
}



