package simpleinheritances;

public class FlyingCarClient {
	public static void main(String[] args) {
		
		FlyingCar fc=null;
				fc=new FlyingCar("FCT8967FGR", "TRFE6756UM");
				
				fc.display();
				fc.start();
				fc.accelerate();
				System.out.println("Speed :" + fc.getSpeed());
			}


}
