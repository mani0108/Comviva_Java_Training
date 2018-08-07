package java_training;

public class AccountClient {
	public static void main(String[] args) {
		Account  account[] = new Account[4];
		account[0] = new Account();
		account[1] = new Account();
		account[2] = new Account();
		account[3] = new Account();
		
		Name name = new Name();
		name.setfName("Jew");
		name.setlName("Carpio");
		
		account[0].setAccountNo(101);
		account[0].setName(name);
		account[0].setIncome(-45000);
		
		
		name.setfName("Adie");
		name.setlName("Crest");
		
		account[1].setAccountNo(102);
		account[1].setName(name);
		account[1].setIncome(15000);
		
		name.setfName("Grace");
		name.setlName("Clint");
		
		account[2].setAccountNo(103);
		account[2].setName(name);
		account[2].setIncome(31000);
		
		name.setfName("Jew");
		name.setlName("Crest");
		
		account[3].setAccountNo(101);
		account[3].setName(name);
		account[3].setIncome(-45000);
		
		//account.dispaly();
		System.out.println(account); //compiler converts it to --> account.toString();
	}
}
