package One;

public class Starter {
	public static void main(String[] args) {
		String s = "one here";
		String s1 = s;
		String s2 = new String("one here");
		System.out.println(s.length());
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s2.length());
		System.out.println(s.charAt(0));
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(3));
		System.out.println(s.substring(2,6));
		System.out.println(s+" This is so stupid");
		System.out.println(s);
		int ma = Math.abs(-10);
		System.out.println(ma);
		System.out.println(0/0);
	}

}
