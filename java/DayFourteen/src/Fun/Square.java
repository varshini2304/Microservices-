package Fun;

public class Square extends Shape {

	@Override
	public double area() {
		return getLength()*getWidth();
	}

	public Square() {
		super();
	}

	public Square(double length, double width) {
		super(length, width);
	}

	public Square(double length) {
		super(length);
	}
	
	

}
