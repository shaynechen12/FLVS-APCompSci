/**
 * Program to calculate the Total Daily Energy Expenditure
 *
 * @Gatlin Newhouse
 * @10-11-2014
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input: Gather information from user
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR:" );
        double basalMR = in.nextDouble();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        System.out.println();
        // Activity Level Menu
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        System.out.println();
        //Processing:
        // Activity Factor
        double activityFactor = 0;
        //Find out which activity factor value the person needs
        if(choice.equalsIgnoreCase("A")) { //if they primarily rest then set their activity factor to the correct value
            activityFactor = 1.0;
        } else if(choice.equalsIgnoreCase("B")) { //if they're primarily sedentary then set their activity factor to the correct value
            activityFactor = 1.3;
        } else if((gender.equalsIgnoreCase("M") && choice.equalsIgnoreCase("C")) || (gender.equalsIgnoreCase("F") && choice.equalsIgnoreCase("D"))) { //if they're male and they lightly exercise or if they're female and they moderately exercise then set their activity level to the correct value
            activityFactor = 1.6;
        } else if(gender.equalsIgnoreCase("F") && choice.equalsIgnoreCase("C")) { //if they're female and they lightly exercise then set their activity factor to the correct value
            activityFactor = 1.5;
        } else if(gender.equalsIgnoreCase("M") && choice.equalsIgnoreCase("D")) { //if they're male and exercise moderaely set the value
            activityFactor = 1.7;
        } else if(gender.equalsIgnoreCase("M") && choice.equalsIgnoreCase("E")) { //if they're male and exercise very actively set the value
            activityFactor = 2.1;
        } else if(gender.equalsIgnoreCase("F") && choice.equalsIgnoreCase("E")) { //if they're female and exercise very actively set the value
            activityFactor = 1.9;
        } else if(gender.equalsIgnoreCase("M") && choice.equalsIgnoreCase("F")) { //if they're male and they're extremely active set the correct value
            activityFactor = 2.4;
        } else if(gender.equalsIgnoreCase("F") && choice.equalsIgnoreCase("F")) { //if they're female and they're extremely active set the correct value
            activityFactor = 2.2;
        } else {
            System.out.println("Your choice is incorrect, please look at your inputs again! :)"); //notify the user of any errors
        }
        // Calculate TDEE
        double tDEE = basalMR * activityFactor;
        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");

    }
}

