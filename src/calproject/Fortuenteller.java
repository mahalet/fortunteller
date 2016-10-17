package calproject;

import java.util.Scanner;

public class Fortuenteller  {
	
   public static void main(String[] args){
	
		Scanner values = new Scanner(System.in);
		
		// Allow an exit by entering "Quit" 
		System.out.println("Welcome to Fortune Teller. Enter \"Quit\" to leave.");

		// Allow a restart by entering "restart"
		System.out.println("Enter \"Restart\" at any point to start over.");
		
		System.out.println("enter frist name");
		String first = values.nextLine();
		System.out.println(" Enter last name: ");
		String second = values.nextLine();
		System.out.println("enter age: ");
		 int value = values.nextInt();
		 String output = values.nextLine();
		 
		// in what month were you born ?
		 
		         System.out.println("enter number for birth month ");
		         System.out.println("1,2,3,4,5,6,7,8,9,10,11,12");
					int birth = values.nextInt();
					values.nextLine();
			            
				      if ( birth == 1 ){
					  System.out.println("Jan");
					  }else if ( birth == 2){
					  System.out.println("feb");
					  }else if (birth == 3){
					  System.out.println("mar");
					  }else if (birth == 4){
					   System.out.println("apr");
					  }else if (birth == 5){
					   System.out.println("may");
					  }else if (birth == 6){
					   System.out.println("jun");
					  }else if( birth == 7){
					   System.out.println("jul");
					  }else if(birth == 8){
					  System.out.println("aug");
					  }else if(birth == 9){
					   System.out.println("sep");
					  }else if(birth == 10){
					   System.out.println("oct");
					  }else if(birth == 11){
						System.out.println("nov");
					  }else if(birth == 12){
					  System.out.println("dec");
				
					  
			//  Ask the user for the user’s favorite ROYGBIV color	   
			//  If the user does not know what ROYGBIV is, ask them to enter “Help" 
			//  (print with the quotation marks) to get a list of the ROYGBIV colors
			// switch case	
					  			  
		   System.out.println("what is your favorite ROYGBIV COLOR ? if the user does not know enter /HELP/" );  		  
		   String color = values.nextLine();
		   String inpute ;
		   int inpute1 = 0 ;
		   switch (inpute1){
		      
		   case 'R':
		      System.out.println("red");
		     break ;
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
		       break;
		   default :
			   System.out.println("invalid color");
		   }
		   System.out.println("your color is "+ inpute1);
		   // part two
		  // If the user’s age is an odd number, then they will retire in ____ 
		  //  years, or ___ years if their age is an even number.
		  // even or odd
		  int answer ;
		   System.out.println("enter an integer to check if it is odd or even");
		    if (value % 2 == 0);
		     System.out.println("eneter even number");
		  } else {
		     System.out.println("enter odd number");
		  }
	     // If the user’s number of siblings is 0, then they will live in __(location),
	     // or 1 then they will live in __(location), or 2 then they will live in
		// ___ (location), or 3 then they will live in ___ (location), or more than 3
		// then they will live in ____ (location).
					  
		   String zone  = "secret" ;
		   int value1 = 0 ;
		   
		   if ( value1 == 1){
			   zone = "columbus";
		   }
		   if (value1 == 2) {
			   zone = "atlanta";
		   }
		   if  (value1 == 3) {
			   zone = "cliveland";
		   }
		   if (value1 == 4) {
			   zone = "new york";
		   }
		
		   // Depending on which ROYGBIV color is the user’s favorite, they will 
		   // have a specific mode of transportation (i.e. car, boat, plane, etc.)
			   
			   String drive ="unknown" ;
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
				if ( value == 0){
				String lowerFullname = ( first + second ). toLowerCase();       
				if (lowerFullname.lastIndexOf(1) >= 0 ){
				    bank = "$ 60,000,000" ;
				}else if (lowerFullname.lastIndexOf(2) >= 0){
				    bank = "$ 45,000,000";
				}else if (lowerFullname.lastIndexOf(3) >= 0){
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
		int x ;
		    System.out.println( first + "" + second + "you shall retire"+ values + "years with the total saving of " + bank + ",");
	        System.out.println("You shall call " + zone + " your home. ");
			System.out.println("You shall own a " + drive	+ ", and it will be your only means of transportation. ");
			System.out.println("Would you like another reading?");
		String location2 ="secret";
		Scanner secret ;
		 if(value == 0){
			 String lowerFullname1 =(first + second.toLowerCase());                   
		 }
		} // end of main loop

		Scanner  sc ;
		// Close scanner
	    // if-else 
		
		String  output1 = "";
		output1 =("do you want to say quit or goodbye");
		  if(output.equals("quit")){
		System.out.println("Nobody likes a quitter... So come back when you are ready.");
		} else	{		
			System.out.println("Goodbye");
		}
		   }
   }
			  
	 // end of class {}


   
	

					   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					
		   
			  
			  			  

