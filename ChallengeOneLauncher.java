import javax.swing.JOptionPane;

public class ChallengeOneLauncher {

	public static void main(String[] args) {
		// gets number from the user
		int input = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		ChallengeOne number = new ChallengeOne() ;
		// sets user input
		number.setUserInput(input);
		// prints the number entered and counts to the number
		System.out.println("Count to: "+ number.getUserInput());
		int sum = 0;
		for(int i = 0;i <= 5; i++){
		sum=sum+i;
		System.out.println("Counting:   "+sum);
	
	
		}
		// TODO Auto-generated method stub

	}

}
