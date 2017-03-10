package chapter4;
import javax.swing.JOptionPane;
public class ChallengeThreeScoresLauncher {

	public static void main(String[] args) {
	// gets score one
	int ScoreOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the first Score"));
	// gets score two
	int ScoreTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the second Score"));
	// gets score three
	int ScoreThree = Integer.parseInt(JOptionPane.showInputDialog("Enter the third Score"));
	
	ChallengeThreeScores input = new ChallengeThreeScores();
	//sets score one
	input.setTestScoreOne(ScoreOne);
	//sets score two
	input.setTestScoreTwo(ScoreTwo);
	//sets score three
	input.setTestScoreThree(ScoreThree);
	int score =((ScoreOne+ScoreTwo+ScoreThree)/3);
	
   
	
	
	System.out.println("Test Score Average "+"\t\t"+ "Letter Grade");
	System.out.println("__________________________________________________"); 
	//prints the average score and grade letter
	System.out.print("\t" + input.getGetAverageScore() + "\t\t\t      " );  input.setGradeLetter(score); 
		// TODO Auto-generated method stub

	}

}
