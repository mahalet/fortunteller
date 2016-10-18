package calproject;

import java.util.Scanner;

public class Fortuenteller  {
	
   public static void main(String[] args){
	
		Scanner values = new Scanner(System.in);
		boolean soccer =true ;
		while( soccer ){
		// Allow an exit by entering "Quit" 
		System.out.println("Welcome to Fortune Teller. Enter \"Quit\" to leave.");

		// Allow a restart by entering "restart"
		System.out.println("Enter \"Restart\" at any point to start over.");
		
		System.out.println("enter frist name");
		String first = values.nextLine();
		System.out.println(" Enter last name: ");
		String second = values.nextLine();
		System.out.println("enter age: ");
		 int age= values.nextInt();
		 values.nextLine(); //to eat the return from nextInt
		 
		// in what month were you born ?
		 
		        System.out.println("enter birth month by letter");
		        	
		        	String birth = values.nextLine();


      String bMonthFirstLetter = birth.substring(0,1).toLowerCase();
      String bMonthsecondtLetter = birth.substring(1,2).toLowerCase();
      String bMonththiredLetter = birth.substring(2,3).toLowerCase();
			//  Ask the user for the user’s favorite ROYGBIV color	   
			//  If the user does not know what ROYGBIV is, ask them to enter “Help" 
			//  (print with the quotation marks) to get a list of the ROYGBIV colors
			// switch case	
					  			  
		   System.out.println("what is your favorite ROYGBIV COLOR ? if the user does not know what dose it mean ? we got you ROYGBVI mean  [R]red,[O]orange,[Y]yelow,[G]green,[B]blue,[I]indigo,[V]violet ");
		   char color = values.nextLine().toUpperCase().charAt(0);
              switch (color){
		 case 'R' :
			 System.out.println("red");
		     break;
		   case 'O':
			 System.out.print("orange");
			 break;
		   case 'Y':
			  System.out.println("yelow");
			  break ;
		   case 'G':
			  System.out.println("green");
			  break;
		   case 'B':
			   System.out.println("blue");
			   break;
		   case 'I':
			   System.out.println("indigo");
			   break;
		   case 'v':
			   System.out.println("violet");
		   default :
			   System.out.println("invalid color");
			   break;
		   }
		   // part two
		  // If the user’s age is an odd number, then they will retire in ____ 
		  //  years, or ___ years if their age is an even number.
		  // even or odd
		  int answer ;
		  System.out.println("How many siblings do you have?");
		  values.nextLine();
		   if (age% 2 == 0){
		     answer = 24 ;
		  } else {
			  answer = 31 ;
		    
		  }
	     // If the user’s number of siblings is 0, then they will live in __(location),
	     // or 1 then they will live in __(location), or 2 then they will live in
		// ___ (location), or 3 then they will live in ___ (location), or more than 3
		// then they will live in ____ (location).
					  
		   String zone  = "secret" ;
		   int nSiblings = values.nextInt();
		   values.nextLine();
		   
		   if ( nSiblings == 1){
			  
			   zone = "columbus";
		   }
		   if (nSiblings== 2) {	
			   zone  = "atlanta";
		   }
		   if  (nSiblings == 3) {
			   
			   zone = "cliveland";
		   }
		   if (nSiblings >= 4) {
			  
			   zone = " new york";
		   }
		
		   // Depending on which ROYGBIV color is the user’s favorite, they will 
		   // have a specific mode of transportation (i.e. car, boat, plane, etc.)
			   System.out.println("what is your lexury transportation type");
			   String drive ="unknown" ;
			   values.nextLine();
				int unknown = 0 ;	   
			   switch (unknown) {
			   
			   case 'R':
				   drive = "plane";
				   break ;
			   case 'O' :
				   drive = "boat";
				   break ;
			   case 'Y' :
				   drive = "car";
				   break ;
			   case 'G':
				   drive = "bicycle";
				   break;
			   case 'B':
				   drive = "shuttle bus";
				   break;
			   case 'I':
				   drive = "indigo";
				   break;
			   case 'v' :
				   drive = "violet";
				   break;
			  default :
				  drive = "damage";
				  break;
			   }
				   
		//  If the first letter of the user’s birth month can be found in either 
	    //  their first or last name, then they will have $____ in the bank, or if 
	    //  the second letter of the user’s birth month can be found in either the 
	    //  user’s first or last name, then they will have $____ in the bank, or if 
		//  the third letter of the user’s birth month can be found in either the 
		//  user’s first or last name, then they will have $____ in the bank. 
		//  If there are no common letters, then they will have $____ in the bank.   
			String bank; 
		String location = "secret" ;

			
				String lowerFullname = ( first + second ). toLowerCase();       
				if (lowerFullname.lastIndexOf(bMonthFirstLetter) >= 0 ){
				    bank = "$ 60,000,000" ;
				}else if (lowerFullname.lastIndexOf(bMonthsecondtLetter) >= 0){
				    bank = "$ 45,000,000";
				}else if (lowerFullname.lastIndexOf(bMonththiredLetter)>= 0){
					bank = "30,000,000";
				}else  {
					bank = "10'000";
				}
				
			// part 3
		    // The user’s fortune should be written as such:
			// [First Name] [Last Name] will retire in [# of Years] with [Amount of 
			// Money] in the bank, a vacation home in [Location] and a [Mode of 
		    // Transportation].
			// After telling the user’s fortune, ask the user if they would like to
		    // try again. If they would then the program should start over, otherwise the program should end.
			// Program should be able to handle whether or not a user inputs capital or lowercase letters.						
		values.nextLine();
		    System.out.println( first + "" + second + "you shall retire"+ answer + "years with the total saving of " + bank + ",");
	        System.out.println("You shall call " + zone + " your home. ");
			System.out.println("You shall own a " + drive + ", and  transportation. ");
			System.out.println("Would you like another reading?");
        // end of main loop
        // Close scanner
			String dawit = values.nextLine();
			values.nextLine();
			 
		 	{if ( values.equals("Quit")){
				System.out.println("restart");
			}else {
				System.out.println("Goodbye");
				return ;
		}
		}
   }
}   
//end of class {}
	

}

		
		
			 
			
			
	


		

						   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				  
						  
						  
						  
						
				
		





			   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
			  
			  
			


   
	

					   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					
		   
			  
			  			  

