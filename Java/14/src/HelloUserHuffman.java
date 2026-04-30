import javax.swing.JOptionPane;

public class HelloUserHuffman {

	//Seth Huffman
	
	public static void main(String[] args) {
		
		String first_name;
		first_name = JOptionPane.showInputDialog("First Name");
		
		String current_age;
		current_age = JOptionPane.showInputDialog("Current Age");

		int new_age = Integer.parseInt(current_age) + 1;
		
		String full_name;
		full_name = "Howdy, " + first_name + ". Next year you will be " + new_age + " years old";
		
		JOptionPane.showMessageDialog(null, full_name);
		System.exit(0);

		
				
	}
}
