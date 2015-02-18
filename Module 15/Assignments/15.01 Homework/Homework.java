/**
 * The abstract homework class
 * 
 * @author Gatlin Newhouse
 * @version 2/16/14
 */
public abstract class Homework
{
    private int pagesRead;
    private String typeHomework;
    public Homework()
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
