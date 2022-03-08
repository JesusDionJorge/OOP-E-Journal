package practice;
//9.Display Even Numbers From 1 to 100
public class EvenNumbers {

	public static void main(String[] args) {
		
		System.out.print("Even numbers from 1 to 100 : ");  
		for (int i=1;i<=100;i++) {
			if (i%2==0) {
				System.out.print(i + " ");  
			}
		}		
	}

}
