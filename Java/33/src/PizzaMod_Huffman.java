
public class PizzaMod_Huffman {
	
	public static void main(String[] args) {
		
		Pizza myPizza = new Pizza("mushroom", "large", 9.99);
		
//		myPizza.setPrice(9.99);
//		myPizza.setSingleTopping("mushroom");
		//System.out.println(myPizza.toString());
		
	
		Pizza yourPizza = new Pizza("Pepperoni Pizza", "Extra Large", 13.99 );
		//System.out.println(yourPizza.toString());
		
		Pizza thirdPizza = new Pizza("Pepperoni Pizza", "Extra Small", 7.99 );
		
		System.out.println(myPizza.repeatOrder());
		System.out.println(yourPizza.repeatOrder());
		System.out.println(thirdPizza.repeatOrder());
	}
	
}

//new instance variable called orderNumber.  
//Make it an integer. 
//Create a getter only for orderNumber (the order number will only be set in the constructor so no point in creating a setter method).
//Add a static instance variable called nextOrderNumber that starts at 1001.  Hint: the word static will come between the access (private) and the data type (int).
//In the constructor, increase nextOrderNumber by one.  (nextOrderNumber++;)  Then, set the value of this.orderNumber equal to the value in nextOrderNumber (just a simple equal sign will work).
//Modify your repeatOrder() method to print out the orderNumber too.  It should look something like this:
//Pizza 1 info: Order number: 1002, Topping: mushroom, Size: large, Price: $9.99 Pizza 2 info: Order number: 1003, Topping: pepperoni, Size: extra large, Price: $13.99