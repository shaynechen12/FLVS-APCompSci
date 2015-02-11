/**
 * Write a program to simulate the male to female ratio of a country of your choice.
 * I chose Switzerland since it's my heritage.
 * 
 * @author Gatlin Newhouse 
 * @version 10/18/14
 */
import java.util.Scanner;
public class PopulationRatio
{
	public static void main(String[] args)
	{
	    int men = 0;
	    int women = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("How people live in Switzerland? ");
	    int people = in.nextInt();
	    
	    while(counter <= people)
	    {
	        randNum = Math.random();
	        System.out.print(counter + "\t" + randNum);
	        
	        if(randNum < .4928)
	        {
	            men++;
	            System.out.println("\t man");
	        }
	        else
	        {
	            women++;
	            System.out.println("\t woman");
	           }
	        counter++;      
	    }
	    System.out.println();
	    System.out.println("Number of men = " + men);
	    System.out.println("Number of women = " + women);
	    
	    
	    
	}
}
