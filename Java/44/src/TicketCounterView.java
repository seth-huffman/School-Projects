import java.util.Scanner;

public class TicketCounterView {

	public static void main(String[] args) {
		// Seth Huffman

		Scanner thing = new Scanner(System.in);

		int TicketsLeft = 75;
		int TicketsRequested = 0;
		
		while (TicketsLeft > 0) { 
			System.out.print("Enter the amount of private tickets you would like (No more than 6):  ");
			TicketsRequested= thing.nextInt();
			if (TicketsRequested>6 || TicketsRequested<0){
				System.out.println("Please try again, the amount you have ordered does not meet the alotted requirements");
				continue;
			}
			if (TicketsRequested>TicketsLeft){
				System.out.println("Please try again, the amount you have ordered is greater than the amount remaining");
				continue;
			}
			TicketsLeft-=TicketsRequested;
			System.out.println("Amount of tickets that are left :" + TicketsLeft);
		}
		
		System.out.println("Sorry,all sold out. Closing up!");
}
}