package abstractclassExample;

public class HockeyPlayer extends Player 
{ 
	public HockeyPlayer( String  var) 
	{ 
		super(var);
	} 
	
	public void Play() 
	{ 
		System.out.println("Play Hockey:"+super.getName()); 
	} 
}