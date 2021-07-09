package fixtures;

public class InteractableObjects {
	
	//private static String func;
	String func;
	String name;
	
	// Creates the objects
	InteractableObjects() {
		super();
//		System.out.println("creating intObjs");
//		this.func = "place";
//		this.name = "holder";
	}

	// Standard getters and setters
	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObj() {
		return name + "\n" + func;
	}
	
	// Called in game.RoomManager
	public void setObj(String name, String func) {
		this.name = name;
		this.func = func;
	}
	
//	@Override
//	public String toString() {
//		return getObj();
//	}
}

	
	

