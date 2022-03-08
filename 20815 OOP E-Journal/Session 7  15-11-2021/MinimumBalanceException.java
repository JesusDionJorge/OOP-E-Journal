package bankaccount;

public class MinimumBalanceException extends Exception {
	double amount;
	public MinimumBalanceException(double amt){
		amount = amt;
	}
	
	public String getMessage(){
		return "Balance amount is going beyond Minimum Balance. Amount entered by you is "+amount;
	}

}
