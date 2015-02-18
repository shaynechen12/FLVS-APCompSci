/**
 * homeworkv2
 * 
 * @author Gatlin Newhouse 
 * @version 2/18/15
 */
public abstract class Homework2 implements Processing
{
    private int pagesRead;
    private String typeHomework;
    public Homework2()
    {
        pagesRead = 0;
        typeHomework = "none";
    }
    public int getPagesRead()
    {
        return pagesRead;
    }
    public void setPagesRead(int pages)
    {
        pagesRead = pages;
    }
    public String getTypeHomework()
    {
        return typeHomework;
    }
    public void setTypeHomework(String type)
    {
        typeHomework = type;
    }
    public abstract void createAssignment(int p);
}
