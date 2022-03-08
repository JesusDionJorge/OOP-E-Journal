package oop_practice;
//20.Create a Car Class with attributes and behaviors that you feel that it should be there.
public class Car {
	double speed; 
	private String modalName; 
	private String engineModal; 
	private String engineStatus;
	
	public Car() {  
		this.modalName = "BMW M3 GTR"; 
		this.engineModal = "BMW P60B40 4.0 L V8 engine";
		this.speed = 0.0;
		this.engineStatus = "";
	} 
	
	public void start() {
		this.engineStatus="start Mode"; 
		this.speed=0.0; 
	} 

	public void stop() { 
		this.engineStatus="stop Mode"; 
		this.speed=0.0; 
	} 

	public void accelerate(){ 
		speed=speed+14; 
		System.out.println("Speed: "+speed);
	} 

	public void deaccelerate(){ 
		if(speed==0){
			System.out.println("Speed: 0");
		}
		else {
			speed=speed-14;
			System.out.println("Speed: "+speed);
		}
		
	} 

	public void applyBrake(){ 
		this.speed=0.0; 
		System.out.println("Speed: "+speed);
	} 
	
	
	public double getspeed() {
		return speed;
	}
	public String getengineModal() {
		return engineModal;
	}
	public String getengineStatus() {
		return engineStatus;
	}
	public String getmodalName() {
		return modalName;
	}
	
	
	public void setspeed(double speed) {
		this.speed = speed;
	}
	public void setengineModal(String engineModal) {
		this.engineModal = engineModal;
	}
	public void setengineStatus(String engineStatus) {
		this.engineStatus = engineStatus;
	}
	public void setmodalName(String modalName) {
		this.modalName = modalName;
	}
	
	
	public void display() {
		System.out.println("Car Model Name: "+modalName);
		System.out.println("Car Engine Model: "+engineModal);
		System.out.println();
	}
	
	
}
