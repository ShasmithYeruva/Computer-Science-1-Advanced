import java.util.Random;

public class Wow {
	public static void main(String[] args) {
		RandomCar randomCar = new RandomCar();
		// Printing out the "horsePower" and "price" using System.out.println
		System.out.println(randomCar);
	}
}

class RandomCar {
	//This block of code initializes the variables
	private final int horsePower;
	private final double price;

	public RandomCar() {
		Random random = new Random();
		//This line of code pulls a random number for the horsepower
		this.horsePower = random.nextInt(150, 800);
		//This line of code pulls a random double to determine the price
		this.price = Double.parseDouble(String.format("%.2f", random.nextDouble(10000, 1000000)));
	}
	// Assessor for "horsePower" to read the variable
	public int getHorsePower() {
		return horsePower;
	}
	// Assessor for "price" to read the variable
	public double getPrice() {
		return price;
	}
	//Returns the "horsePower" and "price" values in a string format
	public String toString() {
		return ("The car you created costs $" + price + " and has " + horsePower + " horsepower");
	}
}