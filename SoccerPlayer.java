
public class SoccerPlayer {
	 private String Name;
	 private int GamesWon;
	 private int GamesLost;
	 private double weeklyPay;
	 
	 public double getWeeklyPay() {
		return weeklyPay;
	}
	public void setWeeklyPay(double weeklyPay) {
		this.weeklyPay = weeklyPay;
	}

	private static double MarketValue = 0.0;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getGamesWon() {
		return GamesWon;
	}
	
	public void setGamesWon(int gamesWon) {
		GamesWon = gamesWon;
	}
	
	public int getGamesLost() {
		return GamesLost;
	}
	
	public void setGamesLost(int gamesLost) {
		GamesLost = gamesLost;
	}
	
	public static double getMarketValue() {
		return MarketValue;
	}
	
	public static void setMarketValue(double marketValue) {
		MarketValue = marketValue;
	}
	
	public SoccerPlayer() {

	}
	
	public SoccerPlayer(String Name, int GamesWon, int GamesLost, double weeklyPay){
		this.Name = Name;
		this. GamesWon = GamesWon;
		this.GamesLost = GamesLost;
		this.weeklyPay = weeklyPay;
		MarketValue += (weeklyPay)*52.0;
		
	}
	
	public SoccerPlayer(SoccerPlayer soccerplayer){
		this.Name = soccerplayer.Name;
		this.GamesWon = soccerplayer.GamesWon;
		this.GamesLost = soccerplayer.GamesLost;
		this.weeklyPay = soccerplayer.weeklyPay;
	}
	
 

}
