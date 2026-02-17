package fun;

public class Country {
	private String name;
	private double area;
	private long population;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String name, double area, long population) {
		super();
		this.name = name;
		this.area = area;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}

}