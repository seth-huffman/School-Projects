import java.util.Scanner;

public class VowelCount_Huffman {

	public static void main(String[] args) {
		//Seth Huffman
		
		Scanner thing = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word = thing.nextLine();
		word = word.toLowerCase();
		char[]ch=word.toCharArray();
		
		int VowelCount = 0;
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
		
		if(VowelCount!=0){
			System.out.println(VowelCount + " vowel in " + word);
		} else{
			System.out.println("You must have made a spelling mistake somewhere.");
		}

thing.close();
}
}