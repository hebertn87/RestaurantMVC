//Nathan Hebert 3/25/2018
package tableModel;

import java.util.Observable;
import java.util.Observer;

import observerForms.TableStateNotify;

public class TableModel extends Observable implements Observer {
	
	TableState ready;
	TableState inUse;
	TableState needsCleaning;
	TableState beingCleaned;
	TableState state;
	int tablePosition;
	
	//Set's the initial table states
	public TableModel(int _tablePosition) {
		ready = new Ready(this);
		inUse = new InUse(this);
		needsCleaning = new NeedsCleaning(this);
		beingCleaned = new BeingCleaned(this);
		tablePosition = _tablePosition;
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

	@Override
	public void update(Observable arg0, Object arg1) {
		//If busboy
				if(arg1.toString().equals("BusBoyStateNotify"))
						this.getState().toString();
				//If from user
				else {
					if(state.toString().equals("ReadyTable")) {
						state.IsReady();
						this.notifyObservers(new TableStateNotify(tablePosition, getState().toString()));
					
					}
					else if(state.toString().equals("InUseTable")) {
						state.IsInUse();
						this.notifyObservers(new TableStateNotify(tablePosition, getState().toString()));
		
					}
				}
	}
	
}

