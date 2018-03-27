//Nathan Hebert 3/25/2018
package busboyModel;

import java.util.Observable;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Observer;

import observerForms.TableStateNotify;
import tableModel.TableModel;

public class BusboyModel extends Observable implements Observer, Runnable{

	TableModel[] tables;							//Table array, busBoy will change states of tables
	public Queue<TableModel> tablesToClean = new ArrayBlockingQueue<TableModel>(6);
	
	BusboyState offShift;
	BusboyState backroom;
	BusboyState cleaning;
	
	BusboyState state;
	
	//Sets the initial states
	public BusboyModel(TableModel[] _tables) {
		offShift = new OffShift(this);
		backroom = new Backroom(this);
		cleaning = new Cleaning(this);
		
		tables = _tables;
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
	
	/*
	** Update functions to fulfill Observer interface
	** Listens to tables, when table becomes dirty add it to queue
	** If not dirty, do nothing
	*/
	@Override
	public void update(Observable arg0, Object arg1) {
		//if from table
		if(arg1.toString().equals("TableStateNotify")) {
			tablesToClean.add(tables[((TableStateNotify) arg1).tablePosition]);
		}
		else
			//if something else only update if in a capable state
			if(state.toString().equals("OffShiftState"))
				state.GoOffShift();
	}

	@Override
	public void run() {
		state.run();
	}
}
