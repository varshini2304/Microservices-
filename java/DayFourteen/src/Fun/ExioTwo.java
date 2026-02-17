package Fun;

public class ExioTwo {

	public static void main(String[] args) {

		Days dd = Days.FRI;
		System.out.println(dd);
		System.out.println(dd.ordinal());
		System.out.println(dd.compareTo(Days.SAT));
		System.out.println(dd.compareTo(Days.SUN));
		System.out.println(Days.SUN.compareTo(dd));
		switch (dd) {
		case SUN:{
			System.out.println("Hello it's a sunday");
			break;
		}
					
		case MON:{
			System.out.println("Hello it's a monday");
			
			break;
		}
			
		case TUE:{
			System.out.println("Hello it's a tuesday");
			
			break;
		}
			
		case WED:{
			System.out.println("Hello it's a wednesday");
		
					break;
		}
		case THUR:{
			System.out.println("Hello it's a thursday");
		
					break;
		}
		case FRI:{
			System.out.println("Hello it's a friday");
		
					break;
		}
		case SAT:{
			System.out.println("Hello it's a saturday");
		
					break;
		}
		default:
			break;
		}
	}

}
