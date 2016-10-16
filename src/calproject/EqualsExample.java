package calproject;

public class EqualsExample {

	public static void main(String[] args) {
		// wrapper class declaration
		// should be an object of the sum type
		 Integer x =5;
		 Integer y = 10;
		 Integer z = 5;
		 short a = 5; // type short vs. integer
		 
		 // print the output
		 System.out.println(x.equals(y));
		 System.out.println(x.equals(z));
		 System.out.println(!(x.equals(a)));

	}

}
