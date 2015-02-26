/**
 * Candidate data
 * 
 * @author Gatlin Newhouse
 * @version 2/26/2015
 */
public class Candidate
{
    public String name;
    private int votes;
    public Candidate(String name, int votes)
    {
        this.name = name;
        this.votes = votes;
    }
    public String getName()
    {
        return name;
    }
    public int getVotes()
    {
        return votes;
    }
    public String toString()
    {
        return getName() + " received " + getVotes() + " votes.";
    }
}
