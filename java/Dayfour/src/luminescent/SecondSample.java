package luminescent;

public class SecondSample {

	public static void main(String[] args) {
		int arr[] = {1,4,6,8,9,10};
		int brr[]=new int[10];
		System.out.println("before copy\n");
		for( int i : arr) {	System.out.print("\t"+i);}
		System.out.println("\n");
		for( int i : brr) {	System.out.print("\t"+i);}
		System.out.println("\n");
		
		/*hggggggggggggggggf
		 * 
		 * 		Importatnttttttttttttttttttttttttttttttttttt
		 * 
		 * 
		 * 
		 * */
		
		
		System.arraycopy(arr, 2, brr,5,arr.length-2);
		
		System.out.println("after copy");
		System.out.println("\n");
		for( int i : brr) {	System.out.print("\t"+i);}
	}

}
