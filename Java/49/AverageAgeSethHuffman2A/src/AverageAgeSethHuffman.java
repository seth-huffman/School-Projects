import java.util.Scanner;

public class AverageAgeSethHuffman {
//Seth Huffman
	public static void main(String[] args) {
	
	Scanner thing = new Scanner(System.in);
	
	System.out.print("Seth Huffman's Age ");
	int SethHuffman = thing.nextInt();
	
	System.out.print("Kira Mount's Age ");
	int KiraMounts = thing.nextInt();
	
	System.out.print("Krista Huffman's Age ");
	int KristaHuffman = thing.nextInt();
	
	System.out.print("Steve Huffman's Age ");
	int SteveHuffman = thing.nextInt();

	int TotalAge = SethHuffman + KiraMounts + KristaHuffman + SteveHuffman;
	double AverageAge = TotalAge/4;
	
	System.out.println("The Average Age is " + AverageAge);
	
	
	}
}
