/**
 * Candidate interface.
 * 
 * @author Gatlin Newhouse
 * @version 2/27/2015
 */
public class Candidate4
{
    private String name;
    private int numVotes;
    public Candidate4(String name, int numVotes){
        this.name = name;
        this.numVotes = numVotes;
    }
    public String getName(){
        return name;
    }
    public int getVotes(){
        return numVotes;
    }
    public String toString(){
        return getName() + " received " + getVotes() + " votes.";
    }
    public void replaceName(String n){ //overloaded to set your own name to replace
        name = n;
    }
    public void replaceVotes(int v){ //overloaded, change it to a certain number)
        numVotes = v;
    }
}
