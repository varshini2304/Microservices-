package SomeTwo;

public class ExioTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person persons[] = {new ImpleOne(),new ImpleTwo(),new MyPersonTwo()};
		PersonMine []mines= {new ImpleTwo(),new MyPersonTwo()};
		Twin twin = new MyPersonTwo();
		persons[1].setAge(20);
		persons[1].setFirstName("varvvars");
		persons[1].setEmail("vAgmail.com");
		System.out.println(persons[1].getAge());
		System.out.println(persons[1].getFirstName());
		System.out.println(persons[1].getEmail());
		mines[0].setAge(20);
		mines[0].setFirstName("hghg");
		mines[0].setLastName("something");
		mines[0].setEmail("ahghgdfc@gmail.com");
		
		mines[1].setAge(25);
		mines[1].setFirstName("gdf");
		mines[1].setLastName("sd");
		mines[1].setEmail("sf@gmail.com");		
		twin = (Twin) mines[1];

		PersonMine mine = (PersonMine) twin;
		System.out.println(mine.getAge());
		System.out.println(mine.getFirstName());
		System.out.println(mine.getLastName());
		System.out.println(mine.getEmail());
		
		System.out.println(mines[0].getAge());
		System.out.println(mines[0].getFirstName());
		System.out.println(mines[0].getLastName());
		System.out.println(mines[0].getEmail());
		
		persons[0]=persons[1];
		// doing the same thing without typecasting mines[0] = new ImpleTwo());
		//mines[0]=(PersonMine)persons[0];
		mines[0] = new ImpleTwo();
		Person p = new ImpleTwo();
		p = (Person)mines[0];
		System.out.println("Person taking mine one");
		System.out.println(mines[0].getAge());
		System.out.println(mines[0].getFirstName());
		System.out.println(mines[0].getLastName());
		System.out.println(mines[0].getEmail());

		System.out.println(persons[0]);
		System.out.println(mines[0]);

		

	}
}
