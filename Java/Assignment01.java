// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 1
// Author      : Seth Huffman & swhuffma
// Description : Pizza Party

import java.util.Scanner;
import java.util.*;

public class Assignment01 {
    public static void main(String[] args) {  

        // // Variables
        // int adults;
        // int children;
        // int childrenSlicesLeftOver;
        // int pizzas;
        // int slicesPerPizza;
        // int totalAdultSlices;
        // int totalChildrenSlices;
        // int totalLeftOverSlices;
        // int totalSlices;
		// Scanner keyboard = new Scanner(System.in);
        
        // // Inputs
        // System.out.print("Number of pizzas purchased : ");
        // pizzas = keyboard.nextInt();
        // System.out.print("Number of slices per pizza : ");
        // slicesPerPizza = keyboard.nextInt();
        // System.out.print("Number of adults : ");
        // adults = keyboard.nextInt();
        // System.out.print("Number of children : ");
        // children = keyboard.nextInt();
        
        // // Logic
        // totalSlices = pizzas * slicesPerPizza;
        // totalAdultSlices = adults * 2; 
        // totalChildrenSlices = totalSlices - totalAdultSlices;
        // childrenSlicesLeftOver = totalChildrenSlices / children;
        // totalLeftOverSlices = totalChildrenSlices - (childrenSlicesLeftOver *  children);

        // // Outputs
        // System.out.println("Total number of slices of pizza : " + totalSlices);
        // System.out.println("Total number of slices given to adults : " + totalAdultSlices);
        // System.out.println("Total number of slices available for children : " + totalChildrenSlices);
        // System.out.println("Number of slices each child will get : " + childrenSlicesLeftOver);
        // System.out.println("Number of slices left over : " + totalLeftOverSlices);
   
   
        ArrayList<Integer> somenum = new ArrayList<Integer>();
        somenum.add(1);
        somenum.add(2);
        somenum.add(1);
        int cnt = 0;
        for (int index = 0; index < somenum.size(); index++)
        {
           if (somenum.get(index) % 2 == 0)
           {
              cnt++;
           }
        }

        System.out.println(cnt);
   
   
   
   
    }
}