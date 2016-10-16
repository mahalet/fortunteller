package calproject;
import java.math.*;
import java.util.Scanner;

public class Dawit {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //String answer;
    
    // Math Maths = new maths();
     double answer = 0;
     BigDecimal inputeA,inputeB;
     char operator;
     boolean done = false;
     
     while(done == false){
    	 System.out.println("please enter your first number:"); 
    	 inputeA = new BigDecimal(input.next());
    	 
    	 System.out.println("please enter your operator (+,-,*,/):");
    	 operator= input.next().charAt(0);
    	 
    	 System.out.println("please enter your second number:");
    	 inputeB = new BigDecimal(input.next());
    	 
    	 switch(operator){
    	    case '+' : //answer = inputeA.add(inputeB);
    	    		System.out.println(inputeA.add(inputeB));
    	               break;
    	    case '-' : //answer = Math.sub(inputeA,inputeB);
    	    	     System.out.println(inputeA.subtract(inputeB));
    	               break;
    	    case '*' : //answer = Maths.mult(inputeA,inputeB);
    	    	      System.out.println(inputeA.multiply(inputeB));
    	               break;
    	    case '/' : //answer = Maths.div(inputeA,inputeB);
    	    	      System.out.println(inputeA.divide(inputeB));
    	               break;
    	    case '^' : //answer = Maths.pow(inputeA,inputeB);
    	 }
    	               
    	    System.out.println(answer);
    	 }
	
	    }inpute.close();
     }
     
     
	}


