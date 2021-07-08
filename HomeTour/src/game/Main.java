package game;

import java.util.Scanner;

public class Main {
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
	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom.getRoomInfo(player.currentRoom));
	}

	private static String[] collectInput(String input) {
		String[] a = input.split(" ");
		return a;
	}
		
	private static String parse(String[] command, Player player) {
		
		String action = command[0].toUpperCase().intern();
		String details = null;

		if (command.length > 1) {
			details = command[1].toUpperCase().intern();
		}

		if (action == "GO" | action == "MOVE") {
			player.currentRoom = player.currentRoom.getExit(details);
			//printRoom(player); 
			return "one more";
		} else if (action == "INTERACT") {
			// What to do when the 'action' specified is to interact
		} else if (action == "QUIT") {
			return "QUIT";
		}else if (action == "HELP") {
			//display help command
		}else {
			System.out.println("Please use 'Go' or 'Move' followed by a cardinal direction.");
			return "one more";
		}
		return "one more time"; // the compiler wasn't happy without this one
			
	}
}
