
public class BankAccount {
	//Seth Huffman
	
		private double balance;
		
		public BankAccount(double b)
		{
			balance = b;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public void deposit(double d)
		{
			double newBalance = balance + d;
			balance = newBalance;
		}
		
		public void withdraw(double w)
		{
			double newBalance = balance - w;
			balance = newBalance;
		}
	}
