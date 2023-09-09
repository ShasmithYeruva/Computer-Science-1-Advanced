/* TODO: 04A 
 * In this problem you extend the S04ComplexNumber 
 * class by adding two accessor (or getter) and 
 * two setter (or modifier methods). Here are the 
 * methods you are required to add.
 * 
 * public void setReal(int real)
 * public int getReal()
 * public void setImaginary(int imaginary)
 * public int getImaginary()
 *  
 * To receive full credit you must test these new 
 * mutators and accessors in this tester.
 */
public class S04ComplexNumberTester {

	public static void main(String[] args) {
		/* Add test code here */
		S04ComplexNumber cnA = new S04ComplexNumber(2, 3);
		S04ComplexNumber cnB = new S04ComplexNumber(4, 5);
		System.out.println(cnA);
		System.out.println(cnB);
	}
}
