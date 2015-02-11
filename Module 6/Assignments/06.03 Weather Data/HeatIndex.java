/**
 * Heat Index description: 
 * Write a program that uses temperature and relative humidity data to calculate the heat index of a specific city.
 *
 * @author: Gatlin Newhouse
 * @version: 10/24/2014
 *
 */

import java.util.*;
import java.text.*;
import java.io.*;
public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
    	//initialize and declare vars
    	String location = "Key West, Florida ";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");
        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];
        //INPUT - read in data for temp and humidity from files
		int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            //System.out.println (temperature[n]); //debug statement - uncomment to see values assignned to temperature
            n++;
        }
        inFileTemp.close();
        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                //System.out.println (humidity[n]);  //debug statement - uncomment to see values assignned to humidity
                n++;
        }
        inFileHumid.close();
        //PROCESSING - calculate Heat Index if needed- see lecture notes for details, formula is incomplete
        double t = 0.0;
		int h = 0;
		for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0  ) //determine if HI should be calculated, complete the condition based on Lecture notes
            {
            	t = temperature[n];
            	h = humidity[n];

                hI[n] = -42.379;
                hI[n] += (2.04901523 * t); //complete formula found in lecture notes
                hI[n] += (10.14333127 * h);
                hI[n] -= (0.22475541 * t * h);
                hI[n] -= (6.83783 * 0.001 * t * t);
                hI[n] -= (5.481717 * 0.01 * h * h);
                hI[n] += (1.22874 * 0.001 * t * t * h);
                hI[n] += (8.5282 * 0.0001 * t * h *h);
                hI[n] -= (1.99 * 0.000001 * t * t * h * h);
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }
        //calculate averages for temperature, humidity and HI
        double tempSum = 0.0;
        int humidSum = 0;
        double hISum = 0.0;
        for(n = 0; n < temperature.length; n++)
        {
        	tempSum += temperature[n];
        }
        double tempAvg = tempSum / length;
        for(n = 0; n < humidity.length; n++)
        {
        	humidSum += humidity[n];
        }
        double humidAvg = humidSum / humidity.length;
        for(n = 0; n < hI.length; n++)
        {
        	hISum += hI[n];
        }
        double hIAvg = hISum / hI.length;
        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI
        System.out.printf("%45s %15s \n", "Heat Index:", location);
        System.out.println();
        System.out.printf("%50s", "Months ");
        System.out.println();
        System.out.print("            ");
        for(String m : month)
        {
            System.out.printf("%6.3s", m);
        }
        System.out.println("  Avg");
        System.out.println("******************************************************************************************");
        System.out.print("Temp (F)    ");
        for(double temp : temperature)
        {
            System.out.printf("%6.4s", temp);
        }
        System.out.printf("%6.4s",tempAvg);
        System.out.println();
        System.out.print("Humidity (%)");
        for(int humid : humidity)
        {
            System.out.printf("%6.2s", humid);
        }
        System.out.printf("%6.2s",humidAvg);
        System.out.println();
        System.out.print("HI (F)      ");
        for(double heatIndex : hI)
        {
            System.out.printf("%6.4s", heatIndex);
        }
        System.out.printf("%6.4s",hIAvg);
        System.out.println();
    } //end main()
}//end HeatIndex
