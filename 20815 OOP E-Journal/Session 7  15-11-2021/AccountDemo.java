package bankaccount;

public class AccountDemo {

	
	public static void main(String[] args) {
	
		Account ac = new Account();
		
		try {
			ac.deposit(-300);
		} catch (NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Balance:" + ac.getBalance());

		try {
			ac.withdraw(4000);
		} catch (MinimumBalanceException mbe) {
			System.out.println(mbe.getMessage());
		}catch (NegativeAmountException nae){
			System.out.println(nae.getMessage());
		}
		System.out.println("Balance:" + ac.getBalance());

	}

}
