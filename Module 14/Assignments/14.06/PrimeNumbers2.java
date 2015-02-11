/**
 * Finds prime numbers with respect to user limit
 * 
 * @author Gatlin Newhouse 
 * @version 2/3/2015
 */
import java.util.Scanner;
public class PrimeNumbers2 { 
        private int upperLimit;
        public int count;
        public PrimeNumbers2(int upperLimit){
            this.upperLimit = upperLimit;
        }
        public int calculatePrimes(){
            int first, second, primeCheck = 0; 
            for (first = 1; first < this.upperLimit; first++) 
            {
                for (second = 2; second < first; second++) 
                { 
                    primeCheck = first % second; 
                    if (primeCheck == 0)
                    {
                        break;
                    }
                }
                if (first == second)
                { 
                    System.out.println(first); 
                    count++;
                }
            }
            return count;
        }
}

