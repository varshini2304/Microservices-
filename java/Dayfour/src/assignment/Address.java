package assignment;

public class Address {
	public long aid;
	protected String country;
	protected String state;
	protected String area;
	protected long pincode;
	protected Location location;

	public Address(Location location){
		this.aid=generateAid();
		this.location = location;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getAid() {
		return aid;
	}

	public long generateAid() {
		long lo = Math.round(Math.random()*100000);
		return lo;
	}
	
	public String getAddress() {
		return country+"\npincode: "+pincode+"\n"+area+"\n"+state+"\naddress id:"+aid+"\n"+location.getLocation();
	}
	
	
}
