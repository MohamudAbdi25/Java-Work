import javax.swing.JOptionPane;

public abstract class QuaterlySatictsLauncher {

	public static void main(String[] args) {
	final int ROW_SIZE = 4; //4 Quarters
	final int COL_SIZE = 6; // 6 Divisions;
	 double salesFigure = 0;
 	QuaterlyStistics report = new QuaterlyStistics();
 	
 	for(int i = 0; i < ROW_SIZE; i ++){
 		for(int k = 0; k < COL_SIZE; k++){
 			do{
 				salesFigure = Double.parseDouble(JOptionPane.showInputDialog(
 						"Enter a sales figure for Qtr " +
 						(i +1) + "And Div " + (k+1)));
 		//Show a friendly message if sales equal zero
 		if(salesFigure < 0 ){
 		JOptionPane.showMessageDialog(
 					null, "Please enter a positive number");
 			
 		}
 			}while(salesFigure < 0);
 			report.setSalesFigures(i, k, salesFigure);
 			
 		}//End for inner loop
 	}//End outer for loop
 	System.out.println("Quarter\tDiv1\tDiv2\tDiv3\tDiv4\tDiv5\tDiv6"+"\n"+"-----------------------------------------------------3");
 	for(int row = 0; row < ROW_SIZE; row++){
 		System.out.print("Qtr"+( row + 1) + "\t36"
 				+ "3");
 		for(int col = 0; col < COL_SIZE; col++){
 			System.out.print(
 					      report.getSalesFigure()[row][col]+"\t");
 		}
 	System.out.println();
 	}
	System.exit(0);
 	
 	
 	
 	

	}

}
