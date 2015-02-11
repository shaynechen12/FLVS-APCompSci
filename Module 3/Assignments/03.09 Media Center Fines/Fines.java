/**
 * 3.09 Challenge Program
 * Write a program to calculate fines on overdue books for the CSA Media Center. 
 * The output should be in a format that the Media Center Specialist can copy and paste into an email.
 * 
 * @author Gatlin Newhouse 
 * @version 9/25/14
 */
import java.util.Scanner;
public class Fines
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter name (Last, First) and Social Seccurity Number (###-##-####): ");
        String lastName = in.next();
        String firstName = in.nextLine();
        int positionOfSocial = firstName.indexOf('-');
        positionOfSocial += 3;
        int positionSocial = positionOfSocial - 6;
        String socialSecurityNumbers = firstName.substring(positionOfSocial);
        String firstNameThree = firstName.substring(1,4);
        String firstNameEmail = firstName.substring(1, positionSocial);
        int positionOfComma = lastName.indexOf(',');
        String lastNameUser = lastName.substring(0,positionOfComma);
        System.out.println();
        System.out.print("Enter the title of the book: ");
        String titleOfBook = in.nextLine();
        System.out.println();
        System.out.print("Enter the date checked out (mm/dd/yyyy): ");
        String dateCheckedOut = in.nextLine();
        System.out.println();
        String month = dateCheckedOut.substring(0,2);
        String days = dateCheckedOut.substring(3,5);
        String year = dateCheckedOut.substring(6);
        int monthInDays = Integer.parseInt(month);
        int yearInDays = Integer.parseInt(year);
        int daysInDays = Integer.parseInt(days);
        double timeCheckedOut = daysInDays + (yearInDays * 365.25) + (monthInDays * 30.42);
        int daysLate = (int)(timeCheckedOut - 733151.01);
        double dailyFine = 0.12;
        String dailyFinePrint = String.valueOf(dailyFine);
        dailyFinePrint = dailyFinePrint.substring(1);
        double totalFine = dailyFine * daysLate;
        System.out.println("Days late: " + daysLate);
        System.out.println("Daily Fine: " + dailyFinePrint);
        System.out.println();
        System.out.println();
        System.out.println("To: " + lastName + " " + firstNameEmail + "                        " + "Account: " + lastNameUser + firstNameThree + socialSecurityNumbers);
        System.out.println("From: Mona");
        System.out.println("Subject: Overdue Notice");
        System.out.println("==============================================================================");
        System.out.println(titleOfBook + " was checked out on: " + month + "-" + days + "-" + year);
        System.out.println("This book is currently " + daysLate + " days late.");
        System.out.println("Your fine has accumulated to: " + totalFine);
        
    }
}
