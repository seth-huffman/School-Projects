import java.util.Scanner;

public class ShopperReward_SethHuffman {
	//Seth Huffman
	
		public static void main(String[] args) {
		
		Scanner thing = new Scanner(System.in);
			
		System.out.print("Enter a number ");
		int number_entered = thing.nextInt();
		int amountpaid = number_entered;
			 
		if (amountpaid > 210) {
	       System.out.print("14% Coupon");
	       
		} else if (amountpaid > 150) { 
			System.out.print("12% Coupon"); 
		
		} else if (amountpaid > 60) { 
	       System.out.print("10% Coupon"); 
	       
		} else if (amountpaid > 10) { 
		       System.out.print("8% Coupon"); 
		       
		} else if (amountpaid > 0) { 
			System.out.print("No Coupon"); 
		}
}
}