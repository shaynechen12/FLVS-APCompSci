
/**
 * Write a description of class AsciiArt here.
 * 
 * @author Gatlin Newhouse
 * @version 9/18/14
 */
public class AsciiArt
{
    public static void main(String[] args)
    {
        //local variable
        String row1 = "\n  *   ***** ***** *****  ***** ***** ***** *  * *****  *";
        String row2 = "\n * *  *   * *     *      *   * *   * *     * *  *      *";
        String row3 = "\n***** ***** *     *****  ***** *   * *     **   *****  *";
        String row4 = "\n*   * *     *         *  *  *  *   * *     * *      *   ";
        String row5 = "\n*   * *     ***** *****  *   * ***** ***** *  * *****  *";
        
        //print ASCII art
        System.out.print(row1);
        System.out.print(row2);
        System.out.print(row3);
        System.out.print(row4);
        System.out.print(row5);
    }
}
