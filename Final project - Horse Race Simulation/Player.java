
public class Player {
	HorseRace horseRace_;
	Randomizer randomizer_;

	public Player(HorseRace horseRace, Randomizer randomizer) {
		horseRace_ = horseRace;
		randomizer_ = randomizer;
	}

	// This method gets the horse's speed
	public int play() {
		int speed = horseRace_.getHorseSpeed();
		return speed;
	}
	// This method gets if the horse's are standing or not
	public boolean isStanding() {
		return horseRace_.getStanding();
	}
}