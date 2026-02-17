package One;

public class Exio {
	public static void main(String[] args) {
		VarshaBaby baby = VarshaBaby.getUser("first","last");
		System.out.println(baby);
		System.out.println(baby.getUsername());
		VarshaBaby baby1 = VarshaBaby.getUser("second","last");
		System.out.println(baby1);
		System.out.println(baby1.getUsername());
		VarshaBaby baby2 = VarshaBaby.getUser("third","last");
		System.out.println(baby2);
		System.out.println(baby2.getUsername());
		VarshaBaby baby3 = VarshaBaby.getUser("fourth","last");
		System.out.println(baby3);
		System.out.println(baby3.getUsername());
		VarshaBaby baby4 = VarshaBaby.getUser("fifth","last");
		System.out.println(baby4);
		System.out.println(baby4.getUsername());
	}

}
