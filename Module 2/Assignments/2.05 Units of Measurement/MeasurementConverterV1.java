/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Gatlin Newhouse
 * Date: 9-13-14
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      //number of feet per 1 mile
        double milesPerFeet = 0.000189394; //number of miles per 1 foot
        double kilometers; //distance in kilometers
        double milesPerKilometer = 0.621371; //number of miles per 1 kilometer
        double kilometersPerMile = 1.60934; //number of kilometers per 1 miles
        double pounds; //mass in pounds
        double kilograms; //mass in kilograms
        double poundsPerKilogram = 2.20462; //number of pounds per 1 kilogram
        double kilogramsPerPound = 0.453592; //number of kilograms per 1 pound
        double usagallons; //volume in US gallons
        double liters; //volume in liters
        double usagallonsPerLiter = 0.264172; //number of US gallons per 1 liter
        double literPerUSAGallon = 3.78541; //number of liters per 1 US gallon
        double inches; //length in inches
        double centimeters; //length in centimeters
        double inchesPerCentimeter = 0.393701; //number of inches per 1 centimeter
        double centimeterPerInch = 2.54; //number of centimeters per 1 inch

        //conversions
        System.out.println("**********************************");
        System.out.println("   This Program converts between  ");
        System.out.println("   selected units of measurement  ");
        System.out.println("**********************************");
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");
        miles = 2.1;
        feet = miles / milesPerFeet;
        System.out.println(miles + " mi. = " + feet + " ft.");
        miles = 15;
        kilometers = miles / milesPerKilometer;
        System.out.println(miles + " mi. = " + kilometers + " km.");
        kilometers = 10;
        miles = kilometers / kilometersPerMile;
        System.out.println(kilometers + " km. = " + miles + " mi.");
        pounds = 5;
        kilograms = pounds / poundsPerKilogram;
        System.out.println(pounds + " lb. = " + kilograms + " kg.");
        kilograms = 8;
        pounds = kilograms / kilogramsPerPound;
        System.out.println(kilograms + " kg. = " + pounds + " lb.");
        usagallons = 7;
        liters = usagallons / usagallonsPerLiter;
        System.out.println(usagallons + " U.S. gallons = " + liters + " l.");
        liters = 4;
        usagallons = liters / literPerUSAGallon;
        System.out.println(liters + " l. = " + usagallons + " U.S. gallons");
        inches = 12;
        centimeters = inches / inchesPerCentimeter;
        System.out.println(inches + " in. = " + centimeters + " cm.");
        centimeters = 34;
        inches = centimeters / centimeterPerInch;
        System.out.println(centimeters + " cm. = " + inches + " in.");
    }//end of main method
}//end of class

