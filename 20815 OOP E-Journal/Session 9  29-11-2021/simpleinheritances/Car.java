package simpleinheritances;

public class Car {
	private double speed;
	private String modalName;
	private String engineModal;
	private String engineStatus;
	
	public Car(){
		this.modalName = "";
		this.engineModal = "";
		this.speed=0.0;
		this.engineStatus="";
	}
	
	public Car(String modalName, String engineModal) {
		this.modalName = modalName;
		this.engineModal = engineModal;
		this.speed=0.0;
		this.engineStatus="";
	}
	public void start(){
		this.engineStatus="start Mode";
		this.speed=0.0;
	}
	
	public void stop(){
		this.engineStatus="stop Mode";
		this.speed=0.0;
	}

	public void startStop(String s){
		if(s.equalsIgnoreCase("stop")){
			this.stop();
		}else if (s.equalsIgnoreCase("start")){
			this.start();
		}
	}
	
	public void accelerate(){
		speed=speed+3;
	}
	
	public void deaccelerate(){
		speed=speed-2;
	}
	
	public void applyBrake(){
		this.speed=0.0;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getModalName() {
		return modalName;
	}

	public void setModalName(String modalName) {
		this.modalName = modalName;
	}

	public String getEngineModal() {
		return engineModal;
	}

	public void setEngineModal(String engineModal) {
		this.engineModal = engineModal;
	}

	public String getEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(String engineStatus) {
		this.engineStatus = engineStatus;
	}	
	public void display() {
		System.out.println("Car Model Name: "+modalName);
		System.out.println("Car Engine Model: "+engineModal);
		System.out.println();
	}
	

}
