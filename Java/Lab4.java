/*-------------------------------------------------------------
// AUTHOR: Seth Huffman
// FILENAME: Lab4.java
// SPECIFICATION: your own description of the program.
// FOR: CSE 110- Lab #4
// TIME SPENT: Mar 23 9:03
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {

        /////////////////////////////////////////////////
        // Variable
        /////////////////////////////////////////////////
        int number;
        int option;
        Scanner scan = new Scanner(System.in);

        /////////////////////////////////////////////////
        // Logic
        /////////////////////////////////////////////////
        do {
            displayMenu();
            option = scan.nextInt();

            switch(option) {
                case 1:
                    System.out.print("Enter a number: ");
                    number = scan.nextInt();
                    System.out.println("The sum of 1 to " + number + " is " + summation(number));
                  break;
                case 2:
                    System.out.print("Enter a number: ");
                    number = scan.nextInt();
                    System.out.println("The factorial of " + number + " is " + factorial(number));
                  break;
                case 3:
                    System.out.print("Enter a number: ");
                    number = scan.nextInt();
                    System.out.println("The leftmost digit of " + number + " is " + leftNumber(number));
                  break;
                default:
                  System.out.println("Bye");
                  break;
              }
        } while (option <= 3);
    }

    /////////////////////////////////////////////////
    // Method
    /////////////////////////////////////////////////
    static int summation(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        } 

        return sum;
    }

    static int factorial(int num) {
        int sum = 1;
        
        for(int i = 1; i <= num; ++i)
        {
            sum *= i;
        }

        return sum;
    }

    static int leftNumber(int num) {
        while (num >= 10) 
            num /= 10;
        return num;
    }

    // Output
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }

}