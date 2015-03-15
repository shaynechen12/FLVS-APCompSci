/**
 * Movie Interface
 * 
 * @author Gatlin Newhouse
 * @version 3/15/15
 */
public class Movie3
{
    private String title;
    private int year;
    private String studio;
    public Movie3(String title, int year, String studio)
    {
        this.title = title;
        this.year = year;
        this.studio = studio;
    }
    public String toString()
    {
        String string = title + ", " + year + ", " + studio;
        return string;
    }
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    public String getStudio()
    {
        return studio;
    }
    public void setStudio(String a)
    {
        studio = a;
    }
}
