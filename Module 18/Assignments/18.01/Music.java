/**
 * Music interface 
 * 
 * 
 * author Gatlin Newhouse 
 * version 3/24/15
 */
public class Music
{
	// instance variables 
	private String title;
	private int year;
	private String singer;
	/**
	 * Constructor for objects of class Music
	 */
	public Music(String t, int l, String p)
	{
		// initialise instance variables
		title = t;
		year = l;
		singer = p;
	}
	public void settitle(String t)
	{
	    title = t;
	}
	public String gettitle()
	{
	    return title;
	}
	public void setyear(int l)
	{
	    year = l;
	}
	public int getyear()
	{
	    return year;
	}
	public void setsinger(String p)
	{
	    singer = p;
	}
	public String getsinger()
	{
	    return singer;
	}
	public String toString()
	{
	    return String.format("%-18s", title) + "\t" + String.format("%-10s", year) +
	           "\t" + String.format("%-15s", singer);
	}
}