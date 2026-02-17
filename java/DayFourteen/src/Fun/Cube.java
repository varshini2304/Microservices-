package Fun;

public class Cube extends Square implements Figure{

	
	 private double height;
	 
	public Cube() {
		super();
	}

	public Cube(double width,double length,double height) {
		super(length, width);
		this.height=height;
	}

	public Cube(double length,double height) {
		super(length);
		this.height=height;
	}

	@Override
	public double area() {
		return super.area()*this.height*6;
	}

}
