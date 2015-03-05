/**
 * Run the student grade program
 * 
 * @author Gatlin Newhouse
 * @version 3/5/2015
 */
import java.util.*;
public class TestStudent
{
    public static void main(String[] args)
    {
        //start original results
        System.out.println("Starting Gradebook:");
        System.out.println();
        ArrayList<Student> myClass = new ArrayList<Student>();
        Student mark = new Student("Mark Kennedy",70,80,90,100,90);
        myClass.add(mark);
        Student max = new Student("Max Gerard",80,85,90,85,80);
        myClass.add(max);
        Student jean = new Student("Jean Smith",50,79,89,99,100);
        myClass.add(jean);
        Student betty = new Student("Betty Farm",85,80,85,88,89);
        myClass.add(betty);
        Student dilbert = new Student("Dilbert Gamma",70,70,90,70,80);
        myClass.add(dilbert);
        printBook(myClass);
        //end of original results
        System.out.println();
        System.out.println("Changing Betty's name to Betty Boop:");
        betty.replaceName("Betty Boop");
        System.out.println();
        //replaced name results
        printBook(myClass);
        //replace quiz results
        System.out.println();
        System.out.println("Changing Jean's quiz 1 score to 80:");
    }
    public static void printBook(ArrayList<Student> classScores)
    {
        System.out.printf("%s %5s %5s %5s %5s %5s \n","Student name","Q1","Q2","Q3","Q4","Q5");
        System.out.println("-------------------------------------------");
        for(Student t : classScores)
        {
            t.toString();
        }
    }
}
