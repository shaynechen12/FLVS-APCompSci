/**
 * blibbity blah blah
 *
 * @author: Gatlin Newhouse
 * @version: 11/17/14
 */
public class CO2Footprint
{
   private double emissionsConstant = 8.78 * Math.pow(10, -3);
   private double metricToPoundsConstant = 2204.62262;
   private int myNumPeople;
   private double cO2fromelectricity, cO2fromgas, bulbReduction;
   private boolean myNumPaper, myNumPlastic, myNumGlass, myNumCans;
   private double myEmissions, myReduction, myNetEmissions, myNumGasUsed, myNumElectricBill, myNumElectricPrice, myNumBulbsReplaced;
   CO2Footprint(double myGasUsed, double myElectricBill, double myElectricPrice, int myPeople, boolean myPaper, boolean myGlass, boolean myCans, boolean myPlastic, int myBulbsReplaced)
   {
       myNumPeople = myPeople;
       myNumPaper = myPaper;
       myNumPlastic = myPlastic;
       myNumGlass = myGlass;
       myNumCans = myCans;
       myNumGasUsed = myGasUsed;
       myNumElectricBill = myElectricBill;
       myNumElectricPrice = myElectricPrice;
       myNumBulbsReplaced = myBulbsReplaced;
       myEmissions = 0.0;
       myReduction = 0.0;
       myNetEmissions = 0.0;
   }
   /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
   public double calcGrossWasteEmission()
   {
        myEmissions = myNumPeople * 1018;
        return myEmissions;
   }
   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public double calcWasteReduction()
   {
      if(myNumPaper)
      {
          myReduction += (184.0 * myNumPeople);
      }
      //******* fill in rest of method here ****//
      if(myNumPlastic)
      {
          myReduction += (myNumPeople * 25.6);
      }
      if(myNumGlass)
      {
          myReduction += (myNumPeople  * 46.6);
      }
      if(myNumCans)
      {
          myReduction += (myNumPeople  * 165.8);
      }
      return myReduction;
   }
   /**
    * Calculate the electricity CO2 output
    */
   public double calcElectricityCO2 ()
   {
       cO2fromelectricity = ((myNumElectricBill / myNumElectricPrice) * 1.37 * 12);
       return cO2fromelectricity;
   }
   /**
    * This finds the CO2 used by gas
    */
   public double gasCO2()
   {
       cO2fromgas = ((emissionsConstant * myNumGasUsed) * metricToPoundsConstant);
       return cO2fromgas;
   }
   public double bulbsReduction()
   {
       bulbReduction = ((myNumBulbsReplaced * 1.37 * 73));
       return bulbReduction;
   }
   public double totalFootprint()
   {
       return (myEmissions + cO2fromelectricity + cO2fromgas - myReduction - bulbReduction);
   }
}


