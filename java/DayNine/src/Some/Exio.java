package Some;

public class Exio {

	static Shoe[] shoes = { new classicShoe(),
	 new letherShoe(),
	 new quaddiShoe()};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  calling static method System.out.println(Shoe.greet());
		
		
		System.out.println(shoes[0].greet());
		System.out.println(shoes[1].greet());
		System.out.println(shoes[2].greet());


		for(int m=0;m<shoes.length;m++) {
			System.out.println(shoes[m].greet());
		}
		
	}

}



