import java.text.DecimalFormat;

public class SoccerPlayerCollection {
 private SoccerPlayer soccerplayer;
	public SoccerPlayerCollection() {
	
	}
public SoccerPlayerCollection(SoccerPlayer soccerplayer){
	this.soccerplayer = new SoccerPlayer(soccerplayer);
}
	
	public SoccerPlayer getSoccerPlayer(){
		return new SoccerPlayer(soccerplayer);
	}
	
	public void setSoccerPlayer(SoccerPlayer soccerplayer){
		this.soccerplayer = new SoccerPlayer(soccerplayer);
	}
	
	public void getSoccerPlayerCollection(){
		
	}
	
	public String toString(){
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		String str; 
		str = "Name:  " + soccerplayer.getName() + "\n" +
	             "Games Won: " + soccerplayer.getGamesWon() + "\n"+
	              "Games Lost: " + soccerplayer.getGamesLost()+"\n"+
				  "Weekly Pay: " +formatter.format(soccerplayer.getWeeklyPay()) + "\n" + 
	              "League Value: " + formatter.format(SoccerPlayer.getMarketValue());
		return str;
	}
	
}
