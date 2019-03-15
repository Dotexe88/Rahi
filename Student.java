// ************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
// ************************************************************
import java.util.Scanner;
public class Student
{

   String studentName;
   double test1,test2;
   double avg; 
   
   public Student(String studentName,double test1, double test2)
   {
      studentName = studentName;
      Test1 = Test1;
      Test2 = Test2;
   }
   
   // ---------------------------------------------
   //inputGrades: prompt for and read in student's grades for test1 & test2.
   //Use name in prompts, e.g., "Enter's Joe's score for test1".
   // ---------------------------------------------
   public void inputGrades()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter "+studentName+" first test score");
      Test1 = scan.nextInt();
      System.out.println("Enter "+studentName+" second test score");
      Test2 = scan.nextInt();
   }
   // ---------------------------------------------
   //getAverage: compute and return the student's test average
   // ---------------------------------------------
   public double getAverage(int Test1, int Test2)
   {
      int avg = (Test1+Test2)/2;
      return avg;
   }
   System.out.println(Test1);
   // ---------------------------------------------
   //getName: print the student's name
   // ---------------------------------------------
   //add header for printName
   public getName();
   {
      return studentName;
   }
}