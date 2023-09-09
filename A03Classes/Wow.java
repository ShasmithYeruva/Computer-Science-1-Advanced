

public class Wow {
	// This initialized the variables
	private String ballName;
	private String color;
	private String size;
	private double price;
	// Constructor gives values to instance variables
	public Wow(String ballName_, String color_, String size_, double price_)
	{
		ballName = ballName_;
		color = color_;
		size = size_;
		price = price_;
	}
	// returns price
	public double getPrice()
	{
		return price;
	}
	// returns all instance variable info in a String
	public String toString()
	{
		return "My ball is a " + ballName + ", the color is " +
				color + ", the size is " + size + ", and the price of it is $" + price;
	}
}
