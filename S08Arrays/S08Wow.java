public class S08Wow {
	// Variables are initialized 
	private double squareSide_;
	private double circleRadius_;
	private double circleArea_;
	
	// Constructor gives values to instance variables
	public S08Wow(double squareSide, double circleRadius)
	{
		squareSide_ = squareSide;
		circleRadius_ = circleRadius;
	}

	// Assessor for "squareSide" to read the variable
	public double getSquareSide() {
		return squareSide_;
	}

	// Assessor for "circleRadius" by using circleRadius_
	
	// Assessor for "circleArea" by using circleRadius_
	public double getCircleArea() {
		circleArea_ = Math.pow(circleRadius_, 2) * Math.PI;
		return circleArea_;
	}
	
	// Assessor for "squareArea" by using squareSide_ but takes an int
	public double getSquareArea()
	{
//		squareArea_ = 
		return Math.pow(squareSide_, 2);
	}
	
	// Assessor for "squareArea" by using squareSide_ but takes a double
	
	// Assessor for "circleRadius" to read the variable
	public double getCircleRadius()
	{
		return circleRadius_;
	}
	
	public void setCirleRadius(int radius) {
		circleRadius_ = radius;
	}
	
	public void setCircleRadius(double radius) {
		circleRadius_ = radius;
	}
	
	

	/* Finds if the area of the circle is more or less than the area
	 * of the square
	 */
	
	
	public String canCircleFit() {
		if(getSquareArea() > getCircleArea()) {
			return ( " The circle can fit in the square!");
		}
		else {
			return (" The circle can not fit in the square!");
		}
	}

	public String toString() {
		return "S08Wow [squareSide = " + squareSide_ + ", circleRadius = " + circleRadius_ + ", circleArea = "
				+ getCircleArea() + ", squareArea = " + getSquareArea() + canCircleFit() +  "]";
	}
}
