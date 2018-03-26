//Nathan Hebert 3/25/2018
package busboyModel;

public class BusboyModel {

	BusboyState offShift;
	BusboyState backroom;
	BusboyState cleaning;
	
	BusboyState state;
	
	//Sets the initial states
	public BusboyModel() {
		offShift = new OffShift(this);
		backroom = new Backroom(this);
		cleaning = new Cleaning(this);
		
		state = offShift;
	}
	
	//Sets the state
	void setState(BusboyState state) {
		this.state = state;
	}
	
	//Returns state
	public BusboyState getState() {
		return state;
	}
	
	//Returns offShift
	public void OffShift() {
		state.GoOffShift();
	}
	
	//Returns cleanBackroom
	public void Backroom() {
		state.CleanBackroom();
	}
	
	//Returns cleanTable method
	public void cleaning() {
		state.CleanTable();
	}
	
	//Returns OffShift
	public BusboyState GetOffShift() {
		return offShift;
	}
	
	//Returns Backroom
	public BusboyState GetBackroom() {
		return backroom;
	}
	
	//Returns Cleaning
	public BusboyState GetCleaning() {
		return cleaning;
	}
	
}
