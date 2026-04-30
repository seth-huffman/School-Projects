
public class PizzaTester_Huffman {
	
	public static void main(String[] args) {
		
		Pizza myPizza = new Pizza();
		
		myPizza.setPrice(12.99);
		myPizza.setSingleTopping("Mushrooms");
		//System.out.println(myPizza.toString());
		
	
		Pizza yourPizza = new Pizza("Pepperoni Pizza", "Extra Large", 13.99 );
		//System.out.println(yourPizza.toString());
		
		myPizza.repeatOrder();
		yourPizza.repeatOrder();
	}
	
}
		



