
public class Pizza {
	// Seth Huffman
		private String singletopping;
		private String size;
		private Double price;
		private int orderNumber;
		private static int nextOrderNumber=1001;
		
		public Pizza(){
			setSingleTopping("Undefined");
			setPrice(0.0);
			size = "Undefined";
			nextOrderNumber++;
			orderNumber=nextOrderNumber;
			
		}
		public Pizza(String st, String s, Double p){
			setSingleTopping(st);
			size = s.toLowerCase();
			setPrice(p);
			if (size.equals("small") || size.equals("medium") || size.equals("large") || size.equals("extra large")){
				
			} else { 
				System.out.println("Error");
			}
			nextOrderNumber++;
			orderNumber=nextOrderNumber;
			
		}	
		public String getSingleTopping() {
			return singletopping;	
		}
		public void setSingleTopping(String singletopping) {
			this.singletopping = singletopping;
		}
		public String getSize() {
			return size;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public int getOrderNumber(){
			return orderNumber;
		}
		public String repeatOrder() {
			return "Pizza " + (orderNumber-1001) + " info: Order Number: " + orderNumber + ", Topping: " + this.singletopping + ", Size: " + this.size;
		}

}
		
		
		
		
		
		
		