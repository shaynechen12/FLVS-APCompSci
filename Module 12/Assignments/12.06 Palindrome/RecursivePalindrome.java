/**
 * Write a description of class RecursivePalindromeTester here.
 * 
 * @author Gatlin Newhouse
 * @version 1/7/2015
 */
import java.util.*;
import java.text.*;
public class RecursivePalindrome
{
    public static boolean isPal(String s)
    {
        String l = helperClass(s);
        if(l.length() == 0 || l.length() == 1)
        {
            // if length =0 OR 1 then it is
            return true; 
        }
        if(l.charAt(0) == l.charAt(l.length()-1))
        {
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return isPal(s.substring(1, s.length()-1));
        }
        // if its not the case than string is not.
        return false;
    }
    public static String helperClass(String s)
    {
        String l = s.toLowerCase();
        l = l.replaceAll("\\W","");
        return l;
    }
}