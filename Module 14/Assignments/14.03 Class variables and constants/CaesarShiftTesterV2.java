/**
 * Run the program
 * 
 * @author Gatlin Newhouse
 * @version 2/1/2015
 */
import java.util.*;
public class CaesarShiftTesterV2
{
    public static boolean running = true;
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		while(running == true)
		{
		    System.out.println("Press 1 to Encrypt, 2 to Decrypt, or 3 to quit.");
		    int input = Integer.valueOf(in.nextLine());
		    if(input == 3)
		    {
		        break;
		    }
		    if(input == 1)
		    {
		        System.out.println("Enter your message: ");
				String message = in.nextLine();
				System.out.println("Enter the amount of characters you want to shift by (1-26): ");
				int shift = Integer.valueOf(in.nextLine());
				CaesarShiftEncryptionV2.displayalphabet(shift);
				String encryptedMessage = CaesarShiftEncryptionV2.encrypt(message, shift);
				System.out.println("Your Encrypted Message is: " + encryptedMessage);
				tryAgain();
		    }
		    else if(input == 2)
		    {
		        System.out.println("Enter your encrypted message: ");
		        String message = in.nextLine();
		        System.out.println("Enter the amount of characters the encrypted string is shifted by (1-26): ");
		        int shift = Integer.valueOf(in.nextLine());
		        CaesarShiftDecryptionV2.displayalphabet(shift);
		        String encryptedMessage = CaesarShiftDecryptionV2.decrypt(message, shift);
		        System.out.println("Your Decrypted Message is: " + encryptedMessage);
		        tryAgain();
            }
            else
            {
                System.out.println("Your input is invalid! Please try again!");
            }
	   }
	}
	public static void tryAgain(){
		System.out.println("Would you like to do anything else? \"Y\" or \"N\"");
		String input = in.nextLine();
		if(input.equalsIgnoreCase("y"))
		{
			running = true;
		}
		else
		{
			running = false;
		}
	}
}
