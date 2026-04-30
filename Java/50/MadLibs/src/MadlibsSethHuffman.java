import java.util.Scanner;

public class Madlibs {
		//Seth Huffman
			   public static void main(String[] args) {
				   
				   Scanner thing = new Scanner(System.in);
				   
				   System.out.print("Enter a name ");
				   String name = thing.nextLine();
				   
				   System.out.print("Enter an object ");
				   String object1 = thing.nextLine();
				   
				   System.out.print("Enter an object ");
				   String object2 = thing.nextLine();
				   
				   System.out.print("Enter an object ");
				   String object3 = thing.nextLine();
				   
				   System.out.print("Enter a past tense verb ");
				   String verb = thing.nextLine();
				   
				   System.out.print("Enter a adjective ");
				   String adjective = thing.nextLine();
				   
				   System.out.println(name + " has a little " + object1);
				   System.out.println("Its "+object2+ " was "+ adjective + " as snow");
				   System.out.println("The " + object3 + " was sure to go.");
		}
}
