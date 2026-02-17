package say;

public class Chill extends BackBag implements Mine{

	public Chill(double width, double height, double weight) {
		super(width, height, weight);
		// TODO Auto-generated constructor stub
	}
	
	private double kara;
	
	public int compareTo(Object o) {
		int rs= super.compareTo(o);
		Chill chill = (Chill)o;
		if(this.kara>chill.kara&&rs>=1)
			return 1;
		else if(this.kara>chill.kara&&rs<=-1){
			return -1;
		}
		else {
			return 0;
		}
	}
	

}
