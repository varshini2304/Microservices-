package assignment;

public class mainExe {

	public static void main(String[] args) {
		
		Location loc1 = new Location();
		loc1.setLatitude("Longitude1");
		loc1.setLongitude("latitude1");
		Address add1= new Address(loc1);
		add1.setArea("vijaynagar");
		add1.setCountry("India");
		add1.setPincode(572216);
		add1.setState("Karnataka");
		Employee emp1 = new Employee(add1);
		emp1.setName("Varshini");
		emp1.setRole("Software Developer");
		emp1.setSalary(45000);
		System.out.println("employee 1 details :"+emp1.getEmployee());
		
		Location loc2 = new Location();
		loc2.setLatitude("nonsense Longitude");
		loc2.setLongitude("nonsense latitude");
		Address add2= new Address(loc2);
		add2.setArea("jaynagar");
		add2.setCountry("India");
		add2.setPincode(572256);
		add2.setState("Karnataka");
		Employee emp2 = new Employee(add2);
		emp2.setName("sahil");
		emp2.setRole("ai Developer");
		emp2.setSalary(85000);
		System.out.println("employee 2 details :"+emp2.getEmployee());
		
		Employee employee[]= {emp1,emp2};
		for(Employee i:employee) {
			System.out.println(i.getEmployee());
		}
		
	}

}
