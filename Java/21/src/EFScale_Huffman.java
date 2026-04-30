import java.util.Scanner; 
 
public class EFScale_Huffman {


    public static void main(String[] args) {

    Scanner thing = new Scanner(System.in); 
    
    System.out.print("Please insert for a three second wind gust in MPH: ");
	String str = thing.nextLine();
	Double WindGust = 0.0;
	if(str.matches("-?\\d+(\\.\\d+)?")){
		 WindGust = Double.parseDouble(str);
	}
	

		if (WindGust > 200) {
			System.out.print("EF raring is 5 ");
	    } else if (WindGust > 165) {
			System.out.print("EF raring is 4 ");
	    } else if (WindGust > 135) {
			System.out.print("EF raring is 3 ");
	    } else if (WindGust > 110) {
			System.out.print("EF raring is 2 ");
	    } else if (WindGust > 85) {
			System.out.print("EF raring is 1 ");
	    } else if (WindGust >= 65) {
			System.out.print("EF raring is 0 ");
	    } else if (WindGust < 65) {
	    	System.out.print("Error");
	    } 
	    }
	
}
