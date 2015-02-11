/**
 * Write a program to calculate the value of pi by simulating throwing darts at a dart board.
 * 
 * @author Gatlin Newhouse
 * @version 11/03/2014
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class Darts
{
    public static double[] average(int trials)throws IOException
    {
        double [] averages = new double[trials];
        Random rand = new Random();
        int hits = 0;
        int nthrows = 0;
        double x;
        double y;
        for (int i = 0; i < trials; i++)
        {
            nthrows ++; //throw a dart
            x = rand.nextDouble();
            y = rand.nextDouble();
            if ((x*x + y*y) <= 1)
            {
                hits ++;
            }
            averages[i] = 4 * (((double)hits)/((double)nthrows));
        }
        return averages;
    }
    public static void printQuestion()
    {
        System.out.printf("%s","How many trials? ");
    }
    public static void printResults(int trials, double[] averages)throws IOException
    {
        System.out.printf("\n");
        for (int i = 0; i < trials; i++)
        {
            System.out.printf("%s %.2s %s %.8f \n","Trial [", i, "]: pi = ", averages[i]);
        }
    }
    public static double calcaverages(int trials, double[] averages)throws IOException
    {
        double average = 0;
        for (int i = 0; i < trials; i ++)
        {
            average += averages[i];
        }
        average /= trials;
        return average;
    }
    public static void printEstimate(double average)
    {
        System.out.printf("%s %.8f", "Estimate of pi = ", average);
    }
    public static void main(String[] args)throws IOException
    {
        Scanner in = new Scanner(System.in);
        printQuestion();
        int trials = in.nextInt();
        double [] averages = average(trials);
        printResults(trials, averages);
        double average = calcaverages(trials, averages);
        printEstimate(average);
    }
}