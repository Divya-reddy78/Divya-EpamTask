package epam.maventask;
import java.util.ArrayList;
import java.util.Collections;

public class Gift {
	public ArrayList<Sweets> list;
	public Gift(ArrayList<Sweets> l) {
		// TODO Auto-generated constructor stub
       this.list=l;	
	}
	public int totalWeight() {
		   int sum=0;
		   for(Sweets s:list) {
			   sum+=s.weight;
		   }
		   return sum;
	   }
	public void sortChocolates(String sortparam) {
        if(sortparam.compareTo("name")==0) {
        	Collections.sort(list,new Namesort());
        	
        }
        else if(sortparam.compareTo("weight")==0) {
        	Collections.sort(list,new Weightsort());
        	
        }
        else if(sortparam.compareTo("cost")==0) {
        	Collections.sort(list,new Costsort());
        }
}
}
