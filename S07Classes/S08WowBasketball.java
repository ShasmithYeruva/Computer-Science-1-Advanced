
public class S08WowBasketball extends S08Wow{
	//Initializes the variables
	private int radius;
	private double price;
	public String name;
	//This is the constructor
	public S08WowBasketball(int radius, double price, String name) {
		super(radius, price, name);
		this.radius = radius;
		this.price = price;
		this.name = name;
	}

	//Uses the surface area formula to calculate by using the radius
	public double getArea() {
		return 4 * Math.PI * (radius * radius);
	}

	//This finds the price divided by the surface area
	public double getPricePerSquareInch() {
		return price / getArea();
	}

	//Uses the volume to calculate the buoyancy of the Basketball
	public double getBuoyancy() {
		return 997 * getVolume() * 9.807;
	}

	//Finds the volume using the radius
	public double getVolume() {
		return 1.33 * Math.PI * Math.pow(radius,3);
	}

}
