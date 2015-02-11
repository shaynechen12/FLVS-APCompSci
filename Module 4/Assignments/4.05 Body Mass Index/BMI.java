/**
 * Write a program to calculate Body Mass Index (BMI) given a person’s height and weight. 
 * 
 * @author Gatlin Newhouse
 * @version 10/6/14
 */
import java.util.Scanner;
import java.text.*;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //declaring the scanner so users can interact with the program
        System.out.print("Enter your name (first last): "); //prompt user for their name
        String name = in.nextLine(); //get input from the user for their name
        System.out.print("Enter your weight in pounds (e.g. 175): "); //prompt the user for their weight
        String weightString = in.next(); //get input from the user for their weight
        int weightInt = Integer.parseInt(weightString); //convert the input to an integer
        System.out.print("Enter your height in feet and inches (e.g. 5 11): "); //ask the user for their height
        String feetString = in.next(); //get the user's input for their height (feet)
        String inchesString = in.next(); //get the user's input for their height (inches)
        int height = 12 * (Integer.parseInt(feetString)); //parse the integer for their height and convert to inches
        height += Integer.parseInt(inchesString); //add the inches they entered after parsing
        System.out.println(); //blank line formatting
        System.out.println("Body Mass Index Calculator"); //formatting output
        System.out.println("=========================="); //formatting output
        System.out.println("Name: " + name); //formatting output and personalizing for the user
        double heightInMeters = (double)height * 0.0254; //converting the height to meters and a double
        DecimalFormat df = new DecimalFormat("#.#"); //formatting the decimals to an accuracy of 1/10th
        System.out.println("Height (m): " + df.format(heightInMeters)); //displays the height in meters
        double weight = (double)weightInt * 0.453592; //converting to kgs and to a double
        System.out.println("Weight (kg): " + df.format(weight)); //printing their weight
        double bmi = ((weight) / (((double)heightInMeters) * (double)heightInMeters)); //calculates bmi
        System.out.println("BMI: " + df.format(bmi)); //print bmi
        boolean underweight = bmi<18.5; //setting the underweight range
        boolean normal = bmi>=18.5 && bmi <= 24.9; //setting the normal range
        boolean overweight = bmi >=25.0 && bmi <=29.9; //setting the overweight range
        boolean obese = bmi>=30.0; //setting the obese range
        if (underweight) { //see if they're underweight
            System.out.print("Category: Underweight"); //printing the underweight bmi
        } else if (normal) { //see if they're normal
            System.out.print("Cateogory: Normal"); //printing the normal bmi
        } else if (overweight) { //see if they're overweight
            System.out.print("Category: Overweight"); //printing the overweight range
        } else if (obese) { //see if they're obese
            System.out.print("Category: Obese"); //printing the obese range
        } else { //setting the error statement
            System.err.print("Error: BMI wasn't calculated correctly, check your inputs!"); //notifying the user of errors
        }
        
    }
}
