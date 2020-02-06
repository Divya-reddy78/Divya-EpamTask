package epam.maventask;

public abstract class Sweets {
	public abstract String getType();
	  public String sweetname;
	  public int weight;
	public int cost;
	  protected Sweets(String sweetname,int weight,int cost){
		  this.sweetname=sweetname;
		  this.weight=weight;
		  this.cost=cost;
	  }
}
