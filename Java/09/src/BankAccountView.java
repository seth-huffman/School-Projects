import javax.swing.JFrame;
	
public class BankAccountView {
	//Seth Huffman
		public static void main(String[] args) 
		{
			BankAccount account1 = new BankAccount(1000);
			
			JFrame frame = new BankAccountFrame(account1);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
}

	
