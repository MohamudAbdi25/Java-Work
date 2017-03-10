 // Fig. 7.15: GradeBookTest.java
 // Creates GradeBook object using an array of grades.

 public class GradeBookTest
 {
 // main method begins program execution
 public static void main( String args[] )
 {
 // array of student grades 
 int gradesArray[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

 GradeBook myGradeBook = new GradeBook(
 "Grades", gradesArray );
 myGradeBook.displayMessage();
 myGradeBook.processGrades();
 } // end main
 } // end class GradeBookTest
