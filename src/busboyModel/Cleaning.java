//Nathan Hebert 3/25/2018
//This is the Cleaning state for the busboy model
package busboyModel;

public class Cleaning implements BusboyState {

	BusboyModel busboy;
	
	//State code for Cleaning constructor
	public Cleaning(BusboyModel _busboy) {
		this.busboy = _busboy;
	}
	
	//Does nothing, outputs message
	public void GoOffShift() {
		System.out.println("You cannot be Off shift if you are cleaning.");
	}

	//If done cleaning table, call cleanBackroom
	public void CleanBackroom() {
		System.out.println("You are now cleaning the backroom.");
		busboy.setState(busboy.GetBackroom());
	}

	//Does nothing, already cleaning table
	public void CleanTable() {
		System.out.println("You are already cleaning a table.");
	}

	//Calls exception if thrown
	public void exeption() {
		System.out.println("Error.");
	}
	
	

}
