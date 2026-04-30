
public class Billing_Huffman {
	
    public static void Parameter(double BookPrice){
    	double tax = 1.08;
    	double asdf = BookPrice * tax;
    	System.out.printf("Total due: %.2f\n", BookPrice * tax);
    }	

	public static void Parameter(double BookPrice, int AmountOfBooks){
		double tax = 1.08;
		System.out.printf("Total due: %.2f\n",BookPrice * AmountOfBooks * tax);
	}

	public static void Parameter(double BookPrice, int AmountOfBooks, double CouponValue ){
		double tax = 1.08;
		double TotalDueWithoutCoupon = BookPrice * AmountOfBooks;
		double TotalDueWithCoupon = TotalDueWithoutCoupon * (1-CouponValue);
		double TotalDueFinal = TotalDueWithCoupon * tax;
		System.out.printf("Total due: %.2f\n", TotalDueFinal);
	}

    public static void main(String[] args) {
    		
    	Parameter(19.99);
    	Parameter(19.99, 2);
    	Parameter(19.22, 2, .1);
    
    }	
}  