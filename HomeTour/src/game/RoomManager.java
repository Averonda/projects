package game;

import fixtures.Room;

public class RoomManager {
		
	Room[] rooms = new Room[9];
	Room startingRoom;
	//InteractableObjects interObj[] = new InteractableObjects[2]; //max two per room
	
	// Initializes rooms, called in main
	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"A small foyer",
			"The small entryway of a house." + "\n"
			+ "To the north is a living room. Behind you is a large door.");
			this.rooms[0] = foyer;
			this.startingRoom = foyer;
			//System.out.println("calling setobjinfo");
			this.rooms[0].intObj[0].setObj("Door", "A large wooden door, you try to turn the handle, but try as you might, it won't budge.\nYou are trapped");
			
	        
	    Room livingRoom = new Room("The Living Room", "The main room of the house.",
	    		"A small living room in the main area of the house, to the south you see the Foyer,"
	    		+ "to the east the Kitchen, to the north a hallway to the living quarters and to the "
	    		+ "west, the garage. You see a TV and remote.");
	    		this.rooms[1] = livingRoom;
	    		this.rooms[1].intObj[0].setObj("Remote", "You hit the power button, the TV snaps to life with a loud crack.\nThere is nothing"
	    				+ " but snow. As you move closer a face starts to form in the static... It mouths the words slowly.\nGET OUT\n"
	    				+ "The TV turns itself off.");
	    		this.rooms[1].intObj[1].setObj("TV", "You try to interact with the TV, it does nothing.");
	    
	    Room kitchen = new Room("The Kitchen", "Where the food is made",
	    		"A decent sized kitchen, has all the amenities that one could ask"
	    		+ "for, a refridgerator and a stove. Your bog-standard kitchen.");
	    		this.rooms[2] = kitchen;
	    		this.rooms[2].intObj[0].setObj("Refridgerator", "You can already smell the decay as you walk towards the appliance."
	    				+ "You don't dare look inside");
	    		this.rooms[2].intObj[1].setObj("Stove", "You barely make it to the stove before the gas flames erupt.\n"
	    				+ "You decide to leave it untouched");
	    		
	    Room garage = new Room("The Garage", "A normal garage", "A two car garage that"
	    		+ "has the normal oil stains on the concrete floor. You see a workbench "
	    		+ "under a window to the west. You see a door to the backyard to the north");
	    		this.rooms[3] = garage;
	    		this.rooms[3].intObj[0].setObj("Workbench", "As you approach the work bench on the other side of the garage, you get a closer look"
	    				+ " at the stains on the floor, they are a dark amber, much to red to have come from a car.");
	    		this.rooms[3].intObj[1].setObj("Window", "The window is small, letting in just enough light to reveal all the dust hanging in the "
	    				+ "air. You think you might be able to escape but the pane has been painted over... The window won't budge.");
	    
	    Room hallway = new Room("The Hallway", "A short hallway that connects the livingroom"
	    		+ " to the bedroom, there is a bathroom to the east.", "A short hallway,"
	    		+ " there is a bathroom halfway down to the east. The only decotation is a small painting hanging on the wall across from the bathroom");
	    		this.rooms[4] = hallway;
	    		this.rooms[4].intObj[1].setObj("Painting", "You feel like you are being watched as you approach this patricarichal painting.");
	    		
	    Room bedroom = new Room("The Bedroom", "A simple bedroom","A large room"
	    		+ " for sleeping, you see a large bed in the center of the room");
	    		this.rooms[5] = bedroom;
	    		this.rooms[5].intObj[1].setObj("Bed", "The bed is made, white linnens like out of a dream. The sunbeams from the window "
	    				+ "dance across it's surface. You start to feel tired, a warm hum starts to invade your skull as you move closer...");
	    		
	    Room bathroom = new Room("The Bathroom", "A full bath", "A full size bathroom with a mirror over the sink and a large tub with a shower.");
	    		this.rooms[6] = bathroom;
	    		this.rooms[6].intObj[0].setObj("Mirror", "The mirror above the sink is suprisingly clean, but as you look closer, you realize it "
	    				+ "isn't you looking back, there's something wrong with your reflection...");
	    		this.rooms[6].intObj[1].setObj("Shower", "You turn on the shower the foul expulsions of thick, heavy liquid make you retch.");
	    
	    
	    Room backyard = new Room("The Backyard", "A pleasent lawn and patio behind the house", "You step out of the garage"
	    		+" onto a patio that covers the entire backside of the house, you can see a shed to the north.\n"
	    		+ "You see a tree next to the shed and a sandbox on the opposite side of the yard");
	    		this.rooms[7] = backyard;
	    		this.rooms[7].intObj[0].setObj("Tree", "A tall, strong oak stands before you, gentely casting a shadow over the entire yard. "
	    				+ "\nA calm scene at last.");
	    		this.rooms[7].intObj[1].setObj("Sandbox", "Sandboxes like this aren't very common anymore, you ");
	    		
	    Room shed = new Room("The Shed", "A simple tool shed", "This shed houses a varity of lawn care and house maintence items.");
	    		this.rooms[8] = shed;
	    		this.rooms[8].intObj[0].setObj("Trapdoor", "You try to use the trap door, it is your only escape, after all. As you"
	    				+ " slowly lower your self down into the cavern, you slip. Darkness has engulfed you.");
	    		this.rooms[8].intObj[1].setObj("Door", "The door snaps shut behind you. The only way out is the trapdoor in the middle of the floor.");
	    
	    // sets the exits of each room
	    foyer.setExits(livingRoom, foyer, foyer, foyer);
	    livingRoom.setExits(hallway, kitchen, foyer, garage);
	    kitchen.setExits(kitchen, kitchen, kitchen, livingRoom);
	    garage.setExits(backyard, livingRoom, garage, garage);
	    hallway.setExits(bedroom, bathroom, livingRoom, hallway);
	    bedroom.setExits(bedroom, bedroom, hallway, bedroom);
	    bathroom.setExits(bathroom, bathroom, bathroom, hallway);
	    backyard.setExits(shed, backyard, garage, backyard);
	    shed.setExits(shed, shed, shed, shed);
	    
	    
	}
	
	// Depreciated
	//void setRoomObjects(){
		
	//}
	
}
