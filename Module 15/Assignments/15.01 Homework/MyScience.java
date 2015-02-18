/**
 * My science homework
 * 
 * @author Gatlin Newhouse
 * @version 2/16/15
 */
public class MyScience extends Homework 
{
    public MyScience()
    {
        super();
    }
    public void createAssignment(int p) 
    {
        setPagesRead(p);
        setTypeHomework("Science");
    }
    public String toString()
    {
        return getTypeHomework() + "-  must read " + getPagesRead() + " pages.";
    }
}