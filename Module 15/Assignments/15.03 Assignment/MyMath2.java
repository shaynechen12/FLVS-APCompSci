/**
 * my math reading
 * 
 * @author Gatlin Newhouse
 * @version 2/18/15
 */
public class MyMath2 extends Homework2
{
    public MyMath2()
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
    @Override
    public void doReading()
    {
        System.out.println("Before Reading: ");
        System.out.println(toString());
        System.out.println("After reading:");
        int read = getPagesRead() - 2;
        System.out.println(getTypeHomework() + " - Must Read " + read + " pages.");
    }
}
