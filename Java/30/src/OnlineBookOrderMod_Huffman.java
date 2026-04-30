import java.util.Scanner;

public class OnlineBookOrderMod_Huffman {
	// Seth Huffman
	public static void main(String[] args) {

		Scanner thing = new Scanner(System.in);

		double SalesTax = .065;
		double ShippingCharges = 2.95;

		System.out.print("Amount of books purchasing:  ");
		int BookAmount = thing.nextInt();
		
		double BookCost=0;
		double Subtotal=0;
		
		for(int i=1;i<=BookAmount;i++){
			System.out.println("What is the prices for book #"+ i + ":");
			BookCost = thing.nextInt();
			Subtotal += BookCost;
		}
		
		double Tax1= SalesTax*Subtotal;
		double ShippingTotal = BookAmount* ShippingCharges;
		double OrderTotal = Subtotal+Tax1+ShippingTotal;


		System.out.println("Number of books purchasing: " + BookAmount);
		System.out.println("Book Subtotal: " + Subtotal);
		System.out.println("Tax: " + Tax1);
		System.out.println("Shipping: " + ShippingTotal);
		System.out.println("Order Total: " + OrderTotal);


}
}