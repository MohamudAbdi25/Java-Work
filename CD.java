
public class CD {
	private String title;
	private String artist;
	private double price;
	private static double totalValue = 0.0;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static double getTotalValue() {
		return totalValue;
	}

	public static void setTotalValue(double totalValue) {
		CD.totalValue = totalValue;
	}

	public CD() {
	
	}

	public CD(String title, String artist, double price){
		this.title = title;
		this.artist = artist;
		this.price = price;
		totalValue += price;
		
	}
	

	
	public CD(CD cd){
	this.title = cd.title;
	this.artist = cd.artist;
	this.price = cd.price;
	}
	
	// we just purchased two large boxes of CDs this returns the total
	public static double getTotal(int num1, int num2){
		return num1 + num2;
			}
	// we just purchased two boxes of CDs and are adding each box to our current box
	public static double getTotal(int currentTotal, int box1, int box2){
	 return currentTotal + box1 + box2;
	}
}
