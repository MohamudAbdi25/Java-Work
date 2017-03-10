
public class TestScores
{
//makes variables
private int[] scores;
private int average;
//It accepts an array of test scores as 
public TestScores(int[] testScores) throws
IllegalArgumentException
{
//Call the methods
average = validScore(testScores);
scores = testScores;
}
//Method definition of validScore: This method is used
//to tests each score
private int validScore(int[] testScores)
{
int avg = 0;
//If any test score in the array is negative or
//greater than 100 then class will throw an
//IllegalArgumentException
for(int i =0; i < testScores.length; i++)
{
if(testScores[i] < 0 || testScores[i] > 100)
throw new IllegalArgumentException( "Score for test " + ( i +1) + " is out of range.\nNumber cannot be less than 0 and greater than 100" );
avg += testScores [ i ];
}
return (avg / testScores.length);
}
//returns the average score
public int getAvg()
{
return average;
}
}




