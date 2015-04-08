/**
 * Student data interface
 * 
 * @author Gatlin Newhouse
 * @version 4/6/2015
 */
public class StudentData
{
    private String firstName;
    private String lastName;
    private double[] testScores;
    private char grade;
    public StudentData(String first, String last, double[] scores)
    {
        if(!first.isEmpty())
        {
            firstName = first;
        }
        if(!last.isEmpty())
        {
            lastName = last;
        }
        double[] testScores = scores;
        char grade = courseGrade(scores);
    }
    public String getName()
    {
        return firstName;
    }
    public String getLast()
    {
        return lastName;
    }
    public double[] getScores()
    {
        return testScores;
    }
    public char getGrade()
    {
        return grade;
    }
    public String scoresString(double[] scores)
    {
        String a = "";
        for(int i = 0; i < scores.length; i++)
        {
            a += scores[i] + "  ";
        }
        return a;
    }
    public String toString(double[] scores)
    {
        String a = getName() + " " + getLast() + "     " + scoresString(scores) + "  " + getGrade();
        return a;
    }
    public char courseGrade(double[] list)
    {
        if(list.length == 0)
        {
            throw new IllegalArgumentException("Grade list can not be empty");
        }
        double average = 0;
        for(int i = 0; i < list.length; i++)
        {
            average += list[i];
        }
        double gradenumber = average / (list.length);
        if(gradenumber >= 90.0)
        {
            return 1;
        }
        else if (gradenumber < 90.0 && gradenumber >= 80.0)
        {
            return 2;
        }
        else if (gradenumber < 80.0 && gradenumber >= 70.0)
        {
            return 3;
        }
        else if (gradenumber < 70.0 && gradenumber >= 60.0)
        {
            return 4;
        }
        else
        {
            return 6;
        }
    }
}
