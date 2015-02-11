/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals. Using the int command, and double command now.
 * 
 * @author Gatlin Newhouse
 * @version 2014-09-11
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        int iNUM1 = 25;
        int iNUM2 = 9;
        int iNUM3 = 16;
        int iNUM4 = 25;
        double dNUM1 = 43.21;
        double dNUM2 = 3.14;
        double dNUM3 = 5.0;
        // Addition
        System.out.println("Addition");
        System.out.print( iNUM1 + " plus " + iNUM2 + " equals ");
        System.out.println(iNUM1+iNUM2);
        System.out.print(dNUM1 + " plus " + dNUM2 + " plus " + dNUM3 + " equals ");
        System.out.println(dNUM1+dNUM2+dNUM3);
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNUM3 + " minus " + iNUM2 + " minus " + iNUM4 + " equals ");
        System.out.println(iNUM3-iNUM2-iNUM4);
        System.out.print(dNUM2 + " minus " + dNUM3 + " equals ");
        System.out.println(dNUM2-dNUM3);
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNUM1 + " times " + iNUM2 + " equals ");
        System.out.println(iNUM1*iNUM2);
        System.out.print(dNUM2 + " times " + dNUM3 + " times " + dNUM3 + " equals ");
        System.out.println(dNUM2*dNUM3*dNUM3);
        
        // Division
        System.out.println("Division");
        System.out.print(iNUM2 +" divided by " + iNUM1 + " equals ");
        System.out.println(iNUM2/iNUM1);
        System.out.print(dNUM1 + " divided by " + dNUM3 + " equals ");
        System.out.println(dNUM1/dNUM2);
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNUM3 + " modulus " + iNUM2 + " equals ");
        System.out.println(iNUM3%iNUM2);
        System.out.print(dNUM3 + " modulus " + dNUM2 + " equals");
        System.out.println(dNUM3%dNUM2);
        
        // 2.02 Lab Equations
        System.out.println("2.02 Lab Equations");
        int iNUM7 = 15;
        int iNUM8 = -2;
        int iNUM9 = 10;
        int iNUM10 = 5;
        double dNUM8 = 2.5;
        System.out.print(iNUM7 + " divided by " + dNUM8 + " times " + iNUM8 + " plus " + iNUM9 + " over " + iNUM10 + " equals ");
        System.out.println(iNUM7/dNUM8*iNUM8+(iNUM9/iNUM10));
        System.out.println();
        int iNUM11 = 234;
        int iNUM12 = 6;
        int iNUM13 = 12;
        int iNUM14 = 3;
        System.out.print(iNUM11 + " minus " + "(" + iNUM11 + " divided by " + iNUM12 + " modulus " + iNUM13 + ")" + " plus " + iNUM14 + " equals ");
        System.out.println(iNUM11-(iNUM11/iNUM12%iNUM13)+iNUM14);
        System.out.println();
        double dNUM9 = 46.2;
        int iNUM15 = 11;
        int iNUM16 = 24;
        int iNUM17 = 17;
        int iNUM18 = 2;
        System.out.print("(" + dNUM9 + " divided by " + iNUM15 + ")" + " minus " + iNUM14 + " plus " + iNUM16 + " modulus " + "(" + iNUM17 + " minus " + iNUM18 + " times " + iNUM14 + ")" + " equals ");
        System.out.println((dNUM9/iNUM15)-iNUM14+iNUM16%(iNUM17-iNUM18*iNUM14));
        System.out.println();
        int iNUM19 = 480;
        int iNUM20 = 10;
        int iNUM21 = 12;
        int iNUM22 = 200;
        double dNUM10 = 0.5;
        int iNUM23 = 20;
        int iNUM24 = 8;
        System.out.print(iNUM19 + " divided by " + iNUM20 + " divided by " + iNUM21 + " plus " + iNUM22 + " times " + dNUM10 + " minus " + iNUM23 + " modulus " + iNUM24 + " equals ");
        System.out.println(iNUM19/iNUM20/iNUM21+iNUM22*dNUM10-iNUM23%iNUM24);
        
        // 2.03 Additional int Equations
        int iNUM5 = 56;
        int iNUM6 = 98;
        System.out.println("Additional Integer Equations");
        System.out.print(iNUM5 + " divided by " + iNUM5 + " times " + iNUM6 + " modulus " + iNUM5 + " equals ");
        System.out.println(iNUM5/iNUM5*iNUM6%iNUM5);
        System.out.println();
        System.out.print(iNUM6 + " minus " + iNUM6 + " plus " + iNUM5 + " equals");
        System.out.println(iNUM6-iNUM6+iNUM5);        
        //2.04 Additional double Equations
        double dNUM4 = 3.14159;
        double dNUM5 = 0.4;
        double dNUM6 = 1.2;
        double dNUM7 = 5.6;
        System.out.println("Additional Double Equations");
        System.out.print(dNUM4 + " times " + dNUM5 + " divided by " + dNUM6 + " modulus " + dNUM7 + " equals ");
        System.out.println(dNUM4*dNUM5/dNUM6%dNUM7);
        System.out.print(dNUM5 + " minus " + dNUM4 + " plus " + dNUM6 + " equals ");
        System.out.println(dNUM5-dNUM4+dNUM6);
               
    } // end of main method
} // end of class
