package SomeTwo;

public class ImpleOne implements Person {

	private String firstName;
	private String lastName;
	private int age;
	private String email;
	
	@Override
	public void setFirstName(String name) {
		this.firstName=name;
		
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public void setLastName(String name) {
		// TODO Auto-generated method stub
		this.lastName=name;

	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;

		
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;

	}

	@Override
	public void setEmail(String mail) {
		// TODO Auto-generated method stub
		this.email=mail;

		
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}



}
