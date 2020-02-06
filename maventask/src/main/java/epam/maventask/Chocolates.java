package epam.maventask;
public class Chocolates extends Sweets{

	public Chocolates(String chocname,int weight,int cost) {
		// TODO Auto-generated constructor stub
		super(chocname,weight,cost);
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "chocolates";
	}

}
