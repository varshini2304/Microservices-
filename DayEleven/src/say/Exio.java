package say;

import java.util.Arrays;

public class Exio {
	
	public static void main(String[] args) {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(-200000000);
		result = prime*result+(int)(temp ^(temp>>>32));
		System.out.println(temp);
		System.out.println(temp^(temp>>>32));
		Bag bag = new Bag(200000000,30,155);
		System.out.println(bag);
		Bag bag1 = new Bag(200000000,130,55);
		System.out.println(bag1);
		Bag bag2 = new Bag(200000000,20,55);
		System.out.println(bag2);
		if(bag.equals(bag2)) {
			System.out.println("ya they are same");
		}
		int arr[]= {22,-5,44,666,-7,99,40};
		System.out.println("before sorting the array was");
	
		for (int ar : arr) {
			System.out.print(" " +ar);
		}
		System.out.println("\nafter sorting the array became");
	
		Arrays.sort(arr);
		for (int ar : arr) {
			System.out.print(" "+ar);
		}
		Bag []bags = new Bag[4];
		bags[0]= new BackBag(300.00,58.00,155.00);
		bags[1]= new BackBag(500.00,58.00,155.00);
		bags[2]= new BackBag(6000.00,58.00,155.00);
		bags[3]= new BackBag(80000.00,58.00,155.00);
		
		System.out.println("before sorting the bag array was");
		for (Bag ar : bags) {
			System.out.print(" "+ar);
		}
		
		System.out.println("\nafter sorting the Bag array became\n\n");
		
		Arrays.sort(bags);
		for (Bag ar : bags) {
			System.out.print(" "+ar);
		}
		System.out.println("\n");
		String so="\n\nWhat is this\n";
		String s1="what is this";
		System.out.println(so.compareTo(s1));
		System.out.println(s1.compareTo(so));
		System.out.println(s1.compareTo(s1));

		
		Jumbo<Bag> jo = new Jumbo(new Bag(20,30,50));
		
		
		Jumbo<MyNumber> jon = new Jumbo(new MyNumber());
		System.out.println(jo.get());
		System.out.println(jon.get());
		



	}
}
