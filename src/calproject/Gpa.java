package calproject;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Gpa {

	public static void main(String[] args) {
	  // TODO auto generated
		Scanner inpute = new Scanner(System.in);
		System.out.println("how many class did you have");
		int classes = inpute.nextInt();
		String grades = "";
		int total = 0;
		int dec;
		
		
		for(int j =0; j < classes ; j++) {
			
			
			Scanner inputters = new Scanner(System.in);
			System.out.println("what is your grade");
			grades = inputters.nextLine();
			
			if (grades.equals("A"));{
			  dec = 4;
			  total += dec;
		}  else if(grades.equals("B"));{
			  dec = 3;
			  total += dec;
		} else if(grades.equals("c"));{
	    	   dec = 2;
	    	   total += dec;
		}else if(grades.equals("d"));{
			   dec = 1;
			   total += dec;
		}else if(grades.equals("F"));
			   dec = 0;
			   total += dec;
		}
		
		double GPA = total/classes;
		  // print the GPA
		System.out.println("my total GPA is +GPA");
		  
		 // formating the decimale value after point
		   Decimale Formating formatter = new Decimale Format("0.##");
		   System.out.println("Formated GPA " + Formater Formate GPA);
		}
	       }
			
		}  
	   
	

	}

