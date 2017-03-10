
public class Book {
private String name;
private String date;
private String author;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
public Book(String name, String date, String author){
	this.name = name;
	this.date = date;
	this.author = author;
}

public Book(Book book){
this.name = book.name;
this.date = book.date;
this.author = book.author;
}

public String toString(){
	String str;
	str = 
			"Name:  " + this.name + "\n" +
             "Publish Date: " + this.date+ "\n"+
			  "Authur: " + this.author + "\n";
           return str;
}



//we just purchased two large boxes of CDs this returns the total
	public static double getTotal(int num1, int num2){
		return num1 + num2;
			}
	// we just purchased two boxes of CDs and are adding each box to our current box
	public static double getTotal(int currentTotal, int box1, int box2){
	 return currentTotal + box1 + box2;
	}



}
