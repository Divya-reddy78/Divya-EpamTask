import java.util.ArrayList;
import java.util.Scanner;

import epam.maventask.Candies;
import epam.maventask.Chocolates;
import epam.maventask.Gift;
import epam.maventask.Sweets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        ArrayList<Sweets> list=new ArrayList<>(); 
        list.add(new Chocolates("fivestar",10,5));
        list.add(new Chocolates("munch",20,15));
        list.add(new Chocolates("kit-kat",30,25));
        list.add(new Candies("mangocandy",20,30));
        list.add(new Candies("strawberrycandy",20,35));
        list.add(new Candies("blueberrycandy",20,20));
        Gift gift=new Gift(list);
        Integer totweight=gift.totalWeight();
        System.out.println("Total Weight of Sweets is"+totweight);
        System.out.println("sorting the chocolates in gift by cost");
        for (Sweets x : gift.list) {
        	if(x.getType()=="chocolate") {
			System.out.println(x.sweetname); 
		}
      	}
        int lowlimit,highlimit;
        System.out.println("enter the lower limit/boundary for cost of gifts (available costs of candies here: 5,10,15)");
        lowlimit=s.nextInt();
        System.out.println("enter the high limit/boundary for cost of gifts (available costs of candies here: 5,10,15)");
        highlimit=s.nextInt();
        for (Sweets r : gift.list) {
        	if(r.cost>=lowlimit || r.cost<=highlimit) {
        		if(r.getType()=="candy") {
			System.out.println(r.sweetname);
        	}
        	}
        }
    }
}
