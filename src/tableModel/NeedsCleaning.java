//Nathan Hebert 3/25/2018
package tableModel;

public class NeedsCleaning implements TableState {

	TableModel table;
	
	//Constructor
	public NeedsCleaning(TableModel _table) {
		this.table = _table;
	}
	
	//Does nothing, not ready yet.
	public void IsReady() {
		System.out.println("Table is not ready yet.");
	}

	//Just was in use, does nothing, not cleaned yet.
	public void IsInUse() {
		System.out.println("Table is not in use!");
	}

	//Already here
	public void DoesNeedCleaning() {
		System.out.println("Table already needs cleaning.");
	}

	//Sets state if busboy cleans it
	public void IsBeingCleaned() {
		System.out.println("Table now being cleaned.");
		table.setState(table.GetBeingCleaned());
	}

}
