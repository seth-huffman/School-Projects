/*-------------------------------------------------------------
// AUTHOR: Seth Huffman
// FILENAME: Lab3.java
// SPECIFICATION: Your task is to design a program which takes 3 user inputs as homework grade, midterm exam grade, and final exam grade.
// FOR: CSE 110- Lab #3
// TIME SPENT: Started 8:00 p.m. Mar 17
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        
        // Variables
        int homeworkGrade = 0;
        double finalGrade = 0 ;
        int midtermGrade = 0;
        String passFail = "";

        int i = 0;

        Scanner scanner = new Scanner(System.in);



        // Logic
        while (i < 3) {
            if (i == 0) {
                System.out.print("Enter your HOMEWORK grade: ");
                homeworkGrade = scanner.nextInt();

                if (homeworkGrade >= 0 && homeworkGrade <= 100) {
                    i++;
                } else {
                    System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
                }
            }

            if (i == 1) {
                System.out.println("Enter your MIDTERM EXAM grade: ");
                midtermGrade = scanner.nextInt();

                if (midtermGrade >= 0 && midtermGrade <= 100) {
                    i++;
                } else {
                    System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100].");
                }
            }

            if (i == 2) {
                System.out.println("Enter your FINAL EXAM grade: ");
                finalGrade = scanner.nextInt();

                if (finalGrade >= 0 && finalGrade <= 200) {
                    i++;
                } else {
                    System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 200].");
                }
            }

        }

        double weightedTotal = (finalGrade / 200 * 50) + (midtermGrade * 0.25) + (homeworkGrade * 0.25);


        if (weightedTotal >= 50) {
            passFail = "PASSED";
        } else {
            passFail = "FAILED";
        }

        scanner.close();



        //Outputs
        System.out.println("[INFO] Student's Weighted Total is " + weightedTotal);
        System.out.println("[INFO] Student " + passFail + " the class");

    }
}







