public class TrioRunner 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Sandwich bob = new Sandwich("Ham", 5.00);
        System.out.println( bob );
        
        Salad ann = new Salad("Cobb", 2.00);
        System.out.println( ann );
        
        Drink fred = new Drink("Coke", 10.00);
        System.out.println( fred );
        
        //Trio test = new Trio( bob, ann, fred );   //must build Tri before uncommenting this line
        //System.out.println( test );
        
        //test = new Trio( ann, fred, bob );  //boo on this nonsense
         
        //test = new Trio( ann, bob, fred );  //constructor should have 3 menuItems - boo
    }
}
