import java.text.DecimalFormat;

public class CDCollection {
	private CD cd;
	public CDCollection() {
		
	}
	
	public CDCollection(CD cd){
		this.cd = new CD(cd);
	}

	public CD getCd() {
		return new CD(cd);
	}

	public void setCd(CD cd) {
		this.cd = new CD(cd);
	}
	
	public void getCDCollecttion(){
		
		
	}
	
	
	
	public String toString(){
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		String str;
		str = "Title:  " + cd.getTitle() + "\n" +
	             "Artist: " + cd.getArtist() + "\n"+
				  "Album Price: " +formatter.format(cd.getPrice()) + "\n" + 
	              "Collection Value " + formatter.format(CD.getTotalValue());
		return str;
	}
	
}
