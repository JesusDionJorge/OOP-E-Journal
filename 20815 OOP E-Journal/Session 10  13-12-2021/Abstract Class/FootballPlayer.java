package abstractclassExample;

public class FootballPlayer extends Player 
{ 
	public FootballPlayer( String  var) 
	{ 
		super(var);
	}

	public void Play() 
	{ 
		System.out.println("Play Football:"+super.getName()); 
	} 
}
