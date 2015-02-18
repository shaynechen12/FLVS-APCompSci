/**
 * My english homework.
 * 
 * @author Gatlin Newhouse
 * @version 2/16/15
 */
public class MyEnglish extends Homework 
{
    public MyEnglish()
    {
        super();
    }
    public void createAssignment(int p) 
    {
        setPagesRead(p);
        setTypeHomework("English");
    }
    public String toString()
    {
        return getTypeHomework() + "-  must read " + getPagesRead() + " pages.";
    }
}
