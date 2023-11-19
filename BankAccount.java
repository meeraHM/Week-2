
public class BankAccount {
	
	int Acc_No;
	String Name;
	float Balance; 
	
	
	//parameterised constructor
	
	public BankAccount(int acc_No, String name, float balance) {
		super();
		Acc_No = acc_No;
		Name = name;
		Balance = balance;
		
	}
	
	
	//default constructor
	
	public BankAccount() {
		
	}
	
	
	
	
	
	public int getAcc_No() {
		return Acc_No;
	}
	public void setAcc_No(int acc_No) {
		Acc_No = acc_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	
	
	
	
	
	
	
	
	//Display withdraw deposit
		public void Display() {
			
			
			System.out.println(" The Account No" + Acc_No + "Belonging to" + Name);
			System.out.println( "Has an account Balance of " +Balance+"AED"); 
			
		}
		
		public void Withdraw(int amt) {
			Balance = Balance - amt; 
			System.out.print("\n The amount " +amt + "AED has been withdrawn");
		}
		
		public void Deposit(int amt) {
			Balance = Balance +amt;
			System.out.print("\n The amount" +amt+"AED has been Deposited");
		}
		
		
		
	
	
	

}
