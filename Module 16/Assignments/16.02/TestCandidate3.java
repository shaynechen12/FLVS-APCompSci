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
        Candidate2[] candidates = new Candidate2[] {john, mary, michael, tim, joe, mickey, rebecca, kathleen, tory, ashton};
        //original votes START
        System.out.println("Original Results:");
        System.out.println();
        for(int i = 0; i < candidates.length; i++)
        {
            System.out.println(candidates[i].toString());
            sum += candidates[i].getVotes();
        }
        System.out.println();
        System.out.println("Candidate               Votes Received                      % of Total Votes");
        for(int i = 0; i < candidates.length; i++)
        {
            System.out.printf("%15s                %5d                         %2f\n", 
            candidates[i].getName(), candidates[i].getVotes(), ((double)candidates[i].getVotes() / sum) * 100);
        }
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
        for(int i = 0; i < candidates.length; i++)
        {
            System.out.println(candidates[i].toString());
            sum += candidates[i].getVotes();
        }
        System.out.println();
        System.out.println("Candidate               Votes Received                      % of Total Votes");
        for(int i = 0; i < candidates.length; i++)
        {
            System.out.printf("%15s                %5d                         %2f\n", 
            candidates[i].getName(), candidates[i].getVotes(), ((double)candidates[i].getVotes() / sum) * 100);
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + sum);
        //new votes END
    }  
}
