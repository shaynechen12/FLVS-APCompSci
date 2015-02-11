
/**
 * Prints.
 * 
 * @author Gatlin Newhouse
 * @version 1/23/2015
 */
public class testNew
{
    public static void main(String[] args)
    {
        Rectangle3 r1 = new Rectangle3(5, 10);
        Box3 b1 = new Box3(4, 4, 4);
        Box3 b2 = new Box3(4, 10, 5);
        Cube3 c1 = new Cube3(4);
        
        showEffectBoth(r1);
        showEffectBoth(b1);
        showEffectBoth(b2);
        showEffectBoth(c1);
        //Checks Rectangle1 with Box2.
        System.out.print(b1.toString());
        if (b1.equals(c1)){
            System.out.print(" is same size as ");
        }
        else{
            System.out.print(" is not the same size as ");
        }
        System.out.print(c1.toString());
        System.out.print("\n");
        
        //Checks Cube1 with Box1.
        System.out.print(b2.toString());
        if (b2.equals(c1)){
            System.out.print(" is same size as ");
        }
        else{
            System.out.print(" is not the same size as ");
        }
        System.out.print(c1.toString());
    }


    private static void showEffectBoth(Rectangle3 o)
    {
        System.out.println(o);
        //System.out.println( "Rectangle: " + o  + o.getLength() + " x " + o.getWidth());
    }
}

