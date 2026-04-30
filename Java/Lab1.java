/*------------------------------------------------------------
// AUTHOR: Seth Huffman
// FILENAME: Lab1.java
// SPECIFICATION: Calculating Students Grades
// FOR: CSE 110- Lab #1
// TIME SPENT: HOW LONG IT TOOK YOU TO FINISH THIS LAB //--------------------
---------------------------------------*/
import java.util.Scanner;

public class Lab1 
{
	private static int foo(int a) {
		return a + 3;
	}

	private static int bar(int b) {
		return foo(b) * 4;
	}
	public static void main(String[] args) 
	{
		int a = 4;
		int b = 3;
		int x = foo(a) + bar(b);
		
		System.out.println(x);




	}
}
