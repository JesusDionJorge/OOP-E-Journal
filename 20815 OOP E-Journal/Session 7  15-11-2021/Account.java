package bankaccount;

public class Account {
	private String accountNo;
	private String accountHolderName;
	private double balance;
	
	private final double MINIMUM_BALANCE = 1000;			//Constant
		
	public Account(){
		this.accountHolderName="";
		this.accountNo="";
		this.balance=1000;
	}
	
	public void withdraw(double amt)throws MinimumBalanceException, NegativeAmountException{ //checked Exception
		if (amt<0){
			throw new NegativeAmountException(amt);
		}else if((this.balance -amt) < MINIMUM_BALANCE){
			throw new MinimumBalanceException(amt);
		}else{
			this.balance = this.balance - amt;

		}
	}

	public void deposit(double amt)throws NegativeAmountException{
		if(amt<=0){
			throw new NegativeAmountException(amt);
		}
		this.balance = this.balance + amt;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void displayAccountInfo(){
		System.out.println("Account No.: " +this.accountNo);
		System.out.println("Account Holder Name: " +this.accountHolderName);
	}
}
