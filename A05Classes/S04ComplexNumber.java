public class S04ComplexNumber {
	private int real_;
	private int real2;
	private int imaginary_;

	public S04ComplexNumber(
			int real, 
			int imaginary) {
		real_ = real;
		imaginary_ = imaginary;
		real2 = real;
	}

	/* TODO: 04B
	 * Add new mutators and accessors here.
	 */	public int getReal() {
		 return real_;
	 }
	 public int getImaginary() {
		 return imaginary_;
	 }
	 public void setReal(int real) {
		 real_ = real;
	 }
	 public void setImaginary(int imaginary) {
		 imaginary_ = imaginary;
	 }
	 public String toString() {
		 return real_ + " + " + imaginary_ + "i";
	 }
	 public void add(S04ComplexNumber other) {
		 real_ += other.real_;
		 imaginary_ += other.imaginary_;

	 }
	 public void subtract(S04ComplexNumber other) {
		 real_ -= other.real_;
		 imaginary_ -= other.imaginary_;
	 }
	 public void multiply(S04ComplexNumber other) {
		 real_ = (real_ * other.real_) - (imaginary_ * other.imaginary_);
		 imaginary_ = (real2 * other.imaginary_) + (imaginary_ * other.real_); 

	 }
}
