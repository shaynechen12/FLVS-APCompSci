/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in); 
		String userAge = in.next(); 
		int ageInYears = Integer.parseInt(userAge); 
		double approxAgeInDays = ageInYears * 365.25;
	}
}