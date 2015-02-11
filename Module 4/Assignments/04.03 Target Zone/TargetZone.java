/**
 * Description for 4.03 Target Zone project
 * 
 * @author Gatlin Newhouse
 * @version 10/02/14
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        //Initialize and declare variables
        String target = "within";
        Scanner in = new Scanner(System.in);
        
        //Prompt user for input
        System.out.println("Please take your heart rate right after you wake up.");
        System.out.println("If you need help finding your heart rate go to http://goo.gl/Sx4fuA");
        System.out.println();
        System.out.println("What is your heart rate?");
        String restingHeartRateString = in.nextLine();
        System.out.println();
        System.out.println("What is your age?");
        String ageString = in.nextLine();
        int restingHeartRate = Integer.parseInt(restingHeartRateString);
        int age = Integer.parseInt(ageString);
        //Calculate heart rate target zone min and max
        int maximumHeartRate = 220 - age;
        int heartRateReserve = maximumHeartRate - restingHeartRate;
        double upperEnd = (heartRateReserve * .85) + restingHeartRate;
        double lowerEnd = (heartRateReserve * .50) + restingHeartRate;        
        //Determine if heart rate after exercise is between the min and max
        System.out.println();
        System.out.println("What is your heart rate shortly after exercising?");
        String exercisingHeartRateString = in.nextLine();
        int exercisingHeartRate = Integer.parseInt(exercisingHeartRateString);
        boolean isAbove = exercisingHeartRate > upperEnd;
        boolean isBelow = exercisingHeartRate < lowerEnd;
        //If the heart rate is below, change the value of target to "below".
        if(isBelow)
          target = "below";      
       //If the heart rate is above, change the value of target to "above".
       if(isAbove)
         target = "above"; 
        //Print two output statements
        //The first stating the heart rate target zone
        System.out.println("Your training zone is between " + lowerEnd + " and " + upperEnd + ".");       
        //The second stating if the heart rate after exercise  was within, above or below
        //the target zone. The variable "target" will have a value of within, above or below
        System.out.println("Your heart rate after exercise was " + target + " your training zone.");       
    } //end main
}//end class TargetZone