/*-------------------------------------------------------------
// AUTHOR: Seth Huffman
// FILENAME: Lab6.java
// SPECIFICATION: Averaging student grades
// FOR: CSE 110- Lab #6
// TIME SPENT: April 3 7:00 PM
//-----------------------------------------------------------*/
import java.util.Scanner;
import java.util.Arrays;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents;

        //////////////////////////////
        // Inputs & Logic
        //////////////////////////////
        System.out.println("How many students do you have? ");
        numStudents = scanner.nextInt();

        int[] studentGroups = new int[numStudents];
        double[] studentGrades = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("[Group #] and [Grade] for Entry " + (i + 1));
            studentGroups[i] = scanner.nextInt();
            studentGrades[i] = scanner.nextDouble();
        }

        //////////////////////////////
        // Outputs
        //////////////////////////////
        System.out.println("==== List of Student Records =====");

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Group " + studentGroups[i] + " - " + studentGrades[i] + " Points");
        }

       scanner.close();
    }
}