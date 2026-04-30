import java.util.Scanner; 

public class WordCounter_Huffman {

	public static int countWords(String str){
		int WordCount = 1;
        int wordStart = 0;
        
        for (int i = 0; i < str.length(); i++){
        	String sub = str.substring(i, i+1);
        	
        	if(sub.equals(" ")){
        		WordCount++;
        		System.out.println(str.substring(wordStart,i));
        		wordStart=i+1;
        	}
        }
        System.out.println(str.substring(wordStart,str.length()));
        return WordCount;
		
	}
    public static void main(String[] args)
    {
        Scanner thing = new Scanner(System.in); 

        System.out.print("Please enter a phrase"); 
        String phrase = thing.nextLine(); 
		int WordCount;
        WordCount = countWords(phrase);
        
        
        System.out.print("There are " + WordCount + " words in the phrase"); 
        
        //needs to convert char to string
}
}

