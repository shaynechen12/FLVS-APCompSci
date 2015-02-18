/**
 * My AP Computer Science homework
 * 
 * @author Gatlin Newhouse 
 * @version 2/16/15
 */
public class MyJava extends Homework 
{
    public MyJava()
    {
        super();
    }
    public void createAssignment(int p) 
    {
        setPagesRead(p);
        setTypeHomework("Java");
    }
    public String toString()
    {
        return getTypeHomework() + "-  must read " + getPagesRead() + " pages.";
    }
}
