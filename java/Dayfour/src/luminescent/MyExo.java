package luminescent;

public class MyExo {

	public static void main(String[] args) {
		int arr[] = {1,4,6,8,9,10};
		int brr[]=new int[10];
		System.out.println(arr.length);
		System.out.println(brr.length);
		for( int i : arr) {	System.out.print("\t"+i);}
		System.out.println(arr);
		brr = arr;
		System.out.println("brr array is"+brr);
		System.out.println("\n");
		for( int i : brr) {System.out.print("\t"+i);}
		System.out.println("\n");
		System.out.println(arr.length);
		System.out.println(brr.length);
	}

}
