// CSE 110     : CSE 110 / Online
// Assignment  : Assignment05.java
// Author      : Seth Huffman & swhuffma
// Description : Methods

public class Assignment05 {

    public static void main(String[] args) {
        displayGreeting(); 
        displayText("test");
        printTotal(1,2,3);
        int total = getTotal(1,2,3);
        System.out.println(total);
        double average= getAverage(1,2,3);
        System.out.println(average);

        average= averageLength("test","test21", "testtest"); //64.
        System.out.println(average);

        int shortest = lengthOfShortest("test","test21");
        System.out.println(shortest);
        String stars=stringOfStars("test");
        System.out.println(stars);
        stars=maxStringOfStars("test","test21");
        System.out.println(stars);
        stars=midStringOfStars("test","test21", "testtest");
        System.out.println(stars);

    }
    
    /////////////////////////////////////////////////
    // Logic
    /////////////////////////////////////////////////

    // 1
    static void displayGreeting() {
        System.out.println("Hello, and welcome!");
    }
    
    // 2
    static void displayText(String text) {
        System.out.println(text);
    }
    
    // 3
    static void printTotal(int valueOne, int valueTwo, int valueThree) {
        var sum = valueOne + valueTwo + valueThree;
        System.out.println(sum);
    }
    
    // 4
    static int getTotal(int valueOne, int textTwo, int valueThree) {
        var sum = valueOne + textTwo + valueThree;
        return sum;
    }
    
    // 5
    static double getAverage(int valueOne, int valueTwo, int valueThree) {
        double sum = (valueOne * valueTwo * valueThree) / 3;
        return sum;
    }

    // 6
    static double averageLength(String textOne, String textTwo, String textThree) {
        double sum = (textOne.length() + textTwo.length() + textThree.length());///issues
        double average = sum / 3;
        return average;
    }
    
    // 7
    static int lengthOfShortest(String textOne, String textTwo) {
        if (textOne.length() < textTwo.length()) {///issues
            return textOne.length();
        } else {
            return textTwo.length();
        }
    }
    
    // 8
    static String stringOfStars(String text) {
        String starText = "";
        
        for (int i = 0; i < text.length(); i++ ) {
            starText += "*";
        }

        return starText;
    }
    
    // 9
    static String maxStringOfStars(String textOne, String textTwo) {
        int longestString;
        String starText = "";

        if (textOne.length() > textTwo.length()) {
            longestString = textOne.length();
        } else {
            longestString = textTwo.length();
        }

        for (int i = 0; i < longestString; i++ ) {
            starText += "*";
        }

        return starText;
    }

    // 10
    static String midStringOfStars(String textOne, String textTwo, String textThree) {
        int longestString;
        int middleString;
        int shortestString;
        String starText = "";

        // Finds Longest String Length 
        if (textOne.length() > textTwo.length() && textOne.length() > textThree.length()) {
            longestString = textOne.length();
        } else if (textTwo.length() > textOne.length() && textTwo.length() > textThree.length()) {
            longestString = textTwo.length();
        } else {
            longestString = textThree.length();
        }
        
        // Finds Longest String Length 
        if (textOne.length() < textTwo.length() && textOne.length() < textThree.length()) {
            shortestString = textOne.length();
        } else if (textTwo.length() < textOne.length() && textTwo.length() < textThree.length()) {
            shortestString = textTwo.length();
        } else {
            shortestString = textThree.length();
        }

        // Finds Shortest String Length 
        if (textOne.length() < textTwo.length()) {
            shortestString = textOne.length();
        } else {
            shortestString = textTwo.length();
        }

        // Finds Middle String Length 
        if (longestString > textOne.length() && shortestString < textOne.length()) {
            middleString = textOne.length();
        } else if (longestString > textTwo.length() && shortestString < textTwo.length()) {
            middleString = textTwo.length();
        } else {
            middleString = textThree.length();
        }

        for (int i = 0; i < middleString; i++ ) {
            starText += "*";
        }
        
        return starText;
    }
}