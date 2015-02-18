/**
 * my ap computer science reading
 * 
 * @author Gatlin Newhouse
 * @version 2/18/15
 */
public class MyJava2 extends Homework2
{
    public MyJava2()
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
        return getTypeHomework() + "- must read " + getPagesRead() + " pages.";
    }
    @Override
    public void doReading()
    {
        System.out.println("Before Reading: ");
        System.out.println(toString());
        System.out.println("After reading:");
        int read = getPagesRead() - 4;
        System.out.println(getTypeHomework() + " - Must Read " + read + " pages.");
    }
}
