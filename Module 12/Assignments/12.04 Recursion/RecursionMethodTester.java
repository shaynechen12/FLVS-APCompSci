/**
 * This class does recursive methods
 * 
 * @author Gatlin Newhouse
 * @version 01/05/15
 */

class RecursiveMethods
{
    RecursiveMethods()          //default constructor
    {
    }
    public int fOf(int x)
    {
        if (x <= 10)                        //the base case
        {
            System.out.println(x + " <= 10, therefore ... f(" + x + ") = -7");
            return -7;
        }
        else
        {
            System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 3) + 2 = f(" + (x -3) + ") + 2");
            return fOf(x-3) + 2;
        }
    }  
    public int f1f(int x)
    {
        if (x <= 25)
        {
            System.out.println(x + " <= 25, therefore ... f(" + x + ") = 20");
            return 20;
        }
        else
        {
            System.out.println(x + "> 25, therefore ... f(" + x + ") = f(" + x + "/12 + 5) - 3 = f(" + (x/12 + 5) + ") -3");
            return f1f(x/12 +5) - 3;
        }
    }
    public int f2f(int x)
    {
        if(x > 20)
        {
            System.out.println(x + "> 20, therefore ... f(" + x + ") = -100");
            return -100;
        }
        else
        {
            System.out.println(x + "<= 20, therefore ... f(" + x + "* 2) - 4 = f(" + (x*2) + ") - 4");
            return f2f(x*2) - 4;
        }
    }
}
public class RecursionMethodTester
{
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();       
        x = 25;
        System.out.println("1:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
        x = 30;
        System.out.println("2:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.f1f(x));
        System.out.println();
        x = 500;
        System.out.println("4:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.f2f(x));
        System.out.println();  
    }
}