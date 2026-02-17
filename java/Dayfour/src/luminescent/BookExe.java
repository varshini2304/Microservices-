package luminescent;

public class BookExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		Book.display(book);
		System.out.println("\n");
		Book.display(new Book("\nvarshini","Vary interesting book",200000));

	}

}
