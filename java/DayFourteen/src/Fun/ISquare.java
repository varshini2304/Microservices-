package Fun;

public class ISquare implements Figure {

	private double width;
	private double length;

	@Override
	public double getWidth() {
		return this.width;
	}

	@Override
	public double getLength() {
		return this.length;
	}

	@Override
	public double area() {
		return getLength()*getWidth();
	}

	public ISquare(double length, double width) {
		super();
		this.width = width;
		this.length = length;
	}

	public ISquare(double width) {
		super();
		this.length = this.width =width;
	}

	public ISquare() {
		super();
	}

	
	
}
