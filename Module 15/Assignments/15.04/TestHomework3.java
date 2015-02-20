/**
 * run the program
 * 
 * @author Gatlin Newhouse
 * @version 2/20/15
 */
import java.util.*;
import java.io.*;
public class TestHomework3
{
    public static void main(String[] args)
    {
        MyMath3 m = new MyMath3();
        m.createAssignment(4);
        MyScience3 s = new MyScience3();
        s.createAssignment(6);
        MyEnglish3 e = new MyEnglish3();
        e.createAssignment(4);
        MyJava3 j = new MyJava3();
        j.createAssignment(5);
        ArrayList<Homework3> hw = new ArrayList<Homework3>();
        hw.add(m);
        hw.add(s);
        hw.add(e);
        hw.add(j);
        for(Homework3 c : hw)
        {
            System.out.println(c.toString());
        }
        int compare = m.compareTo(e);
        String one = m.getType();
        one = one.toLowerCase();
        String two = e.getType();
        two = two.toLowerCase();
        if(compare == 0)
        {
            System.out.println("The homework for " + one + " and " + two + " are the same number of pages");
        }
        else if(compare == 1)
        {
            System.out.println(m.getType() + " has more work than " + two);
        }
        else
        {
            System.out.println(m.getType() + " has less work than " + two);
        }
    }
}
