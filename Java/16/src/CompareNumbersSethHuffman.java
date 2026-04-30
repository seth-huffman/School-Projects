import java.util.Scanner;

public class CompareNumbersSethHuffman {
	//Seth Huffman
	
		public static void main(String[] args) {
			
			Scanner thing = new Scanner(System.in);
		
			
			int shoes = 10;
			int shirts = 13;
			
			boolean results1 = shoes == shirts;
			boolean results2 = shoes < shirts;
			boolean results3 = shoes > shirts;
					
		System.out.println(shoes);
		System.out.println("Enter a number: " + shoes);
		System.out.println("Enter another number: " + shirts);
		System.out.println(shoes + " is equal to " + + shirts + " : " + results1);
		System.out.println(shoes + " is greater than " + shirts + " : " + results2);
		System.out.println(shoes + " is less than " + shirts + " : " + results3);
		
		}
}
