/**
 * Decrypt a caesar shift
 * 
 * @author Gatlin Newhouse
 * @version 2/1/2015
 */
public class CaesarShiftDecryptionV2
{
    public static String decrypt(String message, int shift)
    {
        String decryptedMessage = "";
		char shiftedChar;
    	if(!(shift > 26) && !(shift < 0))
    	{
    	    for(int i = 0; i < message.length(); i++)
    	    {
    	        char nextChar = message.charAt(i);
    	        if((0 <= (nextChar + shift)) && ('a' + 25 >= (nextChar + shift)))
    	        {
    	            shiftedChar = (char)(nextChar - shift);
    	            decryptedMessage += shiftedChar;
    	        }
    	        else
    	        {
    	            shiftedChar = (char)((nextChar - shift) + 26);
    	            decryptedMessage += shiftedChar;
    	           }
    	    }
    	    return decryptedMessage;
		}
		else
		{
    		System.out.println("Sorry, the number chosen was greater than 26, or less than one!");
    		return "Unable to Decrypt!";
		}
    }
    public static void displayalphabet(int shift)
    {
        final char [] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 
            'v', 'w', 'x', 'y', 'z' };
        for(int n = 0; n < ALPHABET.length; n++)
        {
            int j = n + shift;
            if(j >= 26)
            {
                j -= 26;
            }
            System.out.println(ALPHABET[n] + " " + ALPHABET[j]);
        }
    }
}
