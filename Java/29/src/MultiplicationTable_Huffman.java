
public class MultiplicationTable_Huffman {
	public static void main (String[] args) {
	     
		
		int multiplication;

	     for (int k = 1; k <= 12; k++) {
	         
	         for (int i = 1; i <= 12; i++) {
	        	multiplication = k*i;
	            System.out.print(" " + multiplication);   
	            if (multiplication < 10) System.out.print(" ");
	            else if (multiplication < 100) System.out.print(" ");
	         }
	         System.out.println();
	      }
	   }
}
