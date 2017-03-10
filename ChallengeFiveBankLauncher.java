package chapter4;

import javax.swing.JOptionPane;

public class ChallengeFiveBankLauncher {

	public static void main(String[] args) {
double number = Double.parseDouble(JOptionPane.showInputDialog("Please enter your balance"));
double ChecksWritten = Double.parseDouble(JOptionPane.showInputDialog("How many checks did you write"));
ChallengeFiveBank user1 = new ChallengeFiveBank();
user1.setBallance(number);
user1.setCharges(ChecksWritten);
double totalCharge = user1.getCharges()+ user1.getBallance();

System.out.println("Balance: $"+ number);
System.out.println("Monthly Charge: $"+user1.getCharges());
System.out.println("Extra Fees: $" + user1.getBallance());
System.out.println("Total Charges: $" + totalCharge);
		// TODO Auto-generated method stub

	}

}
