/**
 * This assignment requires you to write a program to simulate tossing a pair of dice and calculating the probabilities of all possible combinations.
 *
 * @author Gatlin Newhouse
 * @version 10/22/2014
 *
 *
 */

import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
        //Declare and initialize variables and objects
        int sum = 0;
        int numSides = 0;
        int numRolls = 0;
        int match = 0;
        int die2 = 0;
        int die1 = 0;
        double probability = 0.0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        //Input: ask user for number of rolls and number of sides on a die
        System.out.println("How many sides are on a die?");
        numSides = in.nextInt();
        System.out.println("How many times do you want roll the die?");
        numRolls = in.nextInt();
        //Print heading for output table
        System.out.print("\n Sum of Dice \t Probability \n");
        for( sum = 2; sum <= (numSides * 2 ); sum++ )
        {
            match = 0;
            for(int roll = 0; roll < numRolls; roll++)
            {
                die1 = rand.nextInt( numSides ) +1;
                die2 = rand.nextInt( numSides ) +1;
                if (die1 + die2 == sum)
                {
                    match++;
                    probability = (double)match / numRolls * 100;
                    System.out.println("    " + sum + "\t\t" + probability );
                }
            }
        }
    } //end main
}//end class DiceProbability
