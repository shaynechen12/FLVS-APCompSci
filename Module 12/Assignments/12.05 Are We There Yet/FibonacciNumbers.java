/**
 * Write a description of class FibonacciNumbers here.
 * 
 * @author Gatlin Newhouse
 * @version 1/6/2015
 */
import java.util.*;
import java.io.*;
public class FibonacciNumbers
{ 
    FibonacciNumbers()
    {
    }
    public int fibonacci(int n)
    {
        int a = 0;
        if (n == 0)
        {
            a= 0;
        }
        else
        if (n == 1)
        {
            a = 1;
        }
        else
        if(n > 1)
        {
            a = (fibonacci(n-1)) + (fibonacci(n-2));
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        FibonacciNumbers fMethods = new FibonacciNumbers();
        System.out.println("Type 'q' to quit, enter any number for n greater than 0");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("What is n equal to? ");
        String input = in.nextLine();
        if(input.equals("q"))
        {
            System.exit(1);
        }
        int n = Integer.parseInt(input);
        System.out.println();
        System.out.print("x = " + fMethods.fibonacci(n));
        System.out.println();
        main(args);
    }
}
