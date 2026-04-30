import java.util.Scanner;

public class BookOrderSethHuffman {
//Seth Huffman
	   public static void main(String[] args) {
		   
		   Scanner thing = new Scanner(System.in);
			
		   System.out.print("PriceOfTheBook ");
		   double PriceOfTheBook = thing.nextDouble();
		   
		   System.out.print("AmountOfBooksBought ");
		   int AmountOfBooksBought = thing.nextInt();
		   
		   double SalesTax = 6.5;
		   
		   System.out.print("ShippingCharges ");
		   double ShippingCharges = 2.95;
		   
		   double BooksAndTherePrices = AmountOfBooksBought * PriceOfTheBook;
		   double ShippingChargesPerBook = ShippingCharges + AmountOfBooksBought;
		   double Total = BooksAndTherePrices + ShippingChargesPerBook;
		   
		   System.out.println("Total  = " + Total);
	   }

}
