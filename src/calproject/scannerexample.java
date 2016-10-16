package calproject;

import java.util.Scanner;

public class scannerexample {

	public static void main(String[] args) { 
		
		// create  a scanner object.
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter your first name");
		 String name = sc.nextLine();
		 System.out.println("enter your last name");
	     String name1 = sc.nextLine();
		 
		 System.out.println("enter your height");
		 double myheight = sc.nextDouble();
		 System.out.println();
		 System.out.println("first name+ last name+ height);

	}

}
