import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class SortBabyName_Huffman {
//Seth Huffman
	public static void main(String[] args) throws IOException {
		
		try{
		String address = "http://www.dmacc-diad.com/classroom/babynames2014.txt";
		URL pageLocation = new URL(address);
		Scanner in = new Scanner(pageLocation.openStream());
		
		PrintWriter outToGirl = new PrintWriter("girls.txt");
		PrintWriter outToBoy = new PrintWriter("boys.txt");
		
		outToGirl.println("Kelli K");
		outToBoy.println("Kelli K");
		
		String value = "";
		
		while (in.hasNextLine()){
			value = in.nextLine();
			
			if (value.contains("girl")){
			outToGirl.println(value);
			outToGirl.println("--------------");
			} else if (value.contains("boy"))
				outToBoy.println(value);
				outToBoy.println("---------------");
		}
	
	
	in.close();
	outToGirl.close();
	outToBoy.close();
	
	} catch (IOException e){
		System.out.println("File not Found");
	}
	//Hidden error
}

}