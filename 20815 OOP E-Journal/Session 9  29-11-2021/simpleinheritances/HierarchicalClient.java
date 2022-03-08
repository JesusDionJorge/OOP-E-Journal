package simpleinheritances;

public class HierarchicalClient {

	public static void main(String[] args) {
			

		Car fc = new FlyingCar("FC102", "ERE1");
		
		fc.display();
		
		WaterCar wc = new WaterCar("Wc 103", "Wdc03");
		wc.display();
	}

}
