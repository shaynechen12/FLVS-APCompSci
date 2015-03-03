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
        Candidate2 michael = new Candidate2("Michael Duffy", 6000);
        Candidate2 tim = new Candidate2("Tim Robinson", 2500);
        Candidate2 joe = new Candidate2("Joe Ashtony", 1800);
        Candidate2 mickey = new Candidate2("Mickey Jones", 3000);
        Candidate2 rebecca = new Candidate2("Rebecca Morgan", 2000);
        Candidate2 kathleen = new Candidate2("Kathleen Turner", 8000);
        Candidate2 tory = new Candidate2("Tory Parker", 500);
        Candidate2 ashton = new Candidate2("Ashton Davis", 10000);
        //original votes START
        System.out.println("Original Results:");
        System.out.println();
        System.out.println(john.toString());
        sum += john.getVotes();
        System.out.println(mary.toString());
        sum += mary.getVotes();
        System.out.println(michael.toString());
        sum += michael.getVotes();
        System.out.println(tim.toString());
        sum += tim.getVotes();
        System.out.println(joe.toString());
        sum += joe.getVotes();
        System.out.println(mickey.toString());
        sum += mickey.getVotes();
        System.out.println(rebecca.toString());
        sum += rebecca.getVotes();
        System.out.println(kathleen.toString());
        sum += kathleen.getVotes();
        System.out.println(tory.toString());
        sum += tory.getVotes();
        System.out.println(ashton.toString());
        sum += ashton.getVotes();
        System.out.println();
        System.out.println("Candidate               Votes Received                      % of Total Votes");
        System.out.printf("%15s                %5d                         %2f\n", 
        john.getName(), john.getVotes(), ((double)john.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        mary.getName(), mary.getVotes(), ((double)mary.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        michael.getName(), michael.getVotes(), ((double)michael.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        tim.getName(), tim.getVotes(), ((double)tim.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        joe.getName(), joe.getVotes(), ((double)joe.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        mickey.getName(), mickey.getVotes(), ((double)mickey.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        rebecca.getName(), rebecca.getVotes(), ((double)rebecca.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        kathleen.getName(), kathleen.getVotes(), ((double)kathleen.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        tory.getName(), tory.getVotes(), ((double)tory.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        ashton.getName(), ashton.getVotes(), ((double)ashton.getVotes() / sum) * 100);
        System.out.println();
        System.out.println("Total number of votes in election: " + sum);
        //original votes END
        System.out.println();
        michael.replaceName("John Elmos");
        mickey.replaceVotes(2500);
        kathleen.replaceName("John Kennedy");
        kathleen.replaceVotes(8500);
        sum = 0;
        //new votes START
        System.out.println("Replacing Michael Duffy with John Elmos:");
        System.out.println();
        System.out.println(john.toString());
        sum += john.getVotes();
        System.out.println(mary.toString());
        sum += mary.getVotes();
        System.out.println(michael.toString());
        sum += michael.getVotes();
        System.out.println(tim.toString());
        sum += tim.getVotes();
        System.out.println(joe.toString());
        sum += joe.getVotes();
        System.out.println(mickey.toString());
        sum += mickey.getVotes();
        System.out.println(rebecca.toString());
        sum += rebecca.getVotes();
        System.out.println(kathleen.toString());
        sum += kathleen.getVotes();
        System.out.println(tory.toString());
        sum += tory.getVotes();
        System.out.println(ashton.toString());
        sum += ashton.getVotes();
        System.out.println();
        System.out.println("Candidate               Votes Received                      % of Total Votes");
        System.out.printf("%15s                %5d                         %2f\n", 
        john.getName(), john.getVotes(), ((double)john.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        mary.getName(), mary.getVotes(), ((double)mary.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        michael.getName(), michael.getVotes(), ((double)michael.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        tim.getName(), tim.getVotes(), ((double)tim.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        joe.getName(), joe.getVotes(), ((double)joe.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        mickey.getName(), mickey.getVotes(), ((double)mickey.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        rebecca.getName(), rebecca.getVotes(), ((double)rebecca.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        kathleen.getName(), kathleen.getVotes(), ((double)kathleen.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        tory.getName(), tory.getVotes(), ((double)tory.getVotes() / sum) * 100);
        System.out.printf("%15s                %5d                         %2f\n", 
        ashton.getName(), ashton.getVotes(), ((double)ashton.getVotes() / sum) * 100);
        System.out.println();
        System.out.println("Total number of votes in election: " + sum);
        //new votes END
    }  
}
