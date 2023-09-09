

public class S08Wow {
	// Variables are initialized 
	private double pizzaRadius_;
	private double pepperoniRadius_;
	private int numberOfPepperoni_;
	private double x;
	private double y;

	// Constructor gives values to instance variables
	public S08Wow(double pizzaRadius, double pepperoniRadius,
			int numberOfPepperoni)
	{
		pizzaRadius_ = pizzaRadius;
		pepperoniRadius_ = pepperoniRadius;
		numberOfPepperoni_ = numberOfPepperoni;
	}

	// Assessor for "numberOfPepperoni" to read the variable
	public int getnumberOfPepperoni() {
		return numberOfPepperoni_;
	}

	// Assessor for "pizzaCircumference" by using pizzaRadius_
	public double getPizzaCircumference()
	{
		return (pizzaRadius_ * 3.1415);
	}

	// Assessor for "pepperoniCircumference" by using pepperoniRadius_
	public double getPepperoniCircumference()
	{
		return (pepperoniRadius_ * 3.1415);
	}

	// Assessor for "pizzaRadius" to read the variable
	public double getPizzaRadius()
	{
		return pizzaRadius_;
	}

	// Assessor for "pepperoniRadius" to read the variable
	public double getPepperoniRadius()
	{
		return pepperoniRadius_;
	}

	// Assessor for "pepperoniArea" by using pepperoniRadius_
	public double getPepperoniArea()
	{
		x = pepperoniRadius_ * pepperoniRadius_;
		x = x * 3.14;
		return x;
	}

	// Assessor for "allPepperoniArea" by using pepperoniRadius_
	public double getAllPepperoniArea()
	{
		return getPepperoniArea() * numberOfPepperoni_;
	}

	// Assessor for "pizzaArea" to read the variable by using pizzaRadius_
	public double getPizzaArea(){
		y = pizzaRadius_ * pizzaRadius_;
		y = y * 3.14;
		return y;
	}

	/* Finds if the area of all the pepperoni is more or less than the area
	 * of the pizza
	 */
	public String canPepperoniFit() {
		if(getPizzaArea() > getAllPepperoniArea()) {
			return " the pepperoni can fit in the pizza!";
		}
		else {
			return  " the pepperoni can not fit in the pizza!";
		}
	}

	// returns all variable info in a String
	public String toString()
	{
		return "This Pizza's Circumference is " + getPizzaCircumference() +
				",\n" + "it's radius is " + getPizzaRadius() + ",\n" +
				"and it's area is "+ getPizzaArea() + ".\n" +
				"The pizza has " + getnumberOfPepperoni() + 
				" pepperoni, \n" + "The pepperoni's circumference is " +
				getPepperoniCircumference() + ",\n" + "it's radius is " +
				getPepperoniRadius()+",\n"+ "and it's area is "+
				getPepperoniArea() + ".\n"
				+ "This means that"  + canPepperoniFit();
	}
}

