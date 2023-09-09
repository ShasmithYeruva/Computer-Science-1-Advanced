/* TODO: 06
 * Write a function to compute the length of side c using the 
 * Law of cosines where
 * c = sqrt(a^2 + b^2 - 2*a*b*cos(Gamma))
 * To receive full credit, use all the following Math functions
 * Math.pow, Math.sqrt, Math.cos, Math.PI
 * Also note that the input of the computeLawOfCosine function
 * must accept degrees for gamma.
 * 
 */
public class S06LawOfCosine {

	public static void main(String[] args) {
	}

	public static double computeLawOfCosine(
			double sidea, 
			double sideb, 
			double gammaDegrees) {
		double gammaRadians = gammaDegrees * (Math.PI/180);
		double squareRoot = (Math.pow(sidea,2) + Math.pow(sideb, 2)) - (2 * sidea * sideb * Math.cos(gammaRadians));
		return Math.sqrt(squareRoot);
	}

}