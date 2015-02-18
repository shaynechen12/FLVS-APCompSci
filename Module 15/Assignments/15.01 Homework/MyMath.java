/**
 * My math homework
 * 
 * @author Gatlin Newhouse
 * @version 2/16/15
 */
public class MyMath extends Homework
{
    public MyMath()
    {
        super();
    }
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Math");
    }
    public String toString()
    {
        return getTypeHomework() + "- must read " + getPagesRead() + " pages.";
    }
}
