public class S110_Objects implements Runnable {
	public class Car {
		// Three private attributes of different types
		private String name_;
		private double price_;
		private boolean isColorRed_;

		// This is a constructor that initializes all three attributes
		public Car(String name, double price, boolean isColorRed) {
			isColorRed_ = isColorRed;
			name_ = name;
			price_ = price;
		}
		// Assessor for "isColorRed" to read the variable 
		public boolean getIsColorRed() {
			return isColorRed_;
		}

		// Assessor for "name" to read the variable
		public String getName() {
			return name_;
		}

		// Assessor for "price" to read the variable
		public double getPrice() {
			return price_;
		}

		// Mutator for "isColorRed" to mutate or change the variable
		public void setIsColorRed(boolean isColorRed) {
			isColorRed_ = isColorRed;
		}


		// Mutator for "name" to mutate or change the variable
		public void setName(String name) {
			name_ = name;
		}


		// Mutator for "price" to mutate or change the variable
		public void setPrice(double price) {
			price_ = price;
		}

		// The toString method
		// It is a special method to convert the object to a String
		public String toString() {
			String s = "Car name = " + getName();
			s += " Is the car colored red = " + getIsColorRed();
			s +=  "Price = " + getPrice();
			return s;
		} 

	}
	// Declaring the three objects of "Car"
	Car audiREight;
	Car kiaSoul;
	Car bmwXFive;

	public void run() {
		// Allocated memory for your three objects
		audiREight= new Car ("Audi R8",148700,true);
		kiaSoul = new Car ("Kia Soul",19190,false);
		bmwXFive = new Car ("BMW X5",59400,false);
		// Printing out each object using System.out.println
		System.out.println(audiREight);
		System.out.println(kiaSoul);
		System.out.println(bmwXFive);
	}
}