//-------------------------------------------------------------
// AUTHOR: Seth Huffman 
// FILENAME:Lab5.java
// SPECIFICATION:
// FOR:
// TIME SPENT:Started March 27 9:52 A.M.
//-----------------------------------------------------------

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        //////////////////////////////////////////////
        // VARIABLES
        //////////////////////////////////////////////
        final char SIDE_SYMB = '-';
        final char MID_SYMB = '*';
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        char choice = ' ';
        int numSymbols = -1, sideWidth = -1, midWidth = -1;

        //////////////////////////////////////////////
        // LOGIC
        //////////////////////////////////////////////
        do {
            displayMenu();
            inputStr = scanner.nextLine();
            if (inputStr.length() > 0) {
                choice = inputStr.charAt(0);
            } else {
                choice = ' ';
            }

            switch (choice) {
            case 'r':
                    System.out.println("Width of the sides?");
                    sideWidth = scanner.nextInt();
                    System.out.println("Width of the middle?");
                    midWidth = scanner.nextInt();
                    scanner.nextLine();  // Flush junk newline symbols
            
                    System.out.println();
                    System.out.println(buildRow(SIDE_SYMB, sideWidth, MID_SYMB, midWidth));
                break;
            case 'p':
                System.out.println("Number of symbols on the lowest layer?");
                numSymbols = scanner.nextInt(); 
                scanner.nextLine();  // Flush junk newline symbols
        
                System.out.println();
                System.out.println(buildPyramid(SIDE_SYMB, MID_SYMB, numSymbols));
                break;
            case 'd':
                System.out.println("Number of symbols on the middle layer?");
                numSymbols = scanner.nextInt();
                scanner.nextLine();  // Flush junk newline symbols
        
                System.out.println();
                System.out.println(buildDiamondTop(MID_SYMB, ' ', numSymbols));
                break;
            case 'q':
                System.out.println("Bye");
                break;   
            default:
                System.out.println("Please choose a valid option from the menu.");
            break;
            }
            System.out.println();
        } while (choice != 'q');
        
        scanner.close();
    }

    //////////////////////////////////////////////
    // METHODS
    //////////////////////////////////////////////
    private static String buildRow(char sideSymb, int sideWidth, char midSymb, int midWidth) {
        String result = "";
        
        for (int i = 0; i < sideWidth; i++) {
            result += sideSymb;
        }
        for (int i = 0; i < midWidth; i++) {
            result += midSymb;
        }
        for (int i = 0; i < sideWidth; i++) {
            result += sideSymb;
        }

        return result;
    }

    // Pyramid Build
    private static String buildPyramid(char sideSymb, char midSymb, int numSymbols) {
        String result = "";

        int totalSymbOneRow = numSymbols;

        for (int numStars = 1; numStars <= numSymbols; numStars += 2) {
            int numDashed = (totalSymbOneRow - numStars) / 2;
            String row = buildRow(sideSymb, numDashed, midSymb, numStars);
            result += row + "\n";
        }

        return result;
    }

    // Diamond Build Top
    private static String buildDiamondTop(char sideSymb, char midSymb, int numSymbols) {

        String result = "";

        int totalSymbOneRow = numSymbols;

        for (int numStars = 1; numStars <= numSymbols; numStars += 2) {
            int numDashed = (totalSymbOneRow - numStars) / 2;
            String row = buildRow(sideSymb, numDashed, midSymb, numStars);
            result += row + "\n";
        }

        for (int numStars = 1; numStars <= 5; numStars++) {
            int numSpace = totalSymbOneRow - (numStars * 2); 
            String row = buildRow(sideSymb, numStars, midSymb, numSpace);
            result += row + "\n";
        }
        
        return result;
    }

    // INPUTS
    private static void displayMenu() {
        System.out.println("Please choose one pattern from the list:");
        System.out.println("r) Row");
        System.out.println("p) Pyramid");
        System.out.println("d) Shallow diamond");
        System.out.println("q) Quit");
    }

}













