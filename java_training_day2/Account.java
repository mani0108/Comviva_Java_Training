package java_training_day2;

public class Account {
	int balance;
	
	//assume that the value set after fetching from DB
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		if(amount < balance)
		{
			try {
				Thread.sleep(1000);
				balance = balance - amount;
				System.out.println("You have withdrawn " + amount 
						+ " Remaining Balance " + balance);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Sorry... " + Thread.currentThread().getName()
					+ " You don't have enough Balance");
		}
	}
}
