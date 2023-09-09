/* TODO: 04A
 * Update the toString method so that it outputs 
 * the contents of the array, each element in 
 * it's own line.
 */
public class S04ArrayPrinter
{
	private String[] buffer;

	public S04ArrayPrinter(String[] in) {
		buffer = in;
	}

	public String toString() {

		String s = "";
		for(int i = 0; i < buffer.length; i++) {
			s += buffer[i] + "\n";

		}
		return s;
	}

	public static void main(String[] args) {
		S04ArrayPrinter ap1 = new S04ArrayPrinter(new String[]{"a"});
		System.out.print(ap1);
		S04ArrayPrinter ap2 = new S04ArrayPrinter(new String[]{"a","b","c"});
		System.out.print(ap2);
	}

}
