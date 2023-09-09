
public class Client implements Runnable {

	@Override
	//The code underneath initializes the variables
	public void run() {
		Randomizer randomizer = new Randomizer();
		HorseRace horseRace = new HorseRace(randomizer);
		Player bob = new Player(horseRace, randomizer);
		Player sam = new Player(horseRace, randomizer);
		String winner = null;
		int bobSpeed = bob.play();
		boolean bobStanding = bob.isStanding();

		int samSpeed = sam.play();
		boolean samStanding = sam.isStanding();

		System.out.print("The Race begins with Sam and Bob ");
		System.out.println("behind the starting line!");
		System.out.print("The first person who passes ");
		System.out.println("the finish line wins!");

		// This block of code explains what is happening in the race
		if(samSpeed > bobSpeed) {
			System.out.println("Sam is in the lead!");
		}
		else if (bobSpeed > samSpeed) {
			System.out.println("Bob is in the lead!");
		}		
		else if (samSpeed == bobSpeed) {
			System.out.println("Bob and Sam are tied as far!");
		}

		if (bobStanding == false) {
			System.out.println("Bob's horse has fallen!");
		}
		if (samStanding == false) {
			System.out.println("Sam's horse has fallen!");
		}




		// This if statement checks if Sam's horses speed is higher than Bob's
		//It also checks if Sam's horse is still standing
		if(samSpeed > bobSpeed && samStanding == true) {
			winner = ("Sam wins!");
		}
		// This if statement checks if Sam's horses speed is lower than Bob's
		//It also checks if Bob's horse is still standing
		else if(samSpeed < bobSpeed && bobStanding == true) {
			winner = ("Bob wins!");
		}
		// This if statement checks if Sam's horse is standing
		//It also checks if Bob's horse has fallen
		else if(samStanding == true && bobStanding == false) {
			winner = ("Sam wins!");
		}
		// This if statement checks if Bob's horse is standing
		//It also checks if Sam's horse has fallen
		else if(bobStanding == true && samStanding == false) {
			winner = ("Bob wins!");
		}
		// This else statement finds if both horses have fallen
		// It also checks if both horses are the same speed
		else {
			winner = "a tie!";
		}
		//The next print lines tell who the winner is
		System.out.println("The result of the race is... ");
		System.out.println(winner);
	}

}	