package practice;
//10.Find sum of natural numbers.
public class SumOfNaturalNumbers {
	public static void main(String[] args) {

        int num = 20,sum = 0;

        for(int i = 1; i <= num; ++i) {
            sum = sum + i;
           
        }

        System.out.println("Sum = " + sum);
    }
	

}
