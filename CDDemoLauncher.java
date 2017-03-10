import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CDDemoLauncher {
	
	public static void main(String[] args) throws FileNotFoundException  {
		CD album1 = new CD("Bat Out Of Hell","Meatloaf", 12.99);
		CD album2 = new CD("Bat Out Of Hell II","Meatloaf", 15.99);
		CD album3 = new CD("Black","Metallica", 14.99);
		
		CDCollection cdCollection = new CDCollection(album1);
		CDCollection cdCollection2 = new CDCollection(album2);
		CDCollection cdCollection3 = new CDCollection(album3);
		System.out.println(cdCollection + "\n\n" + cdCollection2 +
				"\n\n" + cdCollection3);
		System.out.println("\nThe total number of cds after purchasing two boxes is: " + 
				CD.getTotal(12, 15));
		System.out.println("\nThe total number of cds after purchasing two boxes " +
				"and adding it to the total is: " + 
				CD.getTotal(45, 15, 10));
		
		System.exit(0);
		System.out.println(CD.getTotalValue());
		System.out.println("Welcom to the CD Collection");
		String userInput;
		String fileName = "c:\\users\\moham\\desktop\\cdCollection.txt";
	    Scanner keyboard = new Scanner(System.in);
	    int cdCount = 0;
	    PrintWriter output = new PrintWriter(fileName);
	    
	    
	    for(int i = 0; i < 5; i++){
	    	System.out.println("Enter a name of a cd: ");
	    	userInput = keyboard.nextLine();
	        output.println(userInput);
	    	++cdCount;
		
	 } 
	 output.println("Total Number of CD's: "+ cdCount);
	 keyboard.close();
	 output.close();

	}

}
