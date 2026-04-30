import java.util.Scanner;
	
public class RandomNumbers_Huffman {
		
		public static void main(String[] args) {
				//Seth Huffman
				
				Scanner thing = new Scanner(System.in);
				
				int counter = 0;
				
				System.out.print("How many random numbers do you want to see: ");
				int RandomNumbers = thing.nextInt();
				
				System.out.print("Smallest Number: ");
				int SmallestNumbers = thing.nextInt();
				
				System.out.print("Largest Number: ");
				int LargestNumbers = thing.nextInt();
				
				int digital = 1 + (int) (Math.random() * 13);
						int FinalNumber = 0;
						
						int number;
				for (int i = 0 ; i < RandomNumbers ; i++){
					number = (int)((Math.random())*(LargestNumbers-SmallestNumbers)+SmallestNumbers);
					System.out.println(number);
						
				
				//System.out.println(FinalNumber);

						/*switch (digital)
						{
						case 1: digitalName = 1; break;
						case 2: digitalName = 2; break;
						case 3: digitalName = 3; break;
						case 4: digitalName = 4; break;
						case 5: digitalName = 5; break;
						case 6: digitalName = 6; break;
						case 7: digitalName = 7; break;
						case 8: digitalName = 8; break;
						case 9: digitalName = 9; break;
						case 10: digitalName = 10; break;
						}*/
				
				//FOR LOOP NEEDS TO BE RESOLVED
				
		}}}