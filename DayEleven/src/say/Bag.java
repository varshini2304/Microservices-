package say;

import java.util.Objects;


public class Bag implements Comparable<Object>{

	private double width;
	private double height;
	private double weight;

	public Bag(double width, double height, double weight) {
		super();
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Bag [width=" + width + ", height=" + height + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, weight, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bag other = (Bag) obj;
		return Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	public int compareTo(Object o) {
		Bag bo = (Bag)o;
		if(this.height>bo.height) {
			return 1;
		}
		else if(this.height<bo.height) { 
			return -1;
		}
		else
			return 0;
	}
	
	
	
	
	
	
}
