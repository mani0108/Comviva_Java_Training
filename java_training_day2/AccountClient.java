package java_training_day2;

public class AccountClient implements Runnable {
	
	Account account;
	
	String name;
	int amount;
	
	
	
	
	public AccountClient(String name, int amount, Account account) {
		this.account = account;
		this.name = name;
		this.amount = amount;
		new Thread(this, name).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (account) {
			account.withdraw(amount);
		}
		
	}
	
	public static void main(String[] args) {
		Account account = new Account(1000);
		
		new AccountClient("Naveen", 500, account);
		new AccountClient("Anjan", 700, account);
		new AccountClient("Naveen", 200, account);
		
		
	}

	
}
