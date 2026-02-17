package fun;

import java.util.List;

public class State {

	private String stateName;
	private double area;
	private List<City> cities;
	public State(String stateName, double area, List<City> cities) {
		super();
		this.stateName = stateName;
		this.area = area;
		this.cities = cities;
	}
	public State() {
		super();
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
