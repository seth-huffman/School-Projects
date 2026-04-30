	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class BankAccountFrame extends JFrame
	{
		BankAccount account;
		
		private JLabel amount = new JLabel("Amount:");
		private JTextField value = new JTextField(10);
		private JButton withdraw = new JButton("Withdraw");
		private JButton deposit = new JButton("Deposit");
		private JLabel balance = new JLabel("Balance = ");

		
		public BankAccountFrame(BankAccount b)
		{
			account = b;
			
			depositListener d = new depositListener();
			deposit.addActionListener(d);
			
			withdrawListener w = new withdrawListener();
			withdraw.addActionListener(w);
			
			JPanel controlPanel = new JPanel();
			controlPanel.add(amount);
			controlPanel.add(value);
			controlPanel.add(withdraw);
			controlPanel.add(deposit);
			controlPanel.add(balance);
			add(controlPanel);
			setSize(400,100);
			balance.setText("Balance = " + String.format("$%.2f", account.getBalance()));
		}
		
		class depositListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String a = value.getText();
				double depositValue = Double.parseDouble(a);
				//balance.setText("balance=" + b.getBalance());
				account.deposit(depositValue);
				balance.setText("Balance = " + String.format("$%.2f", account.getBalance()));
			}
		}
		
		class withdrawListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String a = value.getText();
				double withdrawValue = Double.parseDouble(a);
				//balance.setText("balance=" + b.getBalance());
				account.withdraw(withdrawValue);
				balance.setText("Balance = " + String.format("$%.2f", account.getBalance()));
			}
		}
	}
