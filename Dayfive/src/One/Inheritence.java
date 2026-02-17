package One;

public class Inheritence {
	private String firstname;
	private String lastname;
	private int age;
	
	
	public Inheritence() {
		super();
		System.out.println("hai how are you i'm Inheritance here");

	}
	
	public Inheritence(String lastname,String firstname,int age) {
		super();
		this.age=age;
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("\nhai "+firstname+" "+lastname+" "+" of age "+age+" how are you i'm Inheritance here");

	}
	
	public Inheritence(String firstname,String lastname) {
		super();
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("\nhai "+firstname+" "+lastname+" "+"how are you i'm Inheritance here");
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
