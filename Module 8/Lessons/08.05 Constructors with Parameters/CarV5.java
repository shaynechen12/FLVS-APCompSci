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
public class CarV5
{
    int startMiles1, endMiles1;
    double gallonsUsed, mpg1, distance1, gpm1, pricepergallon, cost;
    String carName;
    CarV5()
    {
    }
    CarV5(String name, int start1, int end1, double gallons, double price)
    {
        carName = name;
        startMiles1 = start1;
        endMiles1 = end1;
        gallonsUsed = gallons;
        pricepergallon = price;
    }
    public double calcMPG(double distance1, double gallonsUsed1)
    {
        return distance1 / gallonsUsed1;
    }
    public double calcDistance(int startMiles1, int endMiles1)
    {
        return endMiles1 - startMiles1;
    }
    public double calcCost(double gallonsUsed1, double pricepergallon)
    {
        return pricepergallon * gallonsUsed1;
    }
    public double calcGallonPerMile(double gallonsUsed1, double distance1)
    {
        return gallonsUsed1 / distance1;
    }
    public void printIt(String carName, int startMiles1, int endMiles1, double distance1, double gallonsUsed1, double pricepergallon, double cost, double mpg1, double gpm1)
    {
        System.out.printf("%55s\n" , "Gas Mileage Calculations");
        System.out.printf("%s\n","================================================================================================================");
        System.out.printf("%10s %14s %13s %11s %11s %11s %11s %11s %11s \n" ,"Type of Car","Start Miles","End Miles","Distance","Gallons","Price","Cost","Miles/Gal","Gal/Mile");
        System.out.printf("%s\n","================================================================================================================");
        System.out.printf("%10s %7s %15s %11.3s %11s %13s %11.2f %11.1f %11.3f \n", carName, startMiles1, endMiles1, distance1, gallonsUsed1, pricepergallon, cost, mpg1, gpm1);
    }
    public static void main(String[] args)
    {
        int sM1, eM1;
        double dis1, usedGallons1, price4gallon, cst, milesPerGallon1, gallonsPerMile;
        String cName;
        sM1 = 14373; eM1 = 14731; usedGallons1 = 16.2; price4gallon = 2.98;
        cName = "08 Toyota RAV4";
        CarV5 car = new CarV5(cName, sM1, eM1, usedGallons1, price4gallon);
        dis1 = car.calcDistance(sM1, eM1);
        milesPerGallon1 = car.calcMPG(dis1, usedGallons1);
        cst = car.calcCost(usedGallons1, price4gallon);
        gallonsPerMile = car.calcGallonPerMile(usedGallons1, dis1);
        car.printIt(cName, sM1, eM1, dis1, usedGallons1, price4gallon, cst, milesPerGallon1, gallonsPerMile);
    }
}