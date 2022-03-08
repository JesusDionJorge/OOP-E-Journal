package simpleinheritances;

public class FlyingCar extends Car{
	private double flyingHeight;
	private double speed;
	public FlyingCar(){
		super();
		this.flyingHeight=0.0;
		
	}
	
	public FlyingCar(String modalName, String engineModal){
		super(modalName, engineModal);
		this.flyingHeight=0.0;
		
	}
	public void fly(){
		System.out.println("Flying");
	}
	
	public void ascend(){
		flyingHeight=flyingHeight+2;
		System.out.println("Flying Height :" + this.flyingHeight + "Meters");
	}
	
	public void accelerate(){
		speed=speed+10;
		
	}
	public void display(){
		super.display();
		System.out.println("Flying Height :"+ this.flyingHeight);
		
	}

	
 


}

