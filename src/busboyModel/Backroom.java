//Nathan Hebert 3/25/2018
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

	@Override
	public void run() {
		boolean busBoyNothingToDoButCleanKitchen = true;
		while(busBoyNothingToDoButCleanKitchen) {
			System.out.println("Bus boy is cleaning kitchen");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!busboy.tablesToClean.isEmpty()) {
				busBoyNothingToDoButCleanKitchen = false;
				busboy.setState(busboy.GetCleaning());
			}
		}
	}

}
