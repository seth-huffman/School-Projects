	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.GregorianCalendar;

	public class CardTester_Huffman {
	     public static void main(String[] args) {

	            ArrayList<Card> list = new ArrayList<Card>();
	            
	            list.add(new IDCard("James\' ID Card", 214));
	            list.add(new CallingCard("James\' Calling Card", 17, 0012));
	            list.add(new DriverLicense("James\' Driver's License", 2018));


	            System.out.println(list.get(0).toString());
	            System.out.println(list.get(1).toString());
	            System.out.println(list.get(2).toString());

	            Billfold fold = new Billfold(new IDCard("James\' ID Card", 211), new DriverLicense("James\' Driver's License", 2018));
	            System.out.println(fold.formatCards());

	            Billfold fold2 = new Billfold(new CallingCard("James\' Calling Card", 18, 0011), new DriverLicense("James\' Driver's License", 2018));
	            System.out.println("How many expired: " + fold2.getExpiredCardCount());

	            fold2.formatCards();     

	     }
	}
}
