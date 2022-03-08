package simpleinheritances;

public class MulitlevelClient {

	
	public static void main(String[] args) {
					
		
		Car c = new Car("AV1010", "QWT01");
	    c.display();
		
		FlyingCar fc = new FlyingCar("FC102", "ERE1");
		fc.display();
		
		SpaceCar sc = new SpaceCar("Sp187i", "67Tw");
		sc.display();

	}

}
