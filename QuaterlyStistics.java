
public class QuaterlyStistics {
	final int ROW_SIZE = 4; //4 Quarters
 	final int COL_SIZE = 6; // 6 Divisions;
	private double salesFigure[][];
 	
  public  QuaterlyStistics(){
	  this.salesFigure = new double[ROW_SIZE][COL_SIZE];
  }		

	
	public void setSalesFigures(int row, int col, double sales){
		this.salesFigure[row][col]= sales;
	}


	public double[][] getSalesFigure() {
		return salesFigure;
	}


	public void setSalesFigure(double[][] salesFigure) {
		this.salesFigure = salesFigure;
	}
	
	

}
