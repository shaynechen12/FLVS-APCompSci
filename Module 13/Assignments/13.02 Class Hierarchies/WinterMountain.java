/**
 * WinterMountain
 * 
 * @author Gatlin Newhouse
 * @version 1/22/15
 */
public class WinterMountain extends Mountain
{
    private double temperature;
    public WinterMountain(int l, int w, int m, double t)
    {
        super(l,w,m);
        temperature = t;
    }
    public double getTemp()
    {
        return temperature;
    }
}
