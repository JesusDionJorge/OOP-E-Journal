package practice;
//4.Find out maximum of 3 numbers.
public class MaximumThree {

	public static void main(String[] args) {
		int num1=12,num2=8,num3=6,max;
		
		if(num1>num2) {
			if(num1>num3) {
				max=num1;
			}
			else {
				max=num2;
			}
		}
		else if(num2>num3) {
			max=num2;
		}
		else {
			max=num3;
		}
		
		System.out.println("The Maximum of the three numbers is "+max);

	}

}
