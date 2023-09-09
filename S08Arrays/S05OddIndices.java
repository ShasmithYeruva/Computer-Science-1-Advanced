/* TODO: 05
 * Update the toString method so that it outputs 
 * just the elements stored at the odd indices of
 * the array, each element in it's own line.
 */
public class S05OddIndices {

	private int[] buffer;
	
	public S05OddIndices(int[] in) {
		buffer = in;
	}

	public String toString() {

		String s = "";
		for(int i = 0; i < buffer.length; i++) {
			if((i % 2 != 0)){
				s += buffer[i] + "\n";
			}
			

		}
		return s;
	}

    public static void main(String[] args) {
    	S05OddIndices oi1 = new S05OddIndices(new int[]{4});
    	System.out.print(oi1);
    	S05OddIndices oi2 = new S05OddIndices(new int[]{10, 20, 30, 40});
    	System.out.print(oi2);
    	S05OddIndices oi3 = new S05OddIndices(new int[]{10, 20, 30, 40, 50});
    	System.out.print(oi3);
    }
	
	
}
