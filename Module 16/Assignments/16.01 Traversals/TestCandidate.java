/**
 * prints
 * 
 * @author Gatlin Newhouse
 * @version 2/26/2015
 */
import java.util.*;
public class TestCandidate
{
    public static void main(String[] args)
    {
        int sum = 0;
        int counter = 0;
        ArrayList<Candidate> c = new ArrayList<Candidate>();
        Candidate john = new Candidate("John Smith", 5000);
        c.add(john);
        Candidate mary = new Candidate("Mary Miller", 4000);
        c.add(mary);
        Candidate micheal = new Candidate("Micheal Duffy", 6000);
        c.add(micheal);
        Candidate tim = new Candidate("Tim Robinson", 2500);
        c.add(tim);
        Candidate joe = new Candidate("Joe Ashtony", 1800);
        c.add(joe);
        System.out.println("Results Per Candidate:");
        System.out.println("-----------------------------------");
        System.out.println();
        for(Candidate t : c)
        {
            System.out.println(t.toString());
            sum += t.getVotes();
            counter++;
        }
        System.out.println();
        System.out.println("Candidate               Votes Received                      % of Total Votes");
        int totalVotes = 0;
        for(Candidate t : c)
        {
            System.out.printf("%15s                %5d                         %2f\n", 
            t.getName(), t.getVotes(), ((double)t.getVotes() / sum) * 100);
            totalVotes += t.getVotes();
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + totalVotes);
    }  
}
