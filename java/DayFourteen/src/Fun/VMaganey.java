package Fun;

public class VMaganey {

	public static void main(String[] args) {
		int a= 1,b=0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException ae) {
			System.out.println("I caught you please be easy .!"+ae);
			if(b==0) b=2;
			System.out.println(a/b);
		}
		int arr[]=new int[10];
		try {
			arr[10] = 20;
		} catch (ArrayIndexOutOfBoundsException so) {
			System.out.println("I caught you please shut up");
			throw new RuntimeException("Something crazy you throw at ha! ha! ha!....");
		}
		finally {
			System.out.println("I caught you again good bye");
		}
		System.out.println("his Exceptions. here finished");
	}
}
