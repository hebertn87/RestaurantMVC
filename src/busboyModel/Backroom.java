package busboyModel;

public class Backroom implements BusboyState {

	BusboyModel busboy;
	
	//State code for Cleaning constructor
	public Backroom(BusboyModel _busboy) {
		this.busboy = _busboy;
	}
	
	//Will go off shift if end
	public void GoOffShift() {
		System.out.println("Going off shift. Goodbye.");
		busboy.setState(busboy.offShift);
	}

	//If done cleaning table, call cleanBackroom
	public void CleanBackroom() {
		System.out.println("You are already cleaning the backroom.");
	}

	//Does nothing, already cleaning table
	public void CleanTable() {
		System.out.println("Cleaning table.");
		busboy.setState(busboy.GetCleaning());
	}

	//Calls exception if thrown
	public void exeption() {
		System.out.println("Error");
	}

}
