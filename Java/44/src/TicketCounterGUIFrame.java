	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class TicketCounterGUIFrame {
	private static final int TicketsLeft = 75; {
		TicketCounter account; {
		
		private JLabel amount = new JLabel("Enter how many tickets you'd like to purchase (1-6) ");
		private JTextField value = new JTextField(10);
		private JButton Tickets = new JButton("Purchase Tickets");
		private JLabel Remaining = new JLabel(TicketsLeft + "tickets remaining");
		private JLabel SoldOut = new JLabel("Event is sold out");

		
		public void TicketCounterFrame(TicketCounter b)
		{
			TicketCounter TicketCounter = b;
			
			JPanel controlPanel = new JPanel();
			controlPanel.add(amount);
			controlPanel.add(value);
			controlPanel.add(Tickets);
			controlPanel.add(Remaining);
			controlPanel.add(SoldOut);
			add(controlPanel);
			setSize(400,100);
			TicketCounter.setText("Counter = " + String.format("$%.2f", TicketCounter.getcounter()));
		}


		private void setSize(int i, int j) {
			// TODO Auto-generated method stub
			
		}


		private void add(JPanel controlPanel) {
			// TODO Auto-generated method stub
			
		}
}
