package assignment;
public class Employee {
	public long eid;
	private String name;
	private String role;
	private double salary;
	private Address address;
	
	public Employee(Address address) {
		this.eid=generateEid();
		this.address=address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long generateEid() {
		long eid = Math.round(Math.random()*100000);
		return eid;
	}
	
	public String getEmployee() {
		return "eid: " + eid+"\n"+name+"\n"+address.getAddress()+"\n"+role+"/n"+salary+"\n";
	}
	
}
