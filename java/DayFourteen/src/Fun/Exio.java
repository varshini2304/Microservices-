package Fun;

public class Exio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Cube(20,30,40);
		Figure figure = new ISquare(30,30);
		
		
		System.out.println(shape.area()+" is the area of the cube");
		System.out.println(figure.area()+" is the area of the square");
		
		//Shape = new ISquare();
		figure = (Figure) shape;
		System.out.println(figure.area());
		
		Shape shape1 = new Circlee(35);
		System.out.println("hai this is it......");
		
		try {
			System.out.println(shape1.getLength());
		} catch (Exception e) {

			System.out.println("not possible");
		}
		
				
				



	}

}
