import java.util.Scanner;

public class ChildcareCharges_Huffman {

	public static void main(String[] args) {
		//Seth Huffman
		Scanner thing = new Scanner(System.in);
		
		int counter = 0;


		int Rates [][]= {       
				{30, 60, 88, 115, 140},
				{26, 52, 70, 96, 120},                 
				{24, 46, 67, 89, 110},
				{22, 40, 60, 75, 88},
				{20, 35, 50, 66, 84} 
				};

		int DaysAWeek =0;
		int ChildAge =0;		

		while (DaysAWeek != 999 && ChildAge !=999) {
				System.out.print("Number of days in a week the child will attend or enter 999 to stop: ");
				DaysAWeek = thing.nextInt();
				System.out.print("Age of child or enter 999 to stop:  ");
				ChildAge = thing.nextInt();

			if((ChildAge > 4 || ChildAge <0 || DaysAWeek > 5 || DaysAWeek < 1)&& !(ChildAge==999 || DaysAWeek==999)){
				System.out.println("Invalid age/days");
				continue;
			}
			


			if(ChildAge!=999){
				System.out.println(Rates[ChildAge][DaysAWeek-1]);
			}	
		}
				
	}

}
