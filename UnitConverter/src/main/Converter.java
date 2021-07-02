package main;

import java.util.Scanner;


public class Converter {
	public static void main(String[] args) {
		
		int menuSelection;
		String input;
		Scanner scan = new Scanner(System.in);
		
// Main menu, calls functions to make conversions, when finished with conversions, menus move back to here.	Prefer Do/while loops for switch statements
		do {
			System.out.println("Please select an option:\n1.Volume Conversions\n2.Distance Conversions\n3.Temperature Conversions\n0.Quit");
			input = scan.nextLine();
			menuSelection = Integer.parseInt(input); // Figured this out, but left remnants in code to prevent retyping the whole program.
			//menuSelection = input.charAt(0);
			
			
			switch(menuSelection) {
			case 1: volumeConversions();
					menuSelection = 4; // Might not be necessary, but want to ensure program doesn't quit out upon finishing one conversion
					break;
			case 2: distanceConversions();
					menuSelection = 4;
					break;
			case 3: tempConversions();
					menuSelection = 4;
					break;
			case 0: break;
			default: System.out.println("Please make a valid selection: ");
					break;
			}
			
		} while (menuSelection != 0);
	}

// Switch statement from main, used to invoke functions depending on user input, calls volume conversion functions
	private static void volumeConversions() {
		int menuSelection = 1;
		String input;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("Please select an which units to convert:\n1.Teaspoons to Tablespoons\n2.Tablespoons to Cups\n3.Cups to Pints"
				+ "\n0.Quit");
			input = scan.nextLine();
			menuSelection = Integer.parseInt(input);
			
			switch (menuSelection) {
			case 1:
				teaspoons();
				break;
			case 2:
				tablespoons();
				break;
			case 3:
				cups();
				break;
			case 0:
				break;
			default:
				System.out.println("Please make a valid selection:");
				break;
			}
		}while(menuSelection != 0);
	}
// Function to convert from teaspoons to tablespoons, called in volumeConversions
	private static void teaspoons() {
		String input;
		double tsp;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many teaspoons to convert to tablespoons?");
		input = scan.nextLine();
		tsp = Double.parseDouble(input);
		System.out.println(tsp*3.0);
	}

// Function to convert from tablespoons to cups, called in volumeConversions
	private static void tablespoons() {
		String input;
		double tbl;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many tablespoons to convert to cups?");
		input = scan.next();
		tbl = Double.parseDouble(input);
		System.out.println(tbl*16.231);
	}
// Function to convert from cups to pints, called in volumeConversions
	private static void cups() {
		String input;
		double cups;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many cups to convert to pints?");
		input = scan.next();
		cups = Double.parseDouble(input);
		System.out.println(cups*2.0);
	}

// Switch statement from main, used to invoke functions depending on user input, calls distance conversion functions. Char usage because of poor syntax used in parseInt call
	private static void distanceConversions() {
		char menuSelection = '1';
		String input;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Please select an which units to convert:\n1.Miles to Kilometers\n2.Feet to Meters\n3.Miles to Feet"
				+ "\n0.Quit");
			input = scan.nextLine();
			//menuSelection = parseInt(scan.next()); // Can't find parseInt function
			menuSelection = input.charAt(0);
		
			switch (menuSelection) {
			case '1':
				milesToKm();
				break;
			case '2':
				feetToMeters();
				break;
			case '3':
				milesToFeet();
				break;
			case '0':
				break;
			default:
				System.out.println("Please make a valid selection:");
				break;
			}
		}while(menuSelection != '0');
	}

// Function to convert miles to kilometers, called in distanceConversion
	private static void milesToKm() {
		String input;
		double miles;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many miles to convert to kilometers?");
		input = scan.next();
		miles = Double.parseDouble(input);
		System.out.println(miles*1.609);
	}

	// Function to convert feet to meters, called in distanceConversion	
	private static void feetToMeters() {
		String input;
		double feet;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many feet to convert to meters?");
		input = scan.next();
		feet = Double.parseDouble(input);
		System.out.println(feet/3.281);
	}

	// Function to convert miles to feet, called in distanceConversion
	private static void milesToFeet() {
		String input;
		double miles;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many miles to convert to feet?");
		input = scan.next();
		miles = Double.parseDouble(input);
		System.out.println(miles*5280.0);
	}

	// Switch statement from main, used to invoke functions depending on user input, calls temperature conversion functions
	private static void tempConversions() {
		char menuSelection = '1';
		String input;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Please select an which units to convert:\n1.Fahrenheit to Celcius\n2.Celcius to Fahrenheit\n3.Celcius to Kelvin"
				+ "\n0.Quit");
			input = scan.next();
			//menuSelection = parseInt(scan.next()); // Can't find parseInt function
			menuSelection = input.charAt(0);
		
			switch (menuSelection) {
			case '1':
				fahrenheit();
				break;
			case '2':
				celcius();
				break;
			case '3':
				kelvin();
				break;
			case '0':
				break;
			default:
				System.out.println("Please make a valid selection:");
				break;
			}
		}while(menuSelection != '0');
	}

	// Function to convert fahrenheit to celcius, called in tempConversions
	private static void fahrenheit() {
		String input;
		double temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many degrees Fahrenheit to convert to Celcius?");
		input = scan.next();
		temp = Double.parseDouble(input);
		System.out.println((temp-32.0)*(5.0/9.0));
	}

	// Function to convert celcius to farenheit, called in tempConversions
	private static void celcius() {
		String input;
		double temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many degrees Celcius to convert to Farenheit?");
		input = scan.next();
		temp = Double.parseDouble(input);
		System.out.println((temp*(9.0/5.0))+32.0);
	}

	// Function to convert celcius to kelvin, called in tempConversions
	private static void kelvin() {
		String input;
		double temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many degrees Celcius to convert to Kelvin?");
		input = scan.next();
		temp = Double.parseDouble(input);
		System.out.println(temp+273.15);
	}
	
	
}
