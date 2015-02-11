/**
 * Write a program that uses the Monte Carlo sampling method to estimate 
 * the average number of bottles of e-Boost someone would have to drink to 
 * win a prize. There is a 1 in 5 chance that a bottle cap will have a prize.
 *
 * @author Gatlin Newhouse
 * @version 10/22/2014
 */
import java.util.*;
import java.io.*;
import java.text.*;
public class BottleCapPrize
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in); //initialize input
        Random rand = new Random(); //initialize randoms
        int count = 0; //initialize the counter
        int randBottleCap = rand.nextInt(5)+1; //pick an initial random value for the guessing cap
        int winningBottleCap = rand.nextInt(5)+1; //pick a random number for the winning cap
        PrintWriter outFile = new PrintWriter(new File("trials.txt"));
        while (randBottleCap != winningBottleCap)
        {
            count++;
            randBottleCap = rand.nextInt(5)+1;
        }
        outFile.println(count);
        outFile.close();
        int count2 = 0;
        PrintWriter outFileTwo = new PrintWriter(new File("usertrials.txt"));
        System.out.println("How many trials would you like to run?");
        int trials = in.nextInt();
        int winningCaps = 0;
        for (int trialnumber = 1; trialnumber <= trials; trialnumber++)
        {
            winningBottleCap = rand.nextInt(5)+1;
            while (randBottleCap != winningBottleCap)
            {
                count2 ++;
                randBottleCap = rand.nextInt(5)+1;
            }
            outFileTwo.println(count2);
            winningCaps ++;
        }
        outFileTwo.close();
        int totalTrials = 0;
        Scanner inFile = new Scanner(new FileReader("usertrials.txt"));
        while (inFile.hasNext())
        {
            totalTrials += inFile.nextInt();
        }
        int averageCapsOpened = totalTrials / trials;
        outFileTwo.close();
        System.out.println("It took an average of " + averageCapsOpened + " caps opened before you won a prize.");
    } //end main
}//end class

