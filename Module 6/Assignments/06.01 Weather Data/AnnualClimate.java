/**
 * Write a program that displays the average temperature and the annual 
 * precipitation for a selected city. The user should be able to choose whether 
 * temperature is displayed in Fahrenheit or Celsius and whether precipitation is 
 * displayed in inches or centimeters. 
 * 
 * @author: Gatlin Newhouse
 * @version: 10/24/2014
 *
 */
import java.util.*;
import java.text.*;
import java.io.*;
class AnnualClimate
{
    public static void main (String [ ] args)
	{
	    //Declare and intialize variables - programmer to provide initial values
		Scanner in = new Scanner(System.in);
		String city = "Tallahassee";
		String state = "Florida";
		String month [] ={"Jan.", "Feb.", "Mar.", "Apr.", "May ", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
		double temperature [] ={51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7}; 		//initialize with Fahrenheit values
		double precipitation [] ={5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1}; 	//initialize with inches values
		String tempLabel = "(F)";   //initialize to F
		String precipLabel = "(in.)"; //initialize to in
		//INPUT - ask user for temp and preciptation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();
		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555
		if(tempChoice.equalsIgnoreCase("C"))
		{
			tempLabel="(C)";
			for( int index = 0; index < temperature.length; index++)
			{
				//code for assigning new C values to the temperature array
				temperature[index] -= 32.0;
				temperature[index] /= 1.8;
			}
		}
		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice.equalsIgnoreCase("c"))
		{
			precipLabel="(cm)";
			for( int index = 0; index < precipitation.length; index++)
			{
			    precipitation[index] *= 2.54;
			}
		}
		//OUTPUT - print table using printf to format and align data
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println();
		System.out.printf("%34s","Climate Data");
		System.out.printf("\n %23s %s %s %s", "Location: ", city,",", state);
		System.out.println();
		System.out.printf("\n %5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.println();
		System.out.printf("***************************************************");
		for ( int index = 0; index < month.length; index ++)
		{
		    System.out.printf("\n %s %18.1f %18.1f",month[index], temperature[index], precipitation[index]);
		}
		System.out.println();
		System.out.printf("***************************************************");
		System.out.println();
		double averageTemperature = 0.0;
		for ( int index = 0; index < temperature.length; index ++)
		{
		    averageTemperature += temperature[index];
		}
		averageTemperature /= temperature.length;
		double averagePrecipitation = 0.0;
		for ( int index = 0; index < precipitation.length; index ++)
		{
		    averagePrecipitation += precipitation[index];
		}
		averagePrecipitation /= precipitation.length;
		System.out.printf("%19s %.1f %14s %.1f", "Average: ", averageTemperature, "Annual: ", averagePrecipitation);
    } //end main class
}//end Annual Climate
