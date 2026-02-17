package assignment;

public class Location {

	private String longitude;
	private String latitude;
	public String getLocation() {
		return longitude+" "+latitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
