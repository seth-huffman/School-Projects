import java.util.Scanner;

public class AverageAgeSenValue_Huffman {
		
		public static void main(String[] args) {
			//Seth Huffman
			Scanner thing = new Scanner(System.in);
			
			int counter = 0;
			int FamilyAverage = 0;
			int FamilyAge = 0;
			int AllAges = 0;
			
			
			System.out.print("This program will calc the average age of the members of your family\nWhen you are finished adding ages type '999'\n");
			
			while (FamilyAge != 999) { 
				System.out.print("Enter an age of a family member or 999 to end:  ");
				FamilyAge = thing.nextInt();
				
				if(FamilyAge==999){
					
				} else {
					AllAges+=FamilyAge;
				}
		
				counter++;
			}
			if (counter==1){
				System.out.println("You did not enter any ages");
			} else{
				double AverageAge = (double) AllAges/(counter-1);
				System.out.print("The average age is: " + AverageAge);
			}
				
}
}