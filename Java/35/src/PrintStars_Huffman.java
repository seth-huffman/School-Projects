import java.util.Scanner;
import java.util.*;

public class PrintStars_Huffman {
	// Seth Huffman

	public static void main(String[] args) {
	    int stars;
 
	Scanner thing = new Scanner(System.in);
	
	System.out.println(" How many rows of stars would you like printed:");
	stars = thing.nextInt();
	//System.out.println(stars);
	for (int k=1; k <= stars; k++){;
		System.out.println("***********");
		
		
	}
	thing.close();
	}
}
