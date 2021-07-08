package fixtures;

public class Room extends Fixture {
	
	Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[5]; // size is your choice
	}
	
	//public Room() {
	//	this.name = null;
	//	this.shortDescription = null;
	//	this.longDescription = null;
	//}
		
	public Room[] getExits() {
		return exits;
	}
		
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
	
	public String getRoomInfo(Room currentRoom) {
		return ("Current Room:\n" + this.name +"\n"+ this.shortDescription +"\n"+ this.longDescription);
	}
	
	
	public void setExits(Room north, Room east, Room south, Room west) {
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;
		this.exits[4] = this;
	}
	
	public void setRoomInfo(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.exits = new Room[5];
	}
}
