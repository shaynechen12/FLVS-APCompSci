/**
 * my english homework
 * 
 * @author Gatlin Newhouse
 * @version 2/20/15
 */
public class MyEnglish3 extends Homework3
{
    public MyEnglish3()
    {
        super();
    }
    public void createAssignment(int p) 
    {
        setPagesRead(p);
        setType("English");
    }
    public String toString()
    {
        return getType() + " -  must read " + getPagesRead() + " pages.";
    }
}
