package epam.maventask;
import java.util.Comparator;
public class Namesort implements Comparator<Sweets> {
      
	public int compare(Sweets g1,Sweets g2) {
		return g1.sweetname.compareTo(g2.sweetname);
	}
}