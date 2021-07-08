package game;

import fixtures.Room;

public class Player {
	Room currentRoom;
	Room startingRoom;
	
	public Player(Room start) {
		startingRoom = start;
		currentRoom = start;
	}
	
	public void movePlayer(Room moveTo) {
		currentRoom = moveTo;
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
}
