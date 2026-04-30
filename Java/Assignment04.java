// Class       : CSE 110 / Online
// Assignment  : Assignment 4
// Author      : Seth Huffman & swhuffma
// Description : Game that creates a random  number the user guesses

import java.util.Random;
import java.util.Scanner;

public class Assignment04 {

    public static void main(String[] args) {

        /////////////////////////////////////
        // Variables
        /////////////////////////////////////
        Random randomNum = new Random();
        int attempt = 1;
        int matchedNum = 0;
        int maxNum = 9999;
        String playAgain;
        int randomNumWithMax = randomNum.nextInt(maxNum); 
        int userGuess;
        Scanner keyboard = new Scanner(System.in);

        /////////////////////////////////////
        // Logic
        /////////////////////////////////////
        do {

            if (matchedNum == 1) {
                matchedNum = 0;
            }

            System.out.println("----- MASTERMIND -----");
            System.out.println("Guess the 4 digit number!");

                while (matchedNum != 4) {
                    System.out.println("Guess " + attempt + " : ");
                    userGuess = keyboard.nextInt();

                    // Random number broken down into four variables
                    int randomNumOne = Integer.parseInt(Integer.toString(randomNumWithMax).substring(0, 1));
                    int randomNumTwo = Integer.parseInt(Integer.toString(randomNumWithMax).substring(1, 2));
                    int randomNumThree = Integer.parseInt(Integer.toString(randomNumWithMax).substring(2, 3));
                    int randomNumFour = Integer.parseInt(Integer.toString(randomNumWithMax).substring(3, 4));
                    
                    // Users guess broken down into four variables
                    int userGuessOne = Integer.parseInt(Integer.toString(userGuess).substring(0, 1));
                    int userGuessTwo = Integer.parseInt(Integer.toString(userGuess).substring(1, 2));
                    int userGuessThree = Integer.parseInt(Integer.toString(userGuess).substring(2, 3));
                    int userGuessFour = Integer.parseInt(Integer.toString(userGuess).substring(3, 4));

                    // Compares users first digit to all random numbers
                    if (userGuessOne == randomNumOne) {
                        matchedNum += 1;
                    } else if (userGuessOne == randomNumTwo) {
                        matchedNum += 1;
                    } else if (userGuessOne == randomNumThree) {
                        matchedNum += 1;
                    } else if (userGuessOne == randomNumFour) {
                        matchedNum += 1;
                    }

                    // Compares users second digit to all random numbers
                    if (userGuessTwo == randomNumOne) {
                        matchedNum += 1;
                    } else if (userGuessTwo == randomNumTwo) {
                        matchedNum += 1;
                    } else if (userGuessTwo == randomNumThree) {
                        matchedNum += 1;
                    } else if (userGuessTwo == randomNumFour) {
                        matchedNum += 1;
                    }

                    // Compares users third digit to all random numbers
                    if (userGuessThree == randomNumOne) {
                        matchedNum += 1;
                    } else if (userGuessThree == randomNumTwo) {
                        matchedNum += 1;
                    } else if (userGuessThree == randomNumThree) {
                        matchedNum += 1;
                    } else if (userGuessThree == randomNumFour) {
                        matchedNum += 1;
                    }

                    // Compares users four digit to all random numbers
                    if (userGuessFour == randomNumOne) {
                        matchedNum += 1;
                    } else if (userGuessFour == randomNumTwo) {
                        matchedNum += 1;
                    } else if (userGuessFour == randomNumThree) {
                        matchedNum += 1;
                    } else if (userGuessFour == randomNumFour) {
                        matchedNum += 1;
                    }

                    System.out.println("You matched " + matchedNum);

                    attempt++;
                }
            System.out.println("Congratulations! You guessed the right number in " + matchedNum + " guesses.");
            System.out.println("Would you like to play again (yes/no)?");
            playAgain = keyboard.nextLine();
        }
        while (!playAgain.equals("no"));
    }
}