package busboyModel;

public class OffShift implements BusboyState {

		BusboyModel busboy;
		
		//State code for Cleaning constructor
		public OffShift(BusboyModel _busboy) {
			System.out.println("");
			this.busboy = _busboy;
		}
		
		//Does nothing, outputs message
		public void GoOffShift() {
			System.out.println("You cannot be Off shift if you are cleaning.");
		}

		//If done cleaning table, call cleanBackroom
		public void CleanBackroom() {
			System.out.println("You are now on shift.");
			busboy.setState(busboy.GetBackroom());
		}
		
		//Does nothing, already cleaning table
		public void CleanTable() {
			System.out.println("You are offshift, you cannot clean a table.");
		}

		//Calls exception if thrown
		public void exeption() {
			System.out.println("Error.");
		}

}
