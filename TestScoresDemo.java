import java.util.Scanner;

public class TestScoresDemo
{

public static void main(String[] args)
{
//asks the user for input
int[] testSc = getArray(readInput("How many test scores would you like to enter:"));
// try-catch block
try
{
TestScores ts = new TestScores(testSc);
System.out.println("\nAverage of the test scores:" + ts.getAvg());
} catch (IllegalArgumentException e)
{
System. out .println( "You entered an invalid test score.\n" + e .getMessage());
}
}


//method asks //and reads the test scores from the user
public static int[] getArray(int intIn)
{
int[] scores = new int[intIn];
for (int i = 0; i < scores.length; i++)
{
scores[i] = readInput("Enter score for test "
+ (i + 1) + ": ");
}
return scores;
}
// Method definition of readInput: This method prints
// the string passed in then gets input from the user
public static int readInput(String stringIn)
{
// Create a Scanner class object
Scanner scn = new Scanner(System.in);
System.out.print(stringIn);
return scn.nextInt();
}
}


