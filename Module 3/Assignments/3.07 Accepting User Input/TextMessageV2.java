/**
 * 3.07 Accepting User Input
 * Write a program to replace at least five phrases in 
 * a message with standard cell phone text abbreviations. 
 * And takes a user input for the original message.
 * 
 * @author Gatlin Newhouse
 * @version 9-22-2014
 */
import java.util.Scanner;
public class TextMessageV2
{
   public static void main(String[] args)
   {
       //Original String
       System.out.println("What is the Original Message? Be sure to include the phrase \"be right back\" or you'll break my program :("); //section title
       Scanner in = new Scanner(System.in);
       String originalMessage = in.nextLine();
       System.out.println("You said the original message is: " + "\"" + originalMessage + "\""); //print original message
       int originalMessageLength = originalMessage.length(); //grab the length of the original meesage
       System.out.println("message length: " + originalMessageLength); //print the length of the original message
       System.out.println(); //blank line
       
       //replace original message with text lingo
       String newMessage = originalMessage.replace("i don't know", "404"); //replacing phrases with text lingo and initializing the new message string
       newMessage = newMessage.replace("be right back", "BRB"); //replacing phrases with text lingo
       newMessage = newMessage.replace("laughing out loud", "LOL"); //replacing phrases with text lingo
       newMessage = newMessage.replace("because", "b/c"); //replacing phrases with text lingo
       newMessage = newMessage.replace("have to go", "GTG"); //replacing phrases with text lingo
       newMessage = newMessage.replace("with", "w/"); //replacing phrases with text lingo
       System.out.println("New Message:"); //section title
       System.out.println(newMessage); // print the new message
       int newMessageLength = newMessage.length(); //grab the length of the new message
       System.out.println("message length: " + newMessageLength); //print the length of the new message
       System.out.println(); //blank line
       
       //String Method Samples
       System.out.println("String method samples:"); //section title
       int positionOfB = newMessage.indexOf('B'); //position of the first B
       System.out.println("indexOf \"B\": " + positionOfB); //prints the position of the first B
       String substring1 = newMessage.substring(0, positionOfB); //creates a substring from the first character to the B
       System.out.println("substring (two parameters) first half: " + substring1); //prints the first substring
       String substring2 = newMessage.substring(positionOfB); //creates a new substring from B to the end
       System.out.println("substring (one parameter) last half: " + substring2); //prints the second substring
       String replaceMessage = "L", regex = "l"; //replace any l for L
       replaceMessage = newMessage.replaceAll(regex, replaceMessage);
       System.out.println("replaceAll ls with Ls: " + replaceMessage);
    }
}

