
public class BookCollection {
	private Book book;
	
	public BookCollection(Book book){
	this.book = new Book(book);
	}
	
	public Book getBook(){
	return new Book(book);
	}
	
	public void setBook(Book book){
		this.book = new Book(book);
	}
	
	public void getBookCollection(){
		
	}
	
	public String toString(){
		String str;
		str = "*****************Library****************"+"\n\n"+ 
		book;
		
			
	            

	           return str;
	}
	
	
	
	
	
}
