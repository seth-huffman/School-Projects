import java.text.DecimalFormat;
import java.util.Scanner; 
	
public class ComputeBalance_Huffman {

	    public static void main(String[] args)
	    {
	    	int counter = 0;

	        Scanner thing = new Scanner(System.in); 


	        System.out.print("Enter inital balance: $"); 
	        double InitalBalance = thing.nextDouble(); 


	        System.out.print("Enter interest rate: "); 
	        double InterestRate = thing.nextDouble(); 


	        System.out.print("Enter the years: ");
	        int Years = thing.nextInt();
	        
	        double FinalBalance = Math.pow((1+InterestRate),Years)*InitalBalance;

	     
				DecimalFormat numberFormat = new DecimalFormat("#.##");
			System.out.println("Balance of " + numberFormat.format(FinalBalance) + " after " + Years + " years");

	        }
	}
