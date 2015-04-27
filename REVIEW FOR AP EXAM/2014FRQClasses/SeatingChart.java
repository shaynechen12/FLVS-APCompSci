import java.util.List;
import java.util.ArrayList;

public class SeatingChart 
{
	private Student[][] seats;
	
	public SeatingChart( List<Student> studentList, int rows, int cols) 
	{ 
    	   	
	}  
    	
	public int removeAbsentStudents( int allowedAbsences )
	{
		return 0;
	}   
    	
    	//not part of the exam, but helpful to see the students in the grid
    public String toString()
    {
    	String ret = "";
    	for( Student[] row : seats )
    	{
    		for( Student it : row )
    		{
    			if( it == null )
    				ret += String.format("%-9s","null");
    			else
    				ret += it;
    		}
    		ret += "\n";
    	}
    	return ret;
    }
}