/**
 * Write a program to determine if a user has correctly chosen a randomly selected three digit number.
 * 
 * @author Gatlin Newhouse
 * @version 10/19/2014
 */
import java.util.Random;
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        String lotteryNum = "";
        String userGuess = "";
        //Generate a 3-digit "lottery" number composed of random numbers
        //Simulate a lottery by drawing one number at a time and 
        //concatenating it to the string
        //Identify the repeated steps and use a for loop structure
        int terminator = 3;
        Random rand = new Random();
        for(int counter = 1; counter <= terminator; counter ++)
        {
            int digit = rand.nextInt(9) + 1;
            lotteryNum += Integer.toString(digit);
        }
        //Input: Ask user to guess 3 digit number
        System.out.print("Please enter your three numbers (e.q. 123): ");
        String bet = in.nextLine();
        System.out.println("Winning numbers: " + lotteryNum);
        //Compare the user's guess to the lottery number and report results
        String firstDigitWinner = lotteryNum.substring(0,1);
        String secondDigitWinner = lotteryNum.substring(1,2);
        String thirdDigitWinner = lotteryNum.substring(2);
        String firstDigitBet = bet.substring(0,1);
        String secondDigitBet = bet.substring(1,2);
        String thirdDigitBet = bet.substring(2);
        if(firstDigitWinner.equals(firstDigitBet) && secondDigitWinner.equals(secondDigitBet) && thirdDigitWinner.equals(thirdDigitBet))
        {
            System.out.print("Congratulations, both pairs matched.");
        } else if (firstDigitWinner.equals(firstDigitBet) && secondDigitWinner.equals(secondDigitBet) && !thirdDigitWinner.equals(thirdDigitBet))
        {
            System.out.print("Congratulations, the front pair matched.");
        } else if (!firstDigitWinner.equals(firstDigitBet) && secondDigitWinner.equals(secondDigitBet) && thirdDigitWinner.equals(thirdDigitBet))
        {
            System.out.print("Congratulations, the end pair matched.");
        } else if ((!firstDigitWinner.equals(firstDigitBet) && !secondDigitWinner.equals(secondDigitBet)) || (!secondDigitWinner.equals(secondDigitBet) && !thirdDigitWinner.equals(thirdDigitBet)))
        {
            System.out.print("Sorry no matches. You only had one chance out of 100 to win anyways.");
        }
    } //end main
}//end class Lottery