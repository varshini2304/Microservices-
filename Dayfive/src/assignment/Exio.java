package assignment;

public class Exio {
	public static void main(String[] args) {

		Address add = new Address();
		add.setArea("banshankari");
		add.setCountry("India");
		add.setState("karnataka");
		person per=new person();
		per.setAge(20);
		per.setName("varshini");
		per.setAddress(add);
		System.out.println(per.getPerson());
		
		Employee emp = new Employee();
		emp.setAddress(add);
		emp.setAge(24);
		emp.setName("Sudha");
		System.out.println(emp.getEmployee());
		
		Address add1= new Address();
		add1.setArea("laggere");
		add1.setCountry("India");
		add1.setState("Karnataka");
		customer cust = new customer();
		cust.setAddress(add1);
		cust.setAge(22);
		cust.setName("vismaya");
		System.out.println(cust.getCustomer());
		
		
	}

}
