package assignment;

public class Employee extends person {

	private long eid;

	public Employee() {
		super();
		this.eid = generateEid();
		// TODO Auto-generated constructor stub
	}
	
	public long generateEid() {
		eid = Math.round(Math.random()*10000);
		return eid;
	}
	
	public String getEmployee() {
		super.getPerson();
		return "you are now an employee of nichi in \n"+eid+" : is your eid\n";
	}
}
