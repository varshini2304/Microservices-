package luminescent;

public class Book {

	private  String title;
	private  String author;
	private  double price;
	private int isbn;
	private static int count;
	public  String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getIsbn() {
		return isbn;
	}
	public static int getCount() {
		return count;
	}


	public Book() {
		++count;
		this.isbn++;
	}
	public Book(String title,String author,double price) {
		this.author = author;
		this.title = title;
		this.price = price;
		++count;
		this.isbn++;
	}
	{
		this.author="shankar";
		this.title = "silly one written by our sir!";
		this.price=100000.00;
		this.isbn=273465;
	}
	
	public static void display(Book booky) {
		Book book = booky;
		System.out.println("Author is \t "+book.getAuthor());
		System.out.println("Title is \t "+book.getTitle());
		System.out.println("Price is \t "+book.getPrice());
		System.out.println("Isbn is \t "+book.getIsbn());
		System.out.println("Count is \t "+Book.getCount());
	}
	
}
