public class PayRoll {
	private String Name;
	private int ID;
	private int hourly_rate;
	private int hours;
	// constructor
	public PayRoll() {
		Name=" ";
		ID=0;
		hourly_rate=0;
		hours=0;
		
	}
	public PayRoll(String name,int id){
		Name=name;
		ID=id;
	}
	
	public void setName(String name)throws InvalidString1{
		if(name.equals(""))
			throw new InvalidString1();
		else
			name=Name;
	}
	
	public void setID(int id)throws InvalidID {
		if (id<=0)
			throw new InvalidID(id);
		else
			ID=id;
	}
	public void setHourly_rate(int rate)throws InvalidHourlyRate {
		if (rate>25||rate<0)
			throw new InvalidHourlyRate(rate);
		else
			hourly_rate=rate;
	}
	public void setHours(int hrs)throws InvalidHours {
		if (hrs>84||hrs<0)
			throw new InvalidHours(hrs);
		else
			hours=hrs;
	}
	public String getName() {
		return Name;
	}
	public int getID() {
		return ID;
	}
	public int getHourly_rate() {
		return hourly_rate;
	}
	public int getHours() {
		return hours;
	}
	public int grossPay(){
		return(hourly_rate*hours);
	}
}
