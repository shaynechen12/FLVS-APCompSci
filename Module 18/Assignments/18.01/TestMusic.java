/**
 * run the program
 * 
 * 
 * author Gatlin Newhouse
 * version 3/24/15
 */
public class TestMusic {
	public static void main(String[] args)
	{
	    Music[] myMusic = new Music[15];
	    myMusic[0] = new Music("Pieces of You",1994, "Jewel");
	    myMusic[1] = new Music("Jagged Little Pill",1995,"Alanis Morissette");
	    myMusic[2] = new Music("What If It's You", 1995,"Reba McEntired");
	    myMusic[3] = new Music("Misunderstood",2001,"Pink");
	    myMusic[4] = new Music("Laundry Service",2001,"Shakira");
	    myMusic[5] = new Music("Taking the Long Way",2006,"Dixie Chicks");
	    myMusic[6] = new Music("Under My Skin",2004,"Avril Lavigne");
	    myMusic[7] = new Music("Let Go",2002,"Avril Lavigne");
	    myMusic[8] = new Music("Let It Go",2007,"Tim McGraw");
	    myMusic[9] = new Music("White Flag",2004,"Dido");
	    printmyMusic(myMusic); 
	    System.out.println("Search - Title - Let Go");
	    findTitle(myMusic, "Let Go");
	    System.out.println("Search - Title - Some Day");
	    findTitle(myMusic, "Some Day");
	    System.out.println("Search - Year - 2001");
	    findYear(myMusic, 2001);
	    System.out.println("Search - Singer - Avril Lavigne");
	    findSinger(myMusic, "Avril Lavigne");
	    System.out.println("Search - Singer - Tony Curtis");
	    findSinger(myMusic, "Tony Curtis");
	}
	public static void printmyMusic(Music[] r)
	{
	    System.out.println("Time                     Location        Person");
	    System.out.println("---------------------------------------------------");
	    for(int i = 0; i < r.length; i++)
	    {
	       System.out.println(r[i]);
	    }
	}
	public static void findSinger(Music[] r, String toFind)
	{
	    int found = -1;
	    for(int i = 0; i < r.length; i++)
	    {
	       if (r[i].getsinger().compareTo(toFind) == 0)
	           {
	               found = i;
	               break;
	           }
	           else
	           {
	               break;
	           }
	    }
        if (found != -1)
        {  // we have found the person
           System.out.println("We found " + toFind + " in the library: ");
           System.out.println(r[found]);
        }
        else
        {
           System.out.println(toFind + " is not in the library");
        }
	}
	public static void findTitle(Music[] r, String toFind)
	{
	    int found = -1;
	    for(int i = 0; i < r.length; i++)
	    {
	       if (r[i].gettitle().compareTo(toFind) == 0)
	       {
	               found = i;
	               break;
	       }
	       else
	       {
	           break;
	       }
	    }
        if (found != -1)
        {  // we have found the person
           System.out.println("We found " + toFind + " in the library: ");
           System.out.println(r[found]);
        }
        else
        {
           System.out.println(toFind + " is not in the library");
        }
	}
	public static void findYear(Music[] r, int toFind)
	{
	    int found = 0;
	    System.out.println("Find results: ");
	    for(int i = 0; i < r.length; i++)
	    {
	       if (r[i].getyear() == toFind)
	           {
	               System.out.println(r[i]);
	               found++;
	               if (found == 3)
	               {
	                  break;
	               }
	           }
	           else
	           {
	               break;
	           }
	    }
        if (found == 0)
        {  // we have not found the location
           System.out.println(toFind + " is not in the library");
        }  
        else
        {
            System.out.println("There are no listings for " + toFind);
        }
	}	
}