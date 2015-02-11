/**
 * Write a program that allows the user to guess a random number chosen by the 
computer. And allow the user to pick the range.
 * 
 * @author Gatlin Newhouse 
 * @version 10/18/14
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGame_v2
{
	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    Random rand = new Random();
	    System.out.println("What is largest number?");
	    int toplimit = in.nextInt();
	    System.out.println("What is the smallest number?");
	    int bottomlimit = in.nextInt();
	    int number = rand.nextInt(toplimit) + bottomlimit;
	    int guess = 0;
	    int guesses = 0;
	    System.out.println("The number is between 1 and 100");
	    System.out.println();
	    while(guess != number)
	    {
	        System.out.println("Guess what the number is!");
	        guess = in.nextInt();
	        guess += bottomlimit;
	        if (guess > number)
	        {
	           System.out.println("Too high!");
	           guesses ++;
	        } else if (guess < number)
	        {
	           System.out.println("Too low!");
	           guesses ++;
	        }
	    }
	    if (guess == number)
	    {
	        System.out.println("Congratulations");
	        System.out.println("The random number was: " + number);
	        System.out.println("Number of guesses: " + guesses);
	    }
	}
}
