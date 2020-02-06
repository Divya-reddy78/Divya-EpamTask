package epam.maventask;
public class Candies extends Sweets {
	public Candies(String candyname,int weight,int cost) {
		// TODO Auto-generated constructor stub
		super(candyname,weight,cost);
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "candy";
	}

}
