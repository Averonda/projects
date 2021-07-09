package game;

import fixtures.Room;

public class Player {
	Room currentRoom;
	Room startingRoom;
	Room prevRoom;
	
	// Keeps track of player location, custom constructor
	public Player(Room start) {
		startingRoom = start;
		currentRoom = start;
		prevRoom = start;
	}
	
	// Moves the player to the next room, not used
	public void movePlayer(Room moveTo) {
		currentRoom = moveTo;
	}
	
	// returns current room, called in main and room
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
}
