
public class Pizza {
	// Seth Huffman
	private String singletopping;
	private String size;
	private Double price;
	
	public Pizza(){
		setSingleTopping("Mushrooms"); 
		setPrice(12.99);
	}
	public Pizza(String st, String s, Double p){
		setSingleTopping(st);
		setSize(s);
		setPrice(p);
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
	public void setSize(String size) {
		this.size = size;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
//	@Override
//	public String toString() {
//		return "Pizza [singletopping=" + singletopping + ", size=" + size + ", price=" + price + "]";
//	}
	
	public void repeatOrder() {
		System.out.println("Pizza [singletopping=" + this.singletopping + ", size=" + this.size + ", price=" + this.price + "]");
	}

}
