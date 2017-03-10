package chapter4;

public class ChallengeFourSales {
int Quantity;
int Discount;
int Total;





public void setTotal(int total) {
	Total = Quantity * 99;
}






public int getDiscount() {
	return Discount;
}






public int getTotal() {
	return Total;
}



public void setDiscount(int discount) {
	
    if (Quantity >= 10 && Quantity <=19){
    	System.out.println("20%");	
    }
    else if(Quantity >= 20 && Quantity <= 49) {
	System.out.println("30%");
	}
	else if(Quantity >= 50 && Quantity <= 99 ) {
		System.out.println("40%");
		}
	else if(Quantity >= 100) {
		System.out.println("50%");
		}
	else {System.out.println("Wrong Value");
	System.exit(0);};

}



	public int getQuantity() {
	return Quantity;
}



public void setQuantity(int quantity) {
	Quantity = quantity;
}



	public ChallengeFourSales() {
		
		
		// TODO Auto-generated constructor stub
	}

}
