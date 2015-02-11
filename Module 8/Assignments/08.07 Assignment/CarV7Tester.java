/**
 * Modify the CarV5 class to instantiate multiple objects. 
 * 
 * @author Gatlin Newhouse
 * @version 11/11/2014
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class CarV7Tester
{
    public static void main(String[] args)
    {
        int sM1, eM1; //first car intialized
        int sM2, eM2; //second car intialized
        double dis1, usedGallons1, price4gallon1, cst1, milesPerGallon1, gallonsPerMile1; //first car intialized
        double dis2, usedGallons2, price4gallon2, cst2, milesPerGallon2, gallonsPerMile2; //second car intialized
        String cName1, cName2; //first and second car names intialized
        sM1 = 14373; eM1 = 14731; usedGallons1 = 16.2; price4gallon1 = 2.98; //first car values set
        cName1 = "08 Toyota RAV4"; //first car name set
        cName2 = "07 Toyota Corolla"; //second car name set
        sM2 = 125567; eM2 = 125809; usedGallons2 = 12.3; price4gallon2 = 3.03; //second car values set
        CarV7 car2 = new CarV7(cName2, sM2, eM2, usedGallons2, price4gallon2); //second car object
        CarV7 car1 = new CarV7(cName1, sM1, eM1, usedGallons1, price4gallon1); //first car object
        dis1 = car1.calcDistance(sM1, eM1); //distance for first car
        dis2 = car2.calcDistance(sM2, eM2); //distance for second car
        milesPerGallon1 = car1.calcMPG(dis1, usedGallons1); //MPG for first car
        milesPerGallon2 = car2.calcMPG(dis2, usedGallons2); //MPG for second car
        cst1 = car1.calcCost(usedGallons1, price4gallon1); //cost for first car
        cst2 = car2.calcCost(usedGallons2, price4gallon2); //cost for second car
        gallonsPerMile1 = car1.calcGallonPerMile(usedGallons1, dis1); //gpm for first car
        gallonsPerMile2 = car2.calcGallonPerMile(usedGallons2, dis2); //gpm for second car
        System.out.printf("%55s\n" , "Gas Mileage Calculations");
        System.out.printf("%s\n","================================================================================================================");
        System.out.printf("%10s %14s %13s %11s %11s %11s %11s %11s %11s \n" ,"Type of Car","Start Miles","End Miles","Distance","Gallons","Price","Cost","Miles/Gal","Gal/Mile");
        System.out.printf("%s\n","================================================================================================================");
        car1.printIt(cName1, sM1, eM1, dis1, usedGallons1, price4gallon1, cst1, milesPerGallon1, gallonsPerMile1); //print first car info
        car2.printIt(cName2, sM2, eM2, dis2, usedGallons2, price4gallon2, cst2, milesPerGallon2, gallonsPerMile2); //print second car
    }
}
