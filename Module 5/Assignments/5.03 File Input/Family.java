/**
 * Write a program to calculate the probability that a family with two children 
will consist of two boys, a boy and a girl, or two girls. 
 * 
 * @author Gatlin Newhouse
 * @version 10/19/2014
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.*;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        int sampleSize = 0;
        int allBoys = 0;
        int allGirls = 0;
        int boyAndGirl = 0;
        int counter = 0;
        float probabilityOfAllBoys = 0;
        float probabilityOfAllGirls = 0;
        float probabilityOfBoyAndGirl = 0;
        String token = "";
        Scanner inFile = new Scanner(new FileReader("MaleFemaleInFamily.txt"));
        while (inFile.hasNext())
        {
            token = inFile.next();
            if (token.equals("BB"))
            {
                allBoys ++;
                counter ++;
            } else if (token.equals("GG"))
            {
                allGirls ++;
                counter ++;
            } else if (token.equals("BG"))
            {
                boyAndGirl ++;
                counter ++;
            } else if (token.equals("GB"))
            {
                boyAndGirl ++;
                counter ++;
            }
            sampleSize = counter;
        }
        inFile.close();
        DecimalFormat df = new DecimalFormat("#.##");
        probabilityOfAllBoys = ((float)allBoys / (float)sampleSize) * 100;
        probabilityOfAllGirls = ((float)allGirls / (float)sampleSize) * 100;
        probabilityOfBoyAndGirl = ((float)boyAndGirl / (float)sampleSize) * 100;
        System.out.println("Sample Size: " + sampleSize);
        System.out.println("Two Boys: " + df.format(probabilityOfAllBoys) + "%");
        System.out.println("One Boy One Girl: " + df.format(probabilityOfBoyAndGirl) + "%");
        System.out.println("Two Girls: " + df.format(probabilityOfAllGirls) + "%");
    }
}