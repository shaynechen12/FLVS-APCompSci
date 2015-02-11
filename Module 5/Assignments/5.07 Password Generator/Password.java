/**
 * Write a program to generate random passwords.
 * The user should be able to select the character set and the length.  
 * 
 * @author Gatlin Newhouse
 * @version 10/23/2014
 */
import java.util.*;
import java.io.*;
import java.text.*;
public class Password
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("                          Password Generation Menu                                ");
        System.out.println("**********************************************************************************");
        System.out.println("*    [1] Lowercase Letters                                                       *");
        System.out.println("*    [2] Lowercase and Uppercase Letters                                         *");
        System.out.println("*    [3] Lowercase, Uppercase, and Numbers                                       *");
        System.out.println("*    [4] Lowercase, Uppercasem Numbers, and Punctuation                          *");
        System.out.println("*    [5] Quit                                                                    *");
        System.out.println("**********************************************************************************");
        System.out.println();
        System.out.print("Enter Selection (1-5): ");
        int selection = in.nextInt();
        if (selection == 5)
        {
            System.exit(0);
        } else if (selection < 1 || selection > 5)
        {
            System.err.println("Error: The selection you chose was wrong, try again!");
            System.exit(0);
        }
        System.out.println();
        System.out.print("Password Length (1-14): ");
        int length = in.nextInt();
        if ((length < 1) || (length > 14))
        {
            System.err.println("Error: The password length can only be between 1 and 14");
            System.exit(0);
        }
        int character = 0;
        System.out.println();
        System.out.print("Password: ");
        for (int counter = 0; counter < length; counter ++)
        {
            character = 0;
            if (selection == 1)
            {
                while(!(character >= 97 && character <= 122))
                {
                  character = rand.nextInt(127);
                }
            } else if (selection == 2)
            {
                while(!(character >= 65 && character <= 90) && !(character >= 97 && character <= 122))
                {
                    character = rand.nextInt(127);
                }
            } else if (selection == 3)
            {
                while(!(character >= 48 && character <= 57)  && !(character >= 65 && character <= 90) && !(character >= 97 && character <= 122))
                {
                    character = rand.nextInt(127);
                }
            } else if (selection == 4)
            {
                while(!(character >= 48 && character <= 122) && !(character >= 48 && character <= 57)  && !(character >= 65 && character <= 90) && !(character >= 97 && character <= 122))
                {
                    character = rand.nextInt(127);
                }
            } else if (selection < 1 || selection > 5)
            {
                System.err.println("Error: The selection you chose was wrong, try again!");
                System.exit(0);
            }
            System.out.print((char)(character));
        }
    }
}
