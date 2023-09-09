public class S07SummableTester {

	public static void main(String[] args) {
		/* TODO 07B: Add test code here.
		 * Points deducted for not adding test code. */
		S07City Dallas = new S07City("Dallas", 500000);
		S07City NY = new S07City("NY", 200000);
		S07City frisco = new S07City("frisco", 150000);
		System.out.println(Dallas);
		System.out.println(NY);
		System.out.println(frisco);
		System.out.println(NY.add(frisco));
	}

}
