package fixtures;



public class Room extends Fixture {
	
	Room[] exits;
	public InteractableObjects intObj[] = new InteractableObjects[2];
	
	// Constructor, included mistakes to demonstrate thought process
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[5]; // size is your choice
		//this.intObj = new InteractableObjects[2]; // max 2 per room
		//System.out.println("Created intObj");
		this.intObj[0] = new InteractableObjects();
		this.intObj[1] = new InteractableObjects();
	}
	
	//public Room() {
	//	this.name = null;
	//	this.shortDescription = null;
	//	this.longDescription = null;
	//}
	
	// Returns array of rooms that serve as exits
	public Room[] getExits() {
		return exits;
	}
	
	// Returns the room object that corresponds to the selected exit. called in game.main.parse(). Should be in a different class
	public Room getExit(String direction) {
		direction = direction.toLowerCase();
		if (direction.equals("north")) {
			return exits[0];
		}else if (direction.equals("east")) {
			return exits[1];
		}else if (direction.equals("south")) {
			return exits[2];
		}else if (direction.equals("west")) {
			return exits[3];
		}else
			return exits[4];
	}
	
	// Displays current room, called in game.Main()
	public String getRoomInfo(Room currentRoom) {
		return ("\nCurrent Room:\n" + this.name +"\n"+ this.shortDescription + "\n");
	}
	
	// Sets the exits of each room, called in game.RoomManager
	public void setExits(Room north, Room east, Room south, Room west) {
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;
		this.exits[4] = this;
	}
	
	// Sets room info in case of a dynamic room creation, currently not used
	public void setRoomInfo(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.exits = new Room[5];
	}
	
	// No longer used, was functional prior to latest refactor
	public void setObjInfo(String name, String func) {
//		try { this.intObj[0].getName().equals(this.intObj[0].getName());		
//		} catch (Exception e) {
//			 TODO: handle exception
//			this.intObj[0].setObj(name, func);
//		}  
//		this.intObj[1].setObj(name, func);
//		System.out.println("Attempting to instanciate intObj");
//		if (intObj[0].getName().equals("holder")) {
//			intObj[1].setObj(name, func);
//		}else
//			intObj[0].setObj(name, func);
	}
	
	@Override
	public String toString() {
		return longDescription;
	}
}
