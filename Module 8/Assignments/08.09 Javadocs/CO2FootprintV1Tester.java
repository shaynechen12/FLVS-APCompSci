/**
 * Test the objects and calculations.
 * 
 * @author Gatlin Newhouse
 * @version 11/13/14
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class CO2FootprintV1Tester
{
    public static void main(String[] args)
    {
        double gallonsUsed = 1288.0;
        double emissionsConstant = 8.78 * Math.pow(10, -3);
        double emissionsEmitted, emissionsEmittedImperial;
        double metricToPoundsConstant = 2204.62262;
        CO2FootprintV1 data = new CO2FootprintV1(gallonsUsed, emissionsConstant, metricToPoundsConstant);
        data.calcFootprint();
        data.convertMetricToPounds();
        emissionsEmitted = data.getFootprint();
        emissionsEmittedImperial = data.getFootprintImperial();
        System.out.printf("%28s \n","CO2 Emissions");
        System.out.printf("%s %15s %15s \n", "Gallons ", "Pounds ", "Tons");
        System.out.printf("%s %18s %18s \n", "of Gas", "from Gas", "from Gas");
        System.out.println("*********************************************");
        System.out.printf("%.1f %18.2f %18.3f",data.getGallons(), emissionsEmittedImperial, emissionsEmitted);
    }
}
