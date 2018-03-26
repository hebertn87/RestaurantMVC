package tableModel;

public class Ready implements TableState {

	TableModel table;
	
	//Constructor
	public Ready(TableModel _table) {
		this.table = _table;
	}
	
	//Does nothing, already here.
	public void IsReady() {
		System.out.println("Table is already ready.");
	}

	//Sets ready to now in use
	public void IsInUse() {
		System.out.println("Table is now in use.");
		table.setState(table.GetInUse());
	}

	//Does nothing
	public void DoesNeedCleaning() {
		System.out.println("Table does not need cleaning");
	}

	//Does nothing
	public void IsBeingCleaned() {
		System.out.println("Table does not need to be cleaned.");
	}
	
}
