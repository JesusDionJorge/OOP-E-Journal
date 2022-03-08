package abstractclassExample;

public class CricketPlayer extends Player 
{ 
	public CricketPlayer( String  var) 
	{ 
		super (var);
	} 
	public void Play(){ 
		System.out.println("Play Cricket:"+super.getName()); 
	} 
	
}