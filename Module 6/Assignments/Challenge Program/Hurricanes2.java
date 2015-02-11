/**
 * Write a program to calculate the average category, pressure, and wind speed of all Atlantic Hurricanes that have occurred from 1980 - 2006. 
 * Also tally the number of storms in each category. (Talk to your instructor if you have an alternate assignment in mind.)
 *
 * @author: Gatlin Newhouse
 * @version: 10/25/2014
 *
 */
import java.util.*;
import java.io.*;
import java.text.*;
public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
    	//declare and initialize variables
		int arrayLength = 59;
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
        int [] pressure = new int[arrayLength];
        double [] windspeed = new double[arrayLength];
        String [] name = new String[arrayLength];
        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);
        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            windspeed[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        inFile.close();
		//PROCESSING - calculate and convert values
		// convert windspeed from knots to MPH
		for(index = 0; index < windspeed.length; index++)
		{
		    windspeed[index] *= 1.15078;
		}
		// determine category
		int [] category = new int[arrayLength];
		for(index = 0; index < windspeed.length; index++)
		{
		    if(((windspeed[index]) >= 74) && ((windspeed[index]) <= 95))
		    {
		        category[index] = 1;
		    } else if(((windspeed[index]) >= 96) && ((windspeed[index]) <= 110))
		    {
		        category[index] = 2;
		    } else if(((windspeed[index]) >= 111) && ((windspeed[index]) <= 130))
		    {
		        category[index] = 3;
		    } else if(((windspeed[index]) >= 131) && ((windspeed[index]) <= 155))
		    {
		        category[index] = 4;
		    } else if(((windspeed[index]) > 155))
		    {
		        category[index] = 5;
		    }
		}
		// count number of each category
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		for(index = 0; index < category.length; index ++)
		{
		    if((category[index]) == 1)
		    {
		        count1 ++;
		    } else if ((category[index]) == 2)
		    {
		        count2 ++;
		    } else if ((category[index]) == 3)
		    {
		        count3 ++;
		    } else if ((category[index]) == 4)
		    {
		        count4 ++;
		    } else if ((category[index]) == 5)
		    {
		        count5 ++;
		    }
		}
        //Find min, max and average for category, windspeed and pressure
        double categoryAverage = 0;
        double pressureAverage = 0;
        double windspeedAverage = 0;
        for (index = 0; index < category.length; index ++)
        {
            categoryAverage += category[index];
        }
        categoryAverage /= category.length;
        for (index = 0; index < pressure.length; index ++)
        {
            pressureAverage += pressure[index];
        }
        pressureAverage /= pressure.length;
        for (index = 0; index < windspeed.length; index ++)
        {
            windspeedAverage += windspeed[index];
        }
        windspeedAverage /= windspeed.length;
        //FIND THE MAX AND MIN
        int categoryMin = Integer.MAX_VALUE;
        int categoryMax = Integer.MIN_VALUE;
        for(index = 0; index < category.length; index ++)
        {
            if (category[index] < categoryMin)
            {
                categoryMin = category[index];
            }
        }
        for(index = 0; index < category.length; index ++)
        {
            if (category[index] > categoryMax)
            {
                categoryMax = category[index];
            }
        }
        int pressureMin = Integer.MAX_VALUE;
        int pressureMax = Integer.MIN_VALUE;
        for(index = 0; index < pressure.length; index ++)
        {
            if(pressure[index] < pressureMin)
            {
                pressureMin = pressure[index];
            }
        }
        for(index = 0; index < pressure.length; index ++)
        {
            if(pressure[index] > pressureMax)
            {
                pressureMax = pressure[index];
            }
        }
        double windspeedMin = Double.MAX_VALUE;
        double windspeedMax = Double.MIN_VALUE;
        for(index = 0; index < windspeed.length; index ++)
        {
            if(windspeed[index] < windspeedMin)
            {
                windspeedMin = windspeed[index];
            }
        }
        for(index = 0; index < windspeed.length; index ++)
        {
            if(windspeed[index] > windspeedMax)
            {
                windspeedMax = windspeed[index];
            }
        }
        //Output - print table using printf to format the columns
        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        for (int n = 0; n < year.length; n++)
        {
            System.out.printf("%1d %13s %8d %14d %18.0f \n",year[n],name[n],category[n],pressure[n],windspeed[n]);
        }
        System.out.println("=====================================================================");
        System.out.printf("%s %19.1s %14.3s %18.3s \n","Average",categoryAverage,pressureAverage,windspeedAverage);
        System.out.printf("%s %19.1s %14.4s %18.3s \n","Maximum",categoryMax,pressureMax,windspeedMax);
        System.out.printf("%s %19.1s %14.4s %18.2s \n","Minimum",categoryMin,pressureMin,windspeedMin);
        System.out.println();
        System.out.println("Number of Category 1: " + count1);
        System.out.println("Number of Category 2: " + count2);
        System.out.println("Number of Category 3: " + count3);
        System.out.println("Number of Category 4: " + count4);
        System.out.println("Number of Category 5: " + count5);
    }//end main()
}//end Hurricanes2
