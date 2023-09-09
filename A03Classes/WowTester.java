

import java.util.Random;

public class WowTester {
	public static void main(String[] args) {
		double finalPrice;
		// Variables are initialized 
		Wow baseball = new Wow("baseball", "white", "small", 7.99);
		Wow basketball = new Wow("basketball", "orange", "large", 34.99);
		Wow football = new Wow("football", "brown", "medium", 29.99);
		Wow soccerBall = new Wow
				("soccer ball", "black and white", "large", 39.45);
		Random random = new Random();
		// Array with all objects
		Wow[] ballList = {baseball, basketball, football, soccerBall};
		int ballSelector = random.nextInt(ballList.length-1);
		// This next chunk of code randomly picks out a ball and prints it
		System.out.println(ballList[ballSelector]);
		System.out.println("Will it be upsold?");
		boolean randomTwo = Randomizer.nextBoolean();
		// If statements run to determine if the price will change
		if(randomTwo) {
			System.out.println("Yes!");
			// This line finds the new price
			finalPrice = Double.parseDouble(String.format
					("%.2f", random.nextDouble(39.45, 73.46)));
			// This prints out the new price
			System.out.println("Your new price of the ball is now $" + finalPrice);
		}
		else if (! randomTwo){
			// This line gets the already established price
			System.out.println("No, so my final price is $" + ballList[ballSelector].getPrice());
		}
	}
}
