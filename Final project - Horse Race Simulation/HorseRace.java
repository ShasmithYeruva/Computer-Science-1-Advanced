
public class HorseRace {
	Randomizer random;
	public HorseRace(Randomizer random) {
		this.random = random;
	}
	//This method pulls a random integer for the horse speed
	//This comes from the randomizer class
	public int getHorseSpeed() {
		return random.nextInt();
	}
	//This method pulls a random boolean for if the horse is standing or not
	//This comes from the randomizer class
	public boolean getStanding() {
		return random.nextBoolean();
	}
}
