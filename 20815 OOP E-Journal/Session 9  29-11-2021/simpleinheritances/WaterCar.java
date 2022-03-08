package simpleinheritances;

public class WaterCar extends Car{
	private double floatingSpeed;
	private double speed;
	public WaterCar(){
		super();
		this.floatingSpeed=0.0;
	}
	
	public WaterCar(String modalName, String engineModal){
		super(modalName, engineModal);
		this.floatingSpeed=0.0;
	}
	
	public void swim(){
		System.out.println("Swimming");
	}
	
	
	public void accelerate(){
		speed=speed+3;
	}
	
	public void display(){
		super.display();
		System.out.println("Floating Speed"+ this.floatingSpeed);
		
	}
	
}

