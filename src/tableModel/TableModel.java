//Nathan Hebert 3/25/2018
package tableModel;

public class TableModel {
	
	TableState ready;
	TableState inUse;
	TableState needsCleaning;
	TableState beingCleaned;
	TableState state;
	
	//Set's the initial table states
	public TableModel() {
		ready = new Ready(this);
		inUse = new InUse(this);
		needsCleaning = new NeedsCleaning(this);
		beingCleaned = new BeingCleaned(this);
		
		state = ready;
	}
	
	//Sets the state
	void setState(TableState state) {
		this.state = state;
	}
	
	//Gets the current state
	public TableState getState() {
		return state;
	}
	
	//Returns method is ready
	public void Ready() {
		state.IsReady();
	}
	
	//returns method in use
	public void InUse() {
		state.IsInUse();
	}
	
	//Returns method needs cleaning
	public void NeedsCleaning() {
		state.DoesNeedCleaning();
	}
	
	//Gets being cleaned method
	public void BeingCleaned() {
		state.IsBeingCleaned();
	}
	
	//Returns ready state
	public TableState GetReady() {
		return ready;
	}
	
	//Returns inUse
	public TableState GetInUse() {
		return inUse;
	}
	
	//Returns needs cleaning
	public TableState GetNeedsCleaning() {
		return needsCleaning;
	}
	
	//Returns being cleaned
	public TableState GetBeingCleaned() {
		return beingCleaned;
	}
	
}

