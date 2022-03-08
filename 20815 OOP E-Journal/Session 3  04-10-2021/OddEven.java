
//Find whether the number given is odd or even.
public class OddEven {
	private int num;
	
	public OddEven() {
		num = 36;
	}
	
	public void findOddEven() {
		if (num % 2 == 0) {
			System.out.print(num+ " is an even number.");
		}
		else {
			System.out.print(num+ " is an odd number.");
		}
	}


}
