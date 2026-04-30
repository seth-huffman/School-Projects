	import java.util.Scanner;
	import java.text.*;

public class Midterm_Huffman {
		
		public static void main(String[] args) {
				//Seth Huffman
				
				Scanner thing = new Scanner(System.in);
				
				System.out.print("First Name: ");
				String FirstName = thing.nextLine();	
				
				DecimalFormat df = new DecimalFormat("#.##");
				
				while(!(FirstName.equals("ZZZ"))){

				
				System.out.print("Last Name: ");
				String LastName = thing.nextLine();
				
				System.out.print("Enter total sales: ");
				double SalesTotal = thing.nextDouble();
				
				String allStar = "";
				while (!(allStar.toLowerCase().equals("y")||allStar.toLowerCase().equals("n"))){
				System.out.print("Press y for all-star, n for non-all-star: ");
				allStar = thing.nextLine();
				}

				Double Bonus = 0.0;
				if(allStar.equals("y")){
					 Bonus =SalesTotal*.03;
				} else {
					 Bonus =SalesTotal*.02;
				}
				
				String BonusString = "";
				if(Bonus >= 100){
					BonusString ="****";
				} else if(Bonus >= 50){
					BonusString = "**";
				}
				
				System.out.print(LastName.substring(0,1).toUpperCase()+LastName.substring(1).toLowerCase() + "," + FirstName.substring(0,1).toUpperCase()+FirstName.substring(1).toLowerCase() + " " + BonusString + " - $" + df.format(Bonus));
				System.out.print("\n\nPlease enter another name or ZZZ to quit: ");
				FirstName = thing.nextLine();
				
				}
				thing.close();
				System.out.print("Goodbye");
}
}