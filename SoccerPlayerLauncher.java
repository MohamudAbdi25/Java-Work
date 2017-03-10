
public class SoccerPlayerLauncher {

	public static void main(String[] args) {
    SoccerPlayer player1 = new SoccerPlayer("Paul Pogba",50,12,250000.00);
    SoccerPlayer player2 = new SoccerPlayer("Neymar",80,25,250000.00);
    SoccerPlayer player3 = new SoccerPlayer("Cristiano Ronaldo",90,5,365000.00);
    SoccerPlayer player4 = new SoccerPlayer("Lionel Messi",90,6,256000.00);
	
    SoccerPlayerCollection soccerplayercollection = new SoccerPlayerCollection(player1);
	SoccerPlayerCollection soccerplayercollection2 = new SoccerPlayerCollection(player2);
	SoccerPlayerCollection soccerplayercollection3 = new SoccerPlayerCollection(player3);
	SoccerPlayerCollection soccerplayercollection4 = new SoccerPlayerCollection(player4);
	System.out.println(soccerplayercollection + "\n\n" + soccerplayercollection2 + "\n\n" +
			soccerplayercollection3 + "\n\n"+ soccerplayercollection4);
	}

}
