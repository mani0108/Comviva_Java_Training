package java_training;

public class Account {
	private int accountNo;
	private Name name;
	private double income;
	
	
	
	//constructor Account()
	Account(){
		super();
	}
	
	
	

	
	public int getAccountNo() {
		return accountNo;
	}




	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	


	public Name getName() {
		return name;
	}





	public void setName(Name name) {
		this.name = name;
	}





	public double getIncome() {
		return income;
	}




	public void setIncome(double income) {
		if(income < 5000) {
			System.out.println("Sorry... Income can't be so less. set to 5000");
			this.income = 5000;
		}
		else {
			this.income = income;	
		}
	}




	void dispaly() {
		System.out.println("Account No " + this.accountNo );
		System.out.println("First Name " + this.getName().getfName() );
		System.out.println("Last Name " + this.getName().getlName() );
		System.out.println("Income  " + this.income );
	}





	@Override
	public String toString() {
		return "Account No -> " + this.accountNo + ", " + this.name + ", " + "Income ->" + this.income;
	}
}
