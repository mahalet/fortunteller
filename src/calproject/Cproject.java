package calproject;

import java.util.Scanner;

public class Cproject {

	public static void main(String[]args){
		
		
	      Scanner sc = new Scanner(System.in);
	 
         // Initialize Scanner class, remember to close Scanner
		// Allow an exit by entering "Quit" (case insensitive)
		System.out.println("Welcome to Fortune Teller. Enter \"Quit\" to leave.");

		// Allow a restart by entering "Restart" (case insensitive)
		System.out.println("Enter \"Restart\" at any point to start over.");

		// Initialize String to compare user input to conditionals for loop
		String answer = "foo"; //Give the String a value for methods later

		boolean uPlay = true;

		while (uPlay) {

			// PART 1: User inputs
			// Ask the user for the user’s first name
			System.out.println("What is your first name?");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Restart")) {
				continue;
			}
			if (answer.equalsIgnoreCase("Quit")) {
				break;
			}
			String fName = answer;

			// Ask the user for the user’s last name
			System.out.println("That is one of my favorite names. What is your last name?");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Restart")) {
				continue;
			}
			if (answer.equalsIgnoreCase("Quit")) {
				break;
			}
			String lName = answer;

			// Ask the user for the user’s age
			System.out.println("How old are you?");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Restart")) {
				continue;
			}
			if (answer.equalsIgnoreCase("Quit")) {
				break;
			}
			int age = Integer.parseInt(answer);

			// Ask the user for the user’s birth month
			System.out.println("What month were you born? (Use letters, not numerals)");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Restart")) {
				continue;
			}
			if (answer.equalsIgnoreCase("Quit")) {
				break;
			}
			String bMonthFirstLetter = answer.substring(0, 1).toLowerCase();
			String bMonthSecondLetter = answer.substring(1, 2).toLowerCase();
			String bMonthThirdLetter = answer.substring(2, 3).toLowerCase();

			// Ask the user for the user’s favorite ROYGBIV color
			// If the user does not know what ROYGBIV is, ask them to enter
			// “Help” (print with the quotation marks) to get a list of the
			// ROYGBIV colors
			System.out.println("What is your favorite ROYGBIV color? Enter \"Help\" for a list to choose from.");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Restart")) {
				continue;
			}
			if (answer.equalsIgnoreCase("Quit")) {
				break;
			}
			if (answer.equalsIgnoreCase("Help")) {
				System.out.println("[R] Red\n[O] Orange\n[Y] Yellow\n[G] Green\n[B] Blue\n[I] Indigo\n[V] Violet");
				answer = sc.nextLine();
			}
			char uColor = answer.toUpperCase().charAt(0);
			// Ask the user for the number of siblings the user has
			System.out.println("How many siblings do you have?");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Restart")) {
				continue;
			}
			if (answer.equalsIgnoreCase("Quit")) {
				break;
			}
			int nSiblings = Integer.parseInt(answer);

			// Part 2
			//
			// If the user’s age is an odd number, then they will retire in ____
			// years, or ___ years if their age is an even number.
			int rYears;
			if (age % 2 == 0) {
				rYears = 12;
			} else {
				rYears = 21;
			}

			// If the user’s number of siblings is 0, then they will live in
			// __(location), or 1 then they will live in __(location), or 2 then
			// they will live in ___ (location), or 3 then they will live in ___
			// (location), or more than 3 then they will live in ____
			// (location).
			String destination = "Unknown"; // initialize String so call later will definitely have a value
			if (nSiblings == 0) {
				destination = "Dayton";
			}
			if (nSiblings == 1) {
				destination = "New York City";
			}
			if (nSiblings == 2) {
				destination = "Seattle";
			}
			if (nSiblings == 3) {
				destination = "Toronto";
			}
			if (nSiblings > 3) {
				destination = "Miami";
			}

			// Depending on which ROYGBIV color is the user’s favorite, they
			// will have a specific mode of transportation (i.e. car, boat,
			// plane, etc.)
			String t = "nothing";
			switch (uColor) {

			case 'R':
				t = "seaplane";
				break;
			case 'O':
				t = "scooter";
				break;
			case 'Y':
				t = "car";
				break;
			case 'G':
				t = "bicycle";
				break;
			case 'B':
				t = "boat";
				break;
			case 'I':
				t = "submarine";
				break;
			case 'V':
				t = "space shuttle";
				break;
			default:
				t = "broken skateboard";
				break;
			}

			// If the first letter of the user’s birth month can be found in
			// either their first or last name, then they will have $____ in the
			// bank, or if the second letter of the user’s birth month can be
			// found in either the user’s first or last name, then they will
			// have $____ in the bank, or if the third letter of the user’s
			// birth month can be found in either the user’s first or last name,
			// then they will have $____ in the bank. If there are no common
			// letters, then they will have $____ in the bank.
			String bank;
			// Convert name to lowercase for the search
			String lowerFullName = (fName + lName).toLowerCase();
			if (lowerFullName.indexOf(bMonthFirstLetter) >= 0) {
				bank = "$30,000,000";
			} else if (lowerFullName.indexOf(bMonthSecondLetter) >= 0) {
				bank = "$20,000,000";
			} else if (lowerFullName.indexOf(bMonthThirdLetter) >= 0) {
				bank = "$10,000,000";
			} else {
				bank = "$20";
			}
			// Part 3
			//
			// The user’s fortune should be written as such:
			// [First Name] [Last Name] will retire in [# of Years] with [Amount
			// of Money] in the bank, a vacation home in [Location] and a [Mode
			// of Transportation].
			// After telling the user’s fortune, ask the user if they would like
			// to try again. If they would then the program should start over,
			// otherwise the program should end.
			// Program should be able to handle whether or not a user inputs
			// capital or lowercase letters.

			System.out.print(fName + " " + lName + ", you shall retire in "	+ rYears + " years with total savings of " + bank + ". ");
			System.out.print("You shall call " + destination + " your home. ");
			System.out.println("You shall own a " + t	+ ", and it will be your only means of transportation. ");
			System.out.println("Would you like another reading?");
			answer = sc.nextLine();
			uPlay = (answer.toUpperCase().charAt(0) == 'Y' || answer.equalsIgnoreCase("Restart")); // assign true/false to uPlay

		} // end of main loop

		// Close scanner
		sc.close();

		if (answer.equalsIgnoreCase("Quit")) {
			System.out.println("Nobody likes a quitter... So come back when you are ready.");
		} else {
			System.out.println("Goodbye");
		}

	} // end of class {}



	}

