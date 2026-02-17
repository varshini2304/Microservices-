package assignment;

public class person {
	private String name;
	private Address address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getPerson() {
		 System.out.println("name: "+name+ "\nage: "+age+ "\n"+address.getAddress()+ " ");
		 return "thank you\n";
	}
	
}
