/**
 * Runs program
 * 
 * @author Gatlin Newhouse 
 * @version 2/3/2015
 */
import java.util.Scanner;
public class PrimeNumbersTester2
{
    public static void main(String[] args)  
    {
        int remainder, count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper limit of prime numbers to find: ");
        int upperLimit = in.nextInt();
        PrimeNumbers2 primeNum = new PrimeNumbers2(upperLimit);
        int counter = primeNum.calculatePrimes();
        System.out.println("Total prime numbers between 1 and " + upperLimit + " = " + counter);
    }
}