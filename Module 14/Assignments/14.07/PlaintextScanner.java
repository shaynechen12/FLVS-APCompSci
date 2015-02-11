/**
 * Scans a file to find the frequency of a letter.
 * 
 * @author Gatlin Newhouse
 * @version 2/8/2015
 */
import java.io.*;
import java.util.*;
public class PlaintextScanner
{
    private String filename;
    public int counter;
    public PlaintextScanner(String filename)
    {
        this.filename = filename;
    }
    public ArrayList<String> plaintext() throws IOException
    {
        ArrayList<String> message= new ArrayList<String>();
        Scanner inFile = new Scanner(new File(filename));
        while(inFile.hasNext())
        {
            message.add(inFile.next() + " ");
        }
        inFile.close();
        return message;
    }
    public int[] frequency() throws IOException
    {
        int[] frequencies = new int[26];
        ArrayList<String> plaintext = plaintext();
        for(String a : plaintext)
        {
            for(int i = 0; i < a.length(); i++)
            {
                char letter = Character.toLowerCase(a.charAt(i));
                if(letter >= 'a' && letter <= 'z')
                {
                    frequencies[letter - 'a']++;
                }
            }
        }
        return frequencies;
    }
    public void printFrequencies() throws IOException
    {
        int[] frequencies = frequency();
        int sum = 0;
        for(int i = 0; i < 26; i++)
        {
            sum += frequencies[i];
        }
        PrintWriter writer = new PrintWriter("freq.txt");
        for(int i = 0; i < 26; i++)
        {
            System.out.print("The frequency of (" + (char)('a'+i) + ") is ");
            writer.print("The frequency of (" + (char)('a'+i) + ") is ");
            System.out.printf("%1.2f%%\n", (100 * (frequencies[i] / (double)sum)));
            writer.printf("%1.2f%%\n", (100 * (frequencies[i] / (double)sum)));
        }
        writer.close();
    }
}
