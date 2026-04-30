
public class address {
	// Seth Huffman
	private String houseNumber;
	private String street;
	private String optionalApartmentNumber;
	private String city;
	private String state;
	private String postalCode;
	public String getHouseNumber() {
		return houseNumber;
	}
	public address(String hn, String str, String oan, String c, String sta, String pc){
		setHouseNumber(hn);
		setStreet(str);
		setOptionalApartmentNumber(oan);
		setCity(c);
		setState(sta);
		setPostalCode(pc);
		
		if ((getState() == null) || (getPostalCode() == null)){
			throw new IllegalArgumentException("Object not created");
		}
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getOptionalApartmentNumber() {
		return optionalApartmentNumber;
	}
	public void setOptionalApartmentNumber(String optionalApartmentNumber) {
		this.optionalApartmentNumber = optionalApartmentNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void print() {
		System.out.println("address [houseNumber=" + houseNumber + ", street=" + street + ", optionalApartmentNumber="+ optionalApartmentNumber + ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + "]");
}
}