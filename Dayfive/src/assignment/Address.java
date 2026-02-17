package assignment;

public class Address {

	private String country;
	private String state;
	private String area;
	
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getAddress() {
		return "Country :"+country+ "\nState: " + state+ "\nArea: " + area+ " ";
	}
	
}
