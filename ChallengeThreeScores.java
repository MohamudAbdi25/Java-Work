package chapter4;

public class ChallengeThreeScores {
//variable for score one
int TestScoreOne;
//variable for score two
int TestScoreTwo;
//variable for score three
int TestScoreThree;
//variable for score grade letter
int GradeLetter;

// getter for score one
	public int getTestScoreOne() {
	return TestScoreOne;
}
// setter for score one
public void setTestScoreOne(int testScoreOne) {
	TestScoreOne = testScoreOne;
}

//getter for score two
public int getTestScoreTwo() {
	return TestScoreTwo;
}

//setter for score two
public void setTestScoreTwo(int testScoreTwo) {
	TestScoreTwo = testScoreTwo;
}

//getter for score three
public int getTestScoreThree() {
	return TestScoreThree;
}

// setter for score three
public void setTestScoreThree(int testScoreThree) {
	TestScoreThree = testScoreThree;
}
// getter for score for average score
public int getGetAverageScore(){
	return (TestScoreOne + TestScoreTwo + TestScoreThree) /3;
	
};
// method for getting scores 
public void setGradeLetter( int grade){
	if (grade < 60){
		System.out.println("F");	}
	else if (grade == 60 ){
		System.out.println("D");	
		}
	else if (grade == 61 ){
		System.out.println("D");
		}
	else if (grade == 62 ){
		System.out.println("D");	
		}
	else if (grade == 63 ){
		System.out.println("D");	
		}
	else if (grade == 64 ){
		System.out.println("D");	
		}
	else if (grade== 65){
		System.out.println("D");	
		}
	else if (grade == 66 ){
		System.out.println("D");	
		}
	else if (grade == 67 ){
		System.out.println("D");	
		}
	else if (grade == 68 ){
		System.out.println("D");	
		}
	else if (grade == 69 ){
		System.out.println("D");	
		}
	else if (grade == 70 ){
		System.out.println("C");	
		}
	else if (grade == 71 ){
		System.out.println("C");
		}
	else if (grade == 72 ){
		System.out.println("C");	
		}
	else if (grade == 73 ){
		System.out.println("C");	
		}
	else if (grade == 74 ){
		System.out.println("C");	
		}
	else if (grade == 75){
		System.out.println("C");	
		}
	else if (grade == 76 ){
		System.out.println("C");	
		}
	else if (grade == 77 ){
		System.out.println("C");	
		}
	else if (grade == 78 ){
		System.out.println("C");	
		}
	else if (grade == 79 ){
		System.out.println("C");	
		}
	else if (grade == 80 ){
		System.out.println("B");	
		}
	else if (grade== 81 ){
		System.out.println("B");
		}
	else if (grade == 82 ){
		System.out.println("B");	
		}
	else if (grade  == 83 ){
		System.out.println("B");	
		}
	else if (grade  == 84 ){
		System.out.println("B");	
		}
	else if (grade  == 85){
		System.out.println("B");	
		}
	else if (grade  == 86 ){
		System.out.println("B");	
		}
	else if (grade  == 87 ){
		System.out.println("B");	
		}
	else if (grade  == 88 ){
		System.out.println("B");	
		}
	else if (grade  == 89 ){
		System.out.println("B");}
	else {
		System.out.println("A");}
	System.exit(0);

	}


	public ChallengeThreeScores() {
		// TODO Auto-generated constructor stub
	}

}
