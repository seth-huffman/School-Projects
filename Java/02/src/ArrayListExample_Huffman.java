import java.util.ArrayList;

public class ArrayListExample_Huffman {
	{
	   public static void main(String[] args)
	   {
	       ArrayList<String> names = new ArrayList<String>();
	       System.out.println(names);
	   }
	} 
/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ArrayListExample_Huffman {

	   public static void main(String[] args) {
		   
		   ArrayList arrayListOne;
		   
		   arrayListOne = new ArrayList();
		   
		   ArrayList arrayListTwo = new ArrayList();
		   
	       ArrayList<String> names = new ArrayList<String>();
	       names.add("John Smith");
	       names.add("Seth Huffman");
	       names.add("Sten Lee");
	       
	       names.add(2, "Roy Rogers");
	       
	       names.add(0, "Peter Parker");
	       
	       names.remove(3);
	       
	       for (int i = 0; i < names.size(); i++)
	       {
	    	   
	    	   System.out.println(names.get(i));
	    	   
	       }
	       
	       		System.out.println(names);
	       		
	       		for(String i : names)
	       {
	       			System.out.println(i);
	       }
	       	Iterator indivItems = names.iterator();
	       	
	       	while(indivItems.hasNext())
	       	{
	       		System.out.println(indivItems.next());
	       	}
	       	
	       	ArrayList nameCopy = new ArrayList();
	       	ArrayList nameBackup = new ArrayList();
	       	
	       	nameCopy.addAll(names);
	       	
	       	String paulYoung = "PaulYoung";
	       	
	       	names.add(paulYoung);
	       	
	       	if(names.contains(paulYoung))
	       	{
	       		System.out.println("Paul is here");
	       	}
	       	
	       	if (nameCopy.containsAll(names))
	       	{
	       		System.out.println("Everything in nameCopy is in names");
	       		
	       		names.clear();
	       		
	       	if(names.isEmpty());
	       	}
	       		System.out.println("ArrayList is Empty");
	   		}
	   		
	   		Object[] moreNames = new Object[4];
	   		moreNames = nameCopy.toArray();
	   		
	   		System.out.println(Array.toString(moreNames));
	   }
	} 
	*/