import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FruitLauncher {

	public static void main(String[] args) throws FileNotFoundException {
		String userInput = "";
		//Instantiate a fruit object
		Fruit fruit = new Fruit();
		String fileName = "c:\\users\\moham\\desktop\\";
		
		
		fileName += JOptionPane.showInputDialog("Enter a file name: ");
		PrintWriter output = new PrintWriter(fileName +".txt");
		
		
		
		
		for(int i = 0; i < fruit.getFruit().length; i++){
		// Get the guess from the user which fruit is in the box
		userInput = JOptionPane.showInputDialog("Guess The Fruit That is in Box Number "+
		(i + 1));
		// Set the users guess by passing i for the index
		// and userInput for the fruit
		fruit.setGuess(userInput,i);
		
		output.println("Box " + (i + 1)  + "contains: " + fruit.getFruit()[i]);
		output.println("Users Guess: " + fruit.getGuess()[i]);
			
		}
		
		//Calculate the results
		fruit.calcResult();
		JOptionPane.showMessageDialog(null, fruit);
		System.out.println(fruit);

		output.close();
		System.exit(0);
	}

}
