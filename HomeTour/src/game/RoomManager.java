package game;

import fixtures.Room;

public class RoomManager {
		
	Room[] rooms = new Room[7];
	Room startingRoom;
	
	
	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
			this.rooms[0] = foyer;
			this.startingRoom = foyer;
	        
	    Room livingRoom = new Room("The Living Room", "The main room of the house.",
	    		"A small living room in the main area of the house, to the south you see the Foyer,"
	    		+ "to the east the Kitchen, to the north a hallway to the living quarters and to the "
	    		+ "west, the garage.");
	    		this.rooms[1] = livingRoom;
	    
	    Room kitchen = new Room("The Kitchen", "Where the food is made",
	    		"A decent sized kitchen, has all the amenities that one could ask"
	    		+ "for, a refridgerator, an oven and a microwave. Your bog-standard kitchen.");
	    		this.rooms[2] = kitchen;
	    		
	    Room garage = new Room("The Garage", "A normal garage", "A two car garage that"
	    		+ "has the normal oil stains on the concrete floor. You see a workbench "
	    		+ "under a window to the west.");
	    		this.rooms[3] = garage;
	    
	    Room hallway = new Room("The Hallway", "A short hallway that connects the livingroom"
	    		+ " to the bedroom, there is a bathroom to the west.", "A short hallway,"
	    		+ " there is a bathroom halfway down to the west.");
	    		this.rooms[4] = hallway;
	    
	    Room bedroom = new Room("The Bedroom", "A simple bedroom","A large room"
	    		+ " for sleeping, you see a large bed in the center of the room");
	    		this.rooms[5] = bedroom;
	    
	    Room bathroom = new Room("The Bathroom", "A full bath", "A full size bathroom");
	    		this.rooms[6] = bathroom;
	    
	    
	    foyer.setExits(livingRoom, foyer, foyer, foyer);
	    livingRoom.setExits(hallway, kitchen, foyer, garage);
	    kitchen.setExits(kitchen, kitchen, kitchen, livingRoom);
	    garage.setExits(garage, livingRoom, garage, garage);
	    hallway.setExits(bedroom, bathroom, livingRoom, hallway);
	    bedroom.setExits(bedroom, bedroom, hallway, bedroom);
	    bathroom.setExits(bathroom, bathroom, bathroom, hallway);
	    
	    
	    
	}
	
}
