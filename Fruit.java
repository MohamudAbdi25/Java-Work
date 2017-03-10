import java.text.DecimalFormat;

public class Fruit {
	private int[] box = {1,2,3,4,5,6,7,8,9,10};
	private String[] fruit = {"pear","Banana","Apple","Pineapple","Mango","Orange","Kiwi","Coconut",
			"Watermelon","Strawberry"};
	private String[] guess = new String[10];
	private boolean[]  result = new boolean[10];
	private int numCorrect = 0;
	private int numIncorrect = 0;
	public int[] getBox() {
		return box;
	}
	public void setBox(int[] box) {
		this.box = box;
	}
	public String[] getFruit() {
		return fruit;
	}
	public void setFruit(String[] fruit) {
		this.fruit = fruit;
	}
	public String[] getGuess() {
		return guess;
	}
	public void setGuess(String[] guess) {
		this.guess = guess;
	}
	public void setGuess(String guess, int index){
	 this.guess[index] = guess;
	}
	
	public boolean[] getResult() {
		return result;
	}
	public void setResult(boolean[] result) {
		this.result = result;
	}
	public Fruit() {
	
	
	}
	//Determines whether or not user's 
	//guess is correct and stores result in 
	//the boolean array
	
 public void calcResult(){
		for(int i = 0; i < this.fruit.length; i++ ){
		if(this.guess[i].equalsIgnoreCase(this.fruit[i])){	
			this.result[i] = true ;
			this.numCorrect++;
		}else{
		this.result[i]= false;
		this.numIncorrect++;
		}	
	}
}

public String getPercent(){
	DecimalFormat format = new DecimalFormat("%0");
	 return format.format((double)this.numCorrect / (double)this.fruit.length);	

}
public String toString(){
	return "Fruit Guessing Game"+ "\r\n" +
         "*************************************************\r\n"+
			"Number of correct guesses: " + this.getNumCorrect() + "\r\n"+
            "Number of incorrect guesses" + this.getNumIncorrect() + "\r\n"+
			"Percent Correct: "+ this.getPercent();
}
public int getNumCorrect() {
	return numCorrect;
}
public int getNumIncorrect() {
	return numIncorrect;
}
}
