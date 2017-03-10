
public class BookLauncher {

	public static void main(String[] args) {
	Book book1 = new Book("Life Of A Programmer", "November 25, 2003","Tony Rock");
	Book book2 = new Book("Java", "June 13, 2009","Mohamud Abdi");
	Book book3 = new Book("Ball Is Life", "October 15, 2003","Unknown");
	
	BookCollection bookCollection = new BookCollection(book1);
	BookCollection bookCollection2 = new BookCollection(book2);
	BookCollection bookCollection3 = new BookCollection(book3);
	System.out.println(bookCollection + "\n\n" + bookCollection2 +
			"\n\n" + bookCollection3);
	
	System.out.println("\nThe total number of books after purchasing two boxes is: " + 
			Book.getTotal(12, 15));
	System.out.println("\nThe total number of Books after purchasing three boxes " +
			"and adding it to the total is: " + 
			Book.getTotal(45, 15, 10));
	}

}
