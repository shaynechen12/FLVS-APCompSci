/**
 * Where we'll calculate the CO2 emissions and such.
 * 
 * @author Gatlin Newhouse
 * @version 11/13/14
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class CO2FootprintV1
{
    private double usedGallons, imperialEmissions, metricEmissions, a, b;
    /**
     * Create the object and set values!
     */
    CO2FootprintV1(double gallons, double emissions, double metricconstant)
    {
        usedGallons = gallons;
        a = emissions;
        b = metricconstant;
    }
    /**
     * Mutator method for calculating the footprint value
     */
    public void calcFootprint()
    {
        metricEmissions= a * usedGallons;
    }
    /**
     * This is a method to return the metric value of the footprint
     * @return the footprint in metric
     */
    public double getFootprint()
    {
        return metricEmissions;
    }
    /**
     * Mutator method for converting the footprint from metric to imperial
     */
    public void convertMetricToPounds()
    {
        imperialEmissions = b * metricEmissions;
    }
    /**
     * This is a method to return the imperial value of the footprint
     * @return the footprint in imperial
     */
    public double getFootprintImperial()
    {
        return imperialEmissions;
    }
    /**
     * This is a method to return the gallons used
     * @return the gallons
     */
    public double getGallons()
    {
        return usedGallons;
    }
}
