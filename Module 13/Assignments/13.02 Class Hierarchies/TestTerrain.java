/**
 * Tester class
 * 
 * @author Gatlin Newhouse
 * @version 1/22/15
 */
public class TestTerrain
{
    public static void main(String[] args)
    {
        Forest dunshire = new Forest(100,200,100);
        Mountain rockies = new Mountain(300, 400, 25);
        WinterMountain alps = new WinterMountain(500, 600, 15, 10.0);
        System.out.println("Forest " + dunshire.terrainSize() + " and has " + dunshire.getTrees() + " trees.");
        System.out.println("Mountain " + rockies.terrainSize() + " and has " + rockies.getMountains() + " mountains.");
        System.out.println("Winter Mountain " + alps.terrainSize() + " and has temperature " + alps.getTemp() + " and " + alps.getMountains() + " mountains.");
    }
}
