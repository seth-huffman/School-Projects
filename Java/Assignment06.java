// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 06
// Author      : Seth Huffman & swhuffma
// Description : Working with arrays

public class Assignment06 {

    public static void main(String[] args) {

        /////////////////////////////////////
        // Variables
        /////////////////////////////////////
        int[] myArray = {1, 22, 333, 400, 5005, 9}; 

        /////////////////////////////////////
        // Output
        /////////////////////////////////////
        printArray(myArray, ", ");       
        printArray(myArray, " - ");    
        getFirst(myArray);     
        getLast(myArray);  
        getAllButFirst(myArray); 
        getIndexOfMin(myArray); 
        getIndexOfMax(myArray);       
        swapByIndex(myArray, 1, 4); 
        removeAtIndex(myArray, 3);
        insertAtIndex(myArray, 2, 777);
        isSorted(myArray);
    }
    
    /////////////////////////////////////
    // Methods
    /////////////////////////////////////

    // 1)
    static void printArray(int[] array, String text){
    
      for (int i = 0; i < array.length - 1; i++) {
         System.out.print(array[i] + text);
      }
      System.out.print(array[array.length - 1]);
      System.out.println("");
    }
    
    // 2)
    static void getFirst(int[] array){
        System.out.println(array[0]);
    }
    
    // 3)
    static void getLast(int[] array){
        System.out.println(array[array.length - 1]);
    }
    
    // 4)
    static void getAllButFirst(int[] array){
        for (int i = 1; i < array.length  - 1; i++) {
           System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println("");
    }
    
    // 5)
    static void getIndexOfMin(int[] array){
        int minimum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minimum] > array[i]) {
                minimum = i;
            }
        }
        System.out.println(minimum);
    }
     
    // 6)
    static void getIndexOfMax(int[] array){
        int maximum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[maximum] < array[i]) {
                maximum = i;
            }
        }
        System.out.println(maximum);
    }
    
    // 7)
    static void swapByIndex(int[] array, int indexOne, int indexTwo){
        for (int i = 0; i < array.length - 1; i++) {
            if (i == indexOne) { 
                System.out.print(array[indexTwo] + ", ");
            } else if (i == indexTwo) {
                System.out.print(array[indexOne] + ", ");
            }   else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(array[array.length - 1]);
        System.out.println("");
    }

    // 8)
    static void removeAtIndex(int[] array, int index){
        for (int i = 0; i < array.length - 1; i++) {
            if (i == index) { 
            }   else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(array[array.length - 1]);
        System.out.println("");
    }

    // 9)
    static void insertAtIndex(int[] array, int index, int value){
        for (int i = 0; i < array.length - 1; i++) {
            if (i == index) { 
                System.out.print(value + ", ");
                System.out.print(array[i] + ", ");
            }   else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(array[array.length - 1]);
        System.out.println("");
    }

    // 10)
    static void isSorted(int[] array){
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (i != array.length) {
                if (array[i] < array[i+1]) { 
                    count += 1;
                    System.out.print(count);
                }
            }
        }
        if (count == array.length) { 
            System.out.print("true");
        }   else {
            System.out.print("false");
        }
    }
    

}








