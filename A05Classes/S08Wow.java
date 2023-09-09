

public class S08Wow {
	//Initializes the variables
	private double oppositeSide_;
	private double adjacentSide_;
	private double hypotenuseSide_;
	private double angleA_;
	private double angleB_;
	private double angleC_;
	// This method is the constructor
	public S08Wow(double oppositeSide, double angleA, double angleB) {
		oppositeSide_ = oppositeSide;
		angleA_ = angleA;
		angleB_ = angleB;
	}
	// Accessor for the opposite side
	public double getOppositeSide() {
		return oppositeSide_;
	}
	// Accessor for the hypotenuse
	public double getHypotenuseSide() {
		double angleARadians_ = angleA_ * (Math.PI / 180);
		hypotenuseSide_ = Math.sin(angleARadians_);
		hypotenuseSide_ = getOppositeSide() / hypotenuseSide_;
		return hypotenuseSide_; 
	}	
	// Accessor for the Adjacent side
	public double getAdjacentSide() {
		adjacentSide_ = (Math.pow(getHypotenuseSide(), 2)) + 
				(Math.pow(getOppositeSide(), 2));
		adjacentSide_ = Math.sqrt(adjacentSide_);
		return adjacentSide_;
	}
	// Accessor for angle A
	public double getAngleA() {
		return angleA_;
	}
	// Accessor for angle B
	public double getAngleB() {
		return angleB_;
	}
	// Accessor for angle C
	public double getAngleC() {
		angleC_ =  - angleA_ - angleB_;
		angleC_ = angleC_ + 180;
		return angleC_;
	}
	// A String toString method that creates a print line
	public String toString() {
		return "This trangle has angles of " + getAngleA() + ", " + 
				getAngleB() + ", " + getAngleC() + ". It also has sides "
				+ "measured at " + getOppositeSide() + ", " 
				+ getHypotenuseSide() + ", " + getAdjacentSide() + ".";
	}
}
