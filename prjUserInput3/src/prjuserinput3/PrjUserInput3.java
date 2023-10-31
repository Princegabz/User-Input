package prjuserinput3;
import java.util.Scanner;

public class PrjUserInput3 {

   
    public static void main(String[] args) 
    {
        //DECLARING VARIABLES
        Scanner scan = new Scanner(System.in);
        String strStudentNumber = "", strName="";
        double dblTest = 0.0, dblAssignment= 0.0,
        dblExam = 0.0, dblAverage;
        
        //PROMPTING THE USER
        
        System.out.print("Please enter the student number:");
        strStudentNumber = scan.nextLine();
        
        System.out.print("Please enter the student name:");
        strName = scan.nextLine();
        
        System.out.print("Please enter the test result:");
        dblTest = scan.nextDouble();
        
        System.out.print("Please enter the Assignment result:");
        dblAssignment = scan.nextDouble();
        
        System.out.print("Please enter the Exam result:");
        dblExam = scan.nextDouble();
        
        dblAverage = (dblTest + dblAssignment + dblExam )/3;
        
        //PRINTING THE USER OUTPUT
        
        System.out.println("STUDENT ACADEMIC REPORT");
        System.out.println("------------------------------");
        System.out.println("STUDENT NUMBER:\t" + strStudentNumber);
        System.out.println("STUDENT NAME:\t" + strName);
        System.out.println("TEST RESULT:\t" +  dblTest+"%"); 
        System.out.println("ASSIGNMENT RESULT:\t" + dblAssignment+"%"); 
        System.out.println("EXAM RESULT:\t" + dblExam+"%");
        System.out.println("AVERAGE RESULT:\t" + dblAverage+"%");
        System.out.println("------------------------------");
    }
    
}
