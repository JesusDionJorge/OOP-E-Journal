package abstractclassExample;

public abstract class Player  { 
	private String name; 
	
	public Player(String nm){ 
		name=nm;  
	} 
	public String getName() {        // regular method 
	
		return name;
	} 
	
	public abstract void Play(); //  abstract method: no implementation 
	 
} 