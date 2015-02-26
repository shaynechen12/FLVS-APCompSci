
/**
 * I got the arraylist and non arraylist programs mixed up. This program is the non arrylist tester, the TestCandidate class is the 
 * arraylist tester.
 * 
 * @author Gatlin Newhouse 
 * @version 2/26/2015
 */
public class TestCandidate2
{
    public static void main(String[] args)
    {
        int sum = 0;
        int counter = 0;
        Candidate john = new Candidate("John Smith", 5000);
        Candidate mary = new Candidate("Mary Miller", 4000);
        Candidate micheal = new Candidate("Micheal Duffy", 6000);
        Candidate tim = new Candidate("Tim Robinson", 2500);
        Candidate joe = new Candidate("Joe Ashtony", 1800);
        System.out.println("Results Per Candidate:");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println(john.toString());
        sum += john.getVotes();
        System.out.println(mary.toString());
        sum += mary.getVotes();
        System.out.println(micheal.toString());
        sum += micheal.getVotes();
        System.out.println(tim.toString());
        sum += tim.getVotes();
        System.out.println(joe.toString());
        sum += joe.getVotes();
        System.out.println();
        System.out.println("Candidate               Votes Received                      % of Total Votes");
        System.out.printf("%15s                %5d                         %2f\n", 
        john.getName(), john.getVotes(), ((double)john.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        mary.getName(), mary.getVotes(), ((double)mary.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        micheal.getName(), micheal.getVotes(), ((double)micheal.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        tim.getName(), tim.getVotes(), ((double)tim.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        joe.getName(), joe.getVotes(), ((double)joe.getVotes() / sum) * 100);
        int totalVotes = john.getVotes() + mary.getVotes() + micheal.getVotes() + tim.getVotes() + joe.getVotes();
        System.out.println();
        System.out.println("Total number of votes in election: " + totalVotes);
    }  
}
