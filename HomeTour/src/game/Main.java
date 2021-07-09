package game;

import java.util.Scanner;

public class Main {
	
	// Main function, declares necessary variables then runs loop that executes code
	public static void main(String[] args) {
		RoomManager roomManager = new RoomManager();
		roomManager.init();
		Scanner userInput = new Scanner(System.in);
		String input = null;
		Player user = new Player(roomManager.startingRoom);
		//user.currentRoom = roomManager.foyer;
		
		System.out.println("Welcome to my house!");
		
		do {
			
			printRoom(user);		
			System.out.println( "Please enter an action:");
			input = parse(collectInput(userInput.nextLine()), user);
			
		} while (input != "QUIT");
		userInput.close();
	}
	
	// Out puts current player location. called in main
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom.getRoomInfo(player.currentRoom));
	}

	// Collects input, returns string array, called in main passing return object to parse()
	private static String[] collectInput(String input) {
		String[] a = input.split(" ");
		return a;
	}
	
	// Where the magic happens, could be broken out to another class, parses input and returns value. defaults to return string that is not
	// 		"Quit" to keep loop going. Should handle all exceptions.
	private static String parse(String[] command, Player player) {
		
		String action = command[0].toUpperCase().intern();
		String details = null;
		

		if (command.length > 1) {
			details = command[1].toUpperCase().intern();
		}
		
		// Checks details against previous room player was in, if they are the same, lets the player know they can't go that way
		//		so it doesn't look like eaten inputs
		if (action == "GO" | action == "MOVE") {
			player.prevRoom = player.currentRoom;
			player.currentRoom = player.currentRoom.getExit(details);
			if (player.currentRoom.equals(player.prevRoom))
				invalidChoice(); 
			return "once more";
			
		// Checks details against intObj attached to each room. each room can only have two objects, could be expanded in Room class.
		} else if (action == "USE") {
			if (player.getCurrentRoom().intObj[0].getName().toUpperCase().intern() == details) {
				System.out.println(player.getCurrentRoom().intObj[0].getFunc());
			}else if (player.getCurrentRoom().intObj[1].getName().toUpperCase().intern() == details) {
				System.out.println(player.getCurrentRoom().intObj[1].getFunc());
			}else
				System.out.println("That object isn't here! Please try again.");
			
		} else if (action == "QUIT") {
			return "QUIT";
		
		//display help command
		}else if (action == "HELP") {
			System.out.println("Input must be formated in a 'verb' 'cardinal direction' or 'use' 'object' syntax"
					+ "\ni.e. 'Go North' or 'Use TV'\nFor more information about a room, type 'more'. To look around, type 'look'");
			invalidChoice();
			return "once more";	
		
		// Displays more details about the current room
		}else if(action == "MORE" ) {
			System.out.println(player.currentRoom);
			return "once more";
			
		// Displays names of useable items in current room, because some rooms only have one item,
		//		throws an exception so the syntax works and null doesn't print out.
		}else if(action == "LOOK") {
			System.out.println("You see a " + player.getCurrentRoom().intObj[0].getName());
			try {
				player.getCurrentRoom().intObj[1].getName().equals(null);
			} catch (Exception e) {
				return "once more";
			}
			System.out.println("and a " + player.getCurrentRoom().intObj[1].getName());
			return "once more";
			
		// Default fall through, meant as a catch all
		}else {
			System.out.println("Please use 'Go' or 'Move' followed by a cardinal direction. For more information, use the Help command.");
			invalidChoice();
			return "once more";
		}
		return "one more time"; // the compiler wasn't happy without this one
			
	}
	
	// Returns if the player makes an invalid choice
	private static void invalidChoice() {
		System.out.println("Let's try again: ");
	}
}
