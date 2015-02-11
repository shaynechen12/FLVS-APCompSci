/**
 * Morse Code goes in, English comes out.
 * 
 * @author Gatlin Newhouse
 * @version 1/28/2015
 */
import java.util.*;
import java.io.*;
public class MorseCode
{
    private static String input;
    public static void printAndTakeInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to translate into morse code?");
        input = in.nextLine();
    }
    public static String encode(Scanner inFile)
    {
        char [] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 
            'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        ArrayList<String> file = new ArrayList<String>();
        while (inFile.hasNext())
        {
            file.add(inFile.nextLine());
        }
        String[] codes = new String[ file.size() ];
        file.toArray( codes );
        inFile.close();
        String output = "";
        for (int n = 0; n < input.length(); n++)
        {
            char a = input.charAt(n);
            for (int i = 0; i < english.length; i++)
            {
                if (a == english[i])
                {
                    output += codes[i];
                }
            }
        }
        return output;
    }
}
