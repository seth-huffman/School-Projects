import java.util.Scanner;

public class MemberIDSethHuffman {
	//Seth Huffman
	   public static void main(String[] args) {
		   
		   Scanner thing = new Scanner(System.in);
		   
		   System.out.print("Membership Id Number");
		   String Id = thing.nextLine();
		   Id = Id.toUpperCase();
		   System.out.println(Id.substring(0,1) + "-" + Id.substring(1,4) + " "+ Id.substring(4,8) +" " + Id.substring(8,10) +"-" + Id.substring(10,13) +"  (" + Id.substring(13,14) + ")");
		   
	   }
}
