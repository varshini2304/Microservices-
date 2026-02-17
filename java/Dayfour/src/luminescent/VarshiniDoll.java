package luminescent;

public class VarshiniDoll {
	private double width;
	private double height;
	private double weight;
	private VarshiniDoll() {
		this.height = 100;
		this.weight = 50;
		this.width = 30;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public static VarshiniDoll getDoll() {
		return new VarshiniDoll();
	}
	
}
