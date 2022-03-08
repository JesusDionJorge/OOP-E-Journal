
//Find out simple interest when principle, rate and rate of interest are known.
public class SimpleInterest {

	private int p;
	private int r;
	private int t;
	private int si;
	
	public SimpleInterest() {
		p = 6500;
		r = 36;
		t = 24;
	}
	
	public void calculateSimpleInterest() {
		{
			si = (p*r*t) / 100;
		}
		System.out.println("Principle = "+p);
		System.out.println("Rate of Interest = "+r);
		System.out.println("Time  = "+t);
		System.out.println();
		System.out.print("Simple interest = "+si);
	}
}
