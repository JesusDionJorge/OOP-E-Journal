package bankaccount;

public class NegativeAmountException extends Exception{
	double amount;
	public NegativeAmountException(double amt){
		amount = amt;
	}
	
	public String getMessage(){
		String msg = "You have entered negative amount i.e." + amount;
		return msg ;
	}
}
