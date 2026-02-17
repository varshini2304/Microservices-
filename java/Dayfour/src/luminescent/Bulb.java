package luminescent;

public class Bulb {
	private boolean flag;
	private static 	int counter=10;
	public boolean isFlag() {
		return flag;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	private int length;
	
	public Bulb() {
		super();
		System.out.println("I'm constructor called here, executed after instance ");
		counter++;
		System.out.println(counter);
	    System.out.println("\n");

	}
	
	public Bulb(int length) {
		super();
		this.length = length;
		System.out.println("I'm parameterised constructor called here");
	    System.out.println("\n");

	}

	public int getLength() {
		return length;
	}
	
	
	{
		System.out.println("this is instance method called here");
		flag = true;
		length = 100;
		System.out.println("I am called before constructor after instance");
	    System.out.println("I can print counter "+ counter);
	    counter++;
	    System.out.println("I can print counter 2nd time herereeee"+ counter);
	    System.out.println("\n");

	}
	
	static {
		System.out.println("I'm the great static block fellow!");
	    System.out.println("I'm privileiged to execute before any one and all, and only be executed once, property of class not the objects, ststic variable is a class variable");
	    System.out.println("I can print counter "+ counter);
	    System.out.println("\n");
	    counter++;

	}
	

	public void setLength(int length) {
		this.length = length;
	    System.out.println("I can print counter "+ counter);
	    System.out.println("\n");

	}
}
