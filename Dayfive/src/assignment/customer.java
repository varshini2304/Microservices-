package assignment;

public class customer extends person {

	private long cid;
	public customer() {
		super();
		this.cid = generateCid();
	}
	
	public long generateCid() {
		cid = Math.round(Math.random()*10000);
		return cid;
	}
	
	public String getCustomer() {
		super.getPerson();
		return "***************************************\nThank you for choosing nichi in and \n"+cid+" : is your eid";
	}

	
}
