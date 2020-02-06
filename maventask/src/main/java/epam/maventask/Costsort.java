package epam.maventask;
import java.util.Comparator;

public class Costsort implements Comparator<Sweets> {
		public int compare(Sweets g1,Sweets g2) {
			return g1.cost-g2.cost;
		}
	}