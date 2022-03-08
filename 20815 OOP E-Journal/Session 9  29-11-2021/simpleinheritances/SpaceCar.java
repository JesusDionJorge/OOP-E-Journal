package simpleinheritances;

public class SpaceCar extends FlyingCar{
	private double airPressure;
	private double speed;
	public SpaceCar(){
		super();
		this.airPressure=0.0;
	}
	
	public SpaceCar(String modalName, String engineModal){
		super(modalName, engineModal);
		this.airPressure=0.0;
	}
	
	public void fly(){
		System.out.println("Flying");
	}
	
	public void checkPressure(){
		System.out.println("Checking Pressure");
	}
	
	public void accelerate(){
		speed=speed+100;
	}
	
	public void display(){
		super.display();
		System.out.println("Airpressure"+ this.airPressure);
		
	}
	
	
	
}
