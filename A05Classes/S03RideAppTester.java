/* TODO: 03A
 * Extend the S03RideApp class by adding three get methods:
 * public String getPassenger()
 * public String getFromLocation()
 * public String getToLocation()
 * 
 * Use the tester to construct the S03RideApp class and invoke
 * the newly created access methods.
 * 
 * To receive full credit you must test these new get methods in
 * this tester.
 * 
 */
public class S03RideAppTester {

	public static void main(String[] args) {
		S03RideApp ronnie = new S03RideApp("ronnie", "dallas", "stl");
		S03RideApp tina = new S03RideApp("tina", "stl", "dallas");

		System.out.println(ronnie.getPassenger());
		System.out.println(ronnie.getFromLocation());
		System.out.println(ronnie.getToLocation());
		System.out.println(ronnie);

		System.out.println(tina.getPassenger());
		System.out.println(tina.getFromLocation());
		System.out.println(tina.getToLocation());
		System.out.println(tina);
	}
}
