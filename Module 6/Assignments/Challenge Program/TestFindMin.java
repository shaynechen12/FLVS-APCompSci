
/**
 * TestFindMin.
 * 
 * �FLVS 2009
 * @author R. Enger 
 * @version 5/23/2009
 */

public class TestFindMin
{
    public static void main(String[] args)
    {
int[ ] array = new int[3];
int index = 1;
array[index] = index - 1;
index++;
array[index] = array[index - 1] - 1;
array[index - 2] = index % 3; 
int count;
for(count =0; count <= array.length; count++)
{
    System.out.print(array[count] + " ");
}
    }
    
}

