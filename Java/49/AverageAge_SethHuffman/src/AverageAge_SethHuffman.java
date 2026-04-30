
public class AverageAge_SethHuffman {
	public static void main(String[] args) {
	int SethHuffman = 24;
	int KiraMounts = 30;
	int KristaHuffman = 58;
	int SteveHuffman = 64;
	int EileenSummers = 77;
	int JemmaMounts = 1;
	
	double AgeBetweenSiblings = KiraMounts - SethHuffman;
	double AgeBetweenParents = SteveHuffman - KristaHuffman;
	double AgeBetweenOldestAndYoungest = EileenSummers - JemmaMounts;
	double AgeBetweenMotherDaughter = KristaHuffman - KiraMounts;
	double AgeBetweenFatherSon = SteveHuffman - SethHuffman;
	
	System.out.println("Sibling Age Gap  = " + AgeBetweenSiblings);
	System.out.println("Parents Age Gap  = " + AgeBetweenParents);
	System.out.println("Biggest Age Gap  = " + AgeBetweenOldestAndYoungest);
	System.out.println("Mother / Daughter Age Gap  = " + AgeBetweenMotherDaughter);
	System.out.println("Father / Son Age Gap = " + AgeBetweenFatherSon);
	}
}