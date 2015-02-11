/**
 * Runs PlaintextScanner class
 * 
 * @author Gatlin Newhouse
 * @version 2/8/2015
 */
import java.io.*;
public class PlaintextScannerTester
{
    public static void main (String[] args) throws IOException
    {
        PlaintextScanner filename = new PlaintextScanner("ciphertext.txt");
        filename.printFrequencies();
    }
}
