import java.util.Scanner;

public class VowelFound_Huffman {
	
	public static void main(String[] args) {
			//Seth Huffman
			
			Scanner thing = new Scanner(System.in);
			
			int VowelCount = 0;

			
			while (VowelCount != 111){	
			System.out.println("Please enter a word");
			String word = thing.nextLine();
			word = word.toLowerCase();
			char[]ch=word.toCharArray();
			
			if(VowelCount==111){
				
			} else {
			for(int i = 0; i < word.length();i++){
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
					VowelCount++;
				}
			}
			if (VowelCount==0){
				for(int i = 0; i <word.length();i++){
					if(ch[i]=='y'){
						VowelCount++;
					}
				}
			}
				
			while(VowelCount!=0){
				System.out.println("A vowel was found!");
			break;
				
			//} else{
				//System.out.println("You must have made a spelling mistake somewhere.");
			//}
			

	//thing.close();
			}
	}}}}
	
		//Keeps looping