

public class S06SoccerPlayer {

	String name_;
	double goalsDouble;
	double matchesDouble;
	double goalsPerMatch_;
	int goalsInt;
	int matchesInt;

	public S06SoccerPlayer(String name, int goals, int matches) {
		name_ = name;
		goalsDouble = goals;
		matchesDouble = matches;
		matchesInt = matches;
		goalsInt = goals;
		goalsPerMatch_ = goalsDouble / matchesDouble;
	}

	public String toString() {
		return name_ + ": " + goalsInt + "/" + matchesInt;
	}

	public double getGoalsPerMatch() {
		// Modify the return to indicate goals per matches.
		return goalsPerMatch_;
	}
	public String toString2() {
		return (name_ + " averages " + goalsPerMatch_ + " goals per match");
	}
}
