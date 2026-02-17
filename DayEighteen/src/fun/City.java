package fun;

public class City {
	private String cityName;
	private boolean capital;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(String cityName, boolean capital) {
		super();
		this.cityName = cityName;
		this.capital = capital;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public boolean isCapital() {
		return capital;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}

}