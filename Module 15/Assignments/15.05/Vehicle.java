/**
 * Abstract class Vehicle - lays out the vehicle structure
 * 
 * @author Gatlin Newhouse
 * @version 2/21/15
 */
public abstract class Vehicle implements Product
{
    private String name;
    private double cost;
    public Vehicle(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }
    public String getName()
    {
        return name;
    }
    public double getCost()
    {
        return cost;
    }
}
