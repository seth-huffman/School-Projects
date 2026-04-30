/*-------------------------------------------------------------
// AUTHOR: Teaching Assistant in CSE110
// FILENAME: AutoGrader.java
// SPECIFICATION: This is your test driver for Lab7. 
// Please do NOT touch the makeReport method. Do all your changes only in the main method.
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sFirstname, sLastname, sAsuID;
        double sGrade;
        String pName, pDesc, pFname;

        // Read some input data
        println("The student's first name?");
        sFirstname = scan.nextLine();   // Teaching
        println("The student's last name?");
        sLastname = scan.nextLine();    // Assistant
        println("The student's ASU ID?");
        sAsuID = scan.nextLine();       // 10291029
        println("Program name?");
        pName = scan.nextLine();        // CSE110 Lab 7
        println("Program desc?");
        pDesc = scan.nextLine();        // Custom classes/data types for the AutoGrader project.
        println("Program filename?");
        pFname = scan.nextLine();       // Lab7.java
        println("Program grade?");
        sGrade = scan.nextDouble();     // 9        //scan.nextLine();
        println(""); scan.close();

        Student student1 = new Student(sFirstname, sLastname, sAsuID);
        System.out.println("Making a student record\n...[" + student1 + "]");

        // Use the setGrade setter to set student1's grade
        student1.setGrade(sGrade);

        Program program1 = new Program(pName, pDesc, pFname, student1);
        System.out.println("Making a program record\n...[" + program1 + "]");

        // Invoke makeReport to show the report of student1
        makeReport(program1);
    }

    private static void makeReport(Program program) {
        println("\n========== Program Submission Detail ==========");
        pprint("Student", program.getAuthor().getFullName());   // Student : Teaching Assistant
        pprint("ASU ID", program.getAuthor().getAsuID());       // ASU ID : 10291029
        pprint("Grade", "" + program.getAuthor().getGrade());   // Grade : 9.0
        println("");
        pprint("Program", program.getProgramName());            // Program : CSE110 Lab 7
        pprint("Filename", program.getFileName());              // Filename : Lab7.java
        pprint("Description", program.getDescription());        // Description : Custom classes/data types for the AutoGrader project.
        pprint("Datetime", program.getCreatedDate());           // Datetime : 2019-02-23T15:37:36.188587
    }

    private static void pprint(String key, String value) {
        println(String.format("%-12s: %-10s", key, value));
    }

    private static void println(String s) {
        System.out.println(s);
    }
}





