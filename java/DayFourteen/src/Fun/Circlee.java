package Fun;

public class Circlee extends Shape {

	
	public Circlee(double length) {
		super(length);
	}

	@Override
	public double area() {
		return Math.PI*getWidth()*getWidth();
	}
	
	public double getLength() {
		return super.getLength();
	}

}
