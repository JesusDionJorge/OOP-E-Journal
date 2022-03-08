package simpleinheritances;

public class CarClient {

	public static void main(String[] args) {
		Car one = new Car();
		one.setModalName("Beetle");
		one.setEngineModal("WB880X82");
		//one.display();
		
		Car two = new Car("POLO 550", "V580C82");
		two.display();

		two.startStop("start");
		System.out.println("Engine Status :" + two.getEngineStatus());
		
		two.accelerate();
		two.accelerate();
		System.out.println("Speed Status :" + two.getSpeed());

	}

}
