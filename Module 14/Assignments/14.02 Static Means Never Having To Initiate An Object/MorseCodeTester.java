/**
 * This runs the convertor
 * 
 * @author Gatlin Newhouse
 * @version 1/28/2014
 */
import java.io.*;
import java.util.*;
public class MorseCodeTester
{
    public static void main(String[] args) throws IOException
    {
        MorseCode.printAndTakeInput();
        Scanner m = new Scanner(new File("morsecode.txt"));
        String printme = MorseCode.encode(m);
        System.out.println(printme);
    }
}
