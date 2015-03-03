/**
 * Write a description of class TestCandidate5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCandidate5
{
    public static void main(String[] args)
    {
        int sum = 0;
        int counter = 0;
        Candidate3 john = new Candidate3("John Smith", 5000);
        Candidate3 mary = new Candidate3("Mary Miller", 4000);
        Candidate3 michael = new Candidate3("Michael Duffy", 6000);
        Candidate3 tim = new Candidate3("Tim Robinson", 2500);
        Candidate3 joe = new Candidate3("Joe Ashtony", 1800);
        Candidate3 mickey = new Candidate3("Mickey Jones", 3000);
        Candidate3 rebecca = new Candidate3("Rebecca Morgan", 2000);
        Candidate3 kathleen = new Candidate3("Kathleen Turner", 8000);
        Candidate3 tory = new Candidate3("Tory Parker", 500);
        Candidate3 ashton = new Candidate3("Ashton Davis", 10000);
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
