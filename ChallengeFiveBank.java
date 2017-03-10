package chapter4;

public class ChallengeFiveBank {
//variable for charges
double Charges = 0;
// variable for balance
double ballance = 0;
// if balance is less than $400 charge $15
	public double getBallance() {
	if(ballance < 400){
	double fee = 15;
	return fee;
	}
	// else charge nothing
	else {
	double set = 0;
	return set;	
	}
	
}

public void setBallance(double ballance) {
	this.ballance = ballance;
}
// getter gets the number of checks entered then charges the customer
	public double getCharges() {
	if (Charges >= 60){
		double add60 = Charges * 0.04;
		return add60;
	}
	else if(Charges >= 40 && Charges <= 59) {
		double add59 = Charges * 0.06;
		return add59;
	}
	
	else if (Charges >=20 && Charges <= 39 ){
		double add59 = Charges * 0.08;
		return add59;
	}
	else if (Charges <= 20){
	   double less20 = Charges * 0.10;
	   return less20;
	}
	
	else{
	return Charges;
	}
}

public void setCharges(double charges) {
	Charges = charges;
}

	public ChallengeFiveBank() {
		// TODO Auto-generated constructor stub
	}

}
   