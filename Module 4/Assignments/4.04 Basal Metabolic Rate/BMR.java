/**
 * Write a program to calculate your heart basal metabolic rate or BMR
 * 
 * @author Gatlin Newhouse
 * @version 10/04/14
 */
import java.util.Scanner;
import java.text.*;
public class BMR
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //declare the scanner class so users can input information
        System.out.print("Enter your name: "); //ask user for their name
        String name = in.nextLine(); //let the user input their name
        System.out.print("Gender (M or F): "); //ask the user for their biological sex
        String gender = in.nextLine(); //let the user input their biological sex
        System.out.print("Enter your age: "); //ask tthe user for their age
        String ageString = in.nextLine(); //let the user input their age as a string
        System.out.print("Height in inches: "); //ask the user for their height
        String heightString = in.nextLine(); //let the user input their height as a string
        System.out.print("Weight in pounds: "); //ask the user for their weight
        String weightString = in.nextLine(); //let the user input their weight as a string
        System.out.println(); //place spaces between the input and output
        System.out.println(); //place spaces between the input and output
        //Convert the strings into doubles (for accuracy, since we'll use doubles in the calculation)
        double age = Double.parseDouble(ageString); //converts the age input to a double
        double height = Double.parseDouble(heightString); //converts the height input to a double
        double weight = Double.parseDouble(weightString); //converts the weight input to a double
        //Determine what equation to use
        boolean isMale = gender.equals("M"); //checks to see if they're male and sets a boolean based on the outcome
        boolean isFemale = gender.equals("F"); //checks to see if they're female and sets a boolean based on the outcome
        //converting height to cm and weight to kg
        weight *= 0.453592; //converts pounds to kilograms
        height *= 2.54; //converts inches to centimeters
        DecimalFormat df = new DecimalFormat("#.#");
        //Calculate their basal metabolic rate in the space below
        //I'll be using the Original Harris-Benedict Equation despite the more accurate equations
        //since that is what I was asked to program
        double bMR = 0; //initializes the BMR
        int ageInt = (int)age; //converts double age value to an integer for formatting
        System.out.println("Calculate your Basal Metabolism"); //start printing results
        System.out.println();
        System.out.println("Name: " + name); //print name
        System.out.println("Gender: " + gender); //print gender
        System.out.println("Age: " + ageInt); //print age
        System.out.println("Weight (kg): " + df.format(weight)); //print weight
        System.out.println("Height (cm): " + df.format(height)); //print height
        if (isMale) { //are they male? if so...
            bMR = ((( 13.7516 * weight) / 1) + (( 5.0033 * height) / 1) - (( 6.7550 * age) / 1) + 66.4730); //then calculate their BMR with the male formula
            System.out.println("Basal Metabolic Rate: " + df.format(bMR) + " calories per day."); //tell them their BMR
        } else { //if not then...
            if (isFemale) { //see if they're female...
                bMR = ((( 9.5634 * weight) / 1) + (( 1.8496 * height) / 1) - (( 4.6756 * age) / 1) + 655.0955); //then calculate their BMR with the female formula
                System.out.println("Basal Metabolic Rate: " + df.format(bMR) + " calories per day."); //tell them their BMR
            } else { //if not then...
                System.err.println("You did not choose from availible gender options, try again."); //tell them they messed up their inputs
            }
        }
        
    } //end main
}//end class TargetZone