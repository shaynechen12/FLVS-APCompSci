/**
 * @purpose: Calculate the CO2 from household waste 8.11
 *
 * @author: Gatlin Newhouse
 * @version: 11/21/2014
 */
import java.util.ArrayList;
public class CO2FootprintTester
{
   public static void main(String[] args)
   {
       ArrayList<CO2Footprint> cO2 = new ArrayList<CO2Footprint>();
       cO2.add(new CO2Footprint(833.4, 87.45, .12, 4, true, true, true, true, 8));
       cO2.add(new CO2Footprint(1543.6, 126.19, .12, 6, true, false, true, true, 13));
       cO2.add(new CO2Footprint(603.1, 65.42, .12, 2, true, true, false, false, 3));
       cO2.add(new CO2Footprint(389.4, 58.90, .12, 1, true, false, true, false, 5));
       cO2.add(new CO2Footprint(1367.2, 94.31, .12, 3, false, false, false, false, 2));
       System.out.println("|             Pounds of CO2               |      Pounds of CO2         |                |");
       System.out.println("|              Emitted From               |      Reduced from          |                |");
       System.out.println("|   Gas    |     Electricity    |  Waste  |  Recycling  |   New Bulbs  |  CO2 Footprint |");
       System.out.println("|----------|--------------------|---------|-------------|--------------|----------------|");
       CO2Footprint dataRecord;
       for(int index = 0; index < cO2.size(); index ++)
       {
           dataRecord = cO2.get(index);
           System.out.printf("| %.2f | %13.2f      | %2.2f | %10.2f  | %10.1f   | %12.2f   | \n", dataRecord.gasCO2(), dataRecord.calcElectricityCO2(), dataRecord.calcGrossWasteEmission(), dataRecord.calcWasteReduction(), dataRecord.bulbsReduction(), dataRecord.totalFootprint());
       }
   }
}

