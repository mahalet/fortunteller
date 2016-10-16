package calproject;

import java.util.Scanner;

public class Gpscal {

  public static void main(String[] args) {
		// String grade;
		
		Scanner value = new Scanner(System.in);
		

			System.out.println("enter a number");
			double firstvalue = value.nextDouble();
			
			System.out.println("Enter another number: ");
			 double secondValu = value.nextDouble();
			 System.out.println("Choose your grade (A,B,C,D,F): ");
			 String values = value.next();
			
			 
		switch (grade){
		 
		case "A":
			System.out.println("result:");
			System.out.println(4);
			break;
		case "B":
			System.out.println("result:");
			System.out.println(3);
			break;
		case "C":
			System.out.println("result");
			System.out.println(2);
			break;
		case "d":
			System.out.println("result");
			System.out.println(1);
			break;
		case "F":
			System.out.println("result");
			System.out.println(0);
  }
  }
      grade = value.next();
}while(grade.equal("yes"));
value.close();
	
			
	}
	

}
