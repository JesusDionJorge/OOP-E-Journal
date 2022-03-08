package abstractclassExample;
// using class abstraction to achieve polymorphism --Dynamic
public class PlayerDemo 
{ 
	public static void main(String[] args) 
	{ 
		Player p1, p2;                    // set up var for an Playerl 

		CricketPlayer  aCplayer = new CricketPlayer("Sachin");  // makes specific objects 
		HockeyPlayer aHplayer = new HockeyPlayer("Dhanaraj"); 
		FootballPlayer aFplayer = new FootballPlayer("Bhutia"); 
		p2 = new CricketPlayer("Sachin");
		p2.Play();

		p2 = new HockeyPlayer("Dhanaraj");
		p2.Play();

		p2 = new FootballPlayer("Bhutia");
		p2.Play();
	} 
}