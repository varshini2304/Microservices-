package Fun;

public abstract class Shape {
	private double length;
	private double width;
	public Shape(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Shape() {
		super();
	}
	public Shape(double length) {
		super();
		this.length=this.width = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public abstract double area();

}
