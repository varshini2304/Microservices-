package luminescent;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulb bulb = new Bulb();
		System.out.println(bulb.getLength());
		System.out.println(bulb.isFlag());
		Bulb bulb2 = new Bulb(200);
		System.out.println(bulb2.getLength());
		System.out.println(bulb2.isFlag());
	}
}
