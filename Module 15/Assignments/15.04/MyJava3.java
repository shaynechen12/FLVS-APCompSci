/**
 * My java homework
 * 
 * @author Gatlin Newhouse
 * @version 2/20/15
 */
public class MyJava3 extends Homework3
{
    public MyJava3()
    {
        super();
    }
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setType("Java");
    }
    public String toString()
    {
        return getType() + " -  must read " + getPagesRead() + " pages.";
    }
}
