package interfaceExample;
// using intefrace in polmorphism -- dynamic 
public class Client {

	public static void main(String[] args) {
		
		IBird b1; // reference variable of interface
		
		b1 = new Peacock();
		b1.eat();
		
		b1 = new Vulture();
		b1.eat();
		
		b1 = new Crane();
		b1.eat();
	}
}
