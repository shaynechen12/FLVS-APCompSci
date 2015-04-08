/**
 * the dispenser
 * 
 * @author Gatlin Newhouse 
 * @version 4/6/2015
 */
public class Dispenser
{
    private int numberOfItem;
    private int cost;
    public Dispenser()
    {
        numberOfItem = 50;
        cost = 50;
    }
    public int getCount()
    {
        return numberOfItem;
    }
    public int getProductCost()
    {
        return cost;
    }
    public void makeSale()
    {
        numberOfItem--;
    }
}
