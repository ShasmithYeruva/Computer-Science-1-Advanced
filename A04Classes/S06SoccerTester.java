
/* TODO: 06 
 * The S06SoccerPlayer class stores the number of goals and the 
 * number of matches a player has.
 * 
 * You will extend this class by writing a method to calculate the 
 * player's goals per game average. Write a method called:
 * 
 * public double getGoalsPerMatch()
 * Which is calculated by the number of goals divided by the number 
 * of matches. 
 * 
 * Write a message to output the goals per match, not just the number.
 * */
public class S06SoccerTester {
	public static void main(String[] args) {
		S06SoccerPlayer maysaJbarah = 
				new S06SoccerPlayer("Maysa Jbarah", 113, 110);
		System.out.println(maysaJbarah);
		System.out.println(maysaJbarah.toString2());
	}

}
