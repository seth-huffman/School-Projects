/*-------------------------------------------------------------
// AUTHOR: Seth Huffman
// FILENAME: Lab2.java
// SPECIFICATION: You will have to write a Java program that asks the user to enter two strings, firstname and
//    lastname, and concatenates the strings to make a full name. The program will use methods of class
//    “String” like length () and toUpperCase() on the full name and compare strings by equals() method
and if-else statements.
// FOR: CSE 110 - Lab #2
// TIME SPENT: Started 8:50 3/14
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        // Variables
        String firstName = "";
        String lastName = "";
        String fullName = "";
        String title1 = new String("cse110");
        String title2 = "cse110";
        String compareSymbol = "";
        String compareString = "";
        Scanner scan = new Scanner(System.in);

        // Inputs
        System.out.print("Please enter first name: ");
        firstName = scan.nextLine();
        System.out.print("Please enter last name: ");
        lastName = scan.nextLine();

        // Logic
        fullName = firstName + " " + lastName;       

        if ( title1 == title2 ) {
            compareSymbol = "";
        } else {
            compareSymbol = "does NOT";
        }
        if ( title1.equals(title2) ) { 
            compareString = "";
        } else {
            compareString = "does NOT";
        }

        //Outputs
        System.out.println("Full name (in capitals): " + fullName.toUpperCase());
        System.out.println("Length of full name: " + fullName.length());
        System.out.println("String comparison using \"==\" sign " + compareSymbol + " work");
        System.out.println("String comparison using \"equals\" method " + compareString + " work");

    }
}


// Please enter first name: wesley
// Please enter last name: so
// Full name (in capitals): WESLEY SO
// Length of full name: 9
// String comparison using "==" sign does NOT work
// String comparison using "equals" method works