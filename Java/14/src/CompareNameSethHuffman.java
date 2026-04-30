import java.util.Scanner;

public class CompareNameSethHuffman {

	//Seth Huffman
	
		public static void main(String[] args) {
			
			Scanner thing = new Scanner(System.in);
		
			System.out.print("Enter an name ");
			String person1 = thing.nextLine();
			person1 = person1.toLowerCase();
			
			System.out.print("Enter another name ");
			String person2 = thing.nextLine();
			person2 = person2.toLowerCase();
			
			boolean result = person1 == person2;
					
			
		System.out.println(person1);
		System.out.println("Enter a number: " + person1);
		System.out.println("Enter another number: " + person2);
		System.out.println(person1 + " is equal to " + person2 + " : " + result);

		
		}
}
