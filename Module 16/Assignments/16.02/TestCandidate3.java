/**
 * runs the program
 * 
 * @author Gatlin Newhouse 
 * @version 2/27/2015
 */
public class TestCandidate3
{
    public static void main(String[] args)
    {
        int sum = 0;
        int counter = 0;
        Candidate2 john = new Candidate2("John Smith", 5000);
        Candidate2 mary = new Candidate2("Mary Miller", 4000);
        Candidate2 micheal = new Candidate2("Micheal Duffy", 6000);
        Candidate2 tim = new Candidate2("Tim Robinson", 2500);
        Candidate2 joe = new Candidate2("Joe Ashtony", 1800);
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
