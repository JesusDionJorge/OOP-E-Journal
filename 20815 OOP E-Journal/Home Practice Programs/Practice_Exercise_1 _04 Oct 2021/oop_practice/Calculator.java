package oop_practice;
//18.Calculator class to find out addition, subtraction, division, multiplication, and remainder of given numbers.
public class Calculator 
{
    private int num1;
    private int num2;
    private int add;
    private int sub;
    private float multi;
    private float div;
    private float rem;

    public Calculator() {
        num1=24;
        num2=15;
    }
    public void findAdd() {
        add=num1+num2;
        System.out.println("Addition: "+add);
    }
    public void findSub() {
        sub=num1-num2;
        System.out.println("Subtraction: "+sub);
    }
 
    public void findMulti() {
        multi=num1*num2;
        System.out.println("Multiplication: "+multi);
    }
    public void findDiv() {
        div=num1/num2;
        System.out.println("Division: "+div);
    }
    
    public void findRem() {
    	rem=num1%num2;
    	System.out.println("Remainder: "+rem);
    }
}