import java.util.Scanner;

public class AverageAgeYourWithLoop_Huffman {
	
	public static void main(String[] args) {
		//Seth Huffman
		Scanner thing = new Scanner(System.in);
		
		//Initializing counter and total
		int counter = 0;
		double AllAges = 0;
		
		
		System.out.print("Enter how many members are in your family:  ");
		int FamilyAmount = thing.nextInt();
		
		//Loop through 
		while (counter < FamilyAmount) { 
			System.out.print("Enter an age of a family member:  ");
			int FamilyAge = thing.nextInt();
	
			AllAges += FamilyAge;
			counter++;
		}
		double AverageAge = (AllAges)/(FamilyAmount);
			System.out.print(AverageAge);

	}
	
}