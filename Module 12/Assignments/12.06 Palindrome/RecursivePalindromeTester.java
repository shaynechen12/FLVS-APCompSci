/**
 * Write a description of class RecursivePalindromeTester here.
 * 
 * @author Gatlin Newhouse
 * @version 1/7/2015
 */
import java.util.*;
public class RecursivePalindromeTester
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a word to check if its a palindrome or not (type \"quit\" to quit): ");
        String x = sc.nextLine();
        if(x.equals("quit"))
        {
            System.exit(1);
        }
        if(RecursivePalindrome.isPal(x))
        {
            System.out.println(x + " is a palindrome");
        }
        else
        {
            System.out.println(x + " is not a palindrome");
        }
        System.out.println();
        main(args);
    }
}
